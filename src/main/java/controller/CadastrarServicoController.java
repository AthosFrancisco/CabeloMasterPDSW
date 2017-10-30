/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Gerente;
import model.JPAUtil;
import model.Servico;
import model.Subservico;

/**
 *
 * @author Athos
 */
@WebServlet(name = "CadastrarServicoController", urlPatterns = {"/CadastrarServicoController", "/ServicoController"})
public class CadastrarServicoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomeServico = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String tempoMedio = request.getParameter("tempomedio");
        String pausa = request.getParameter("pausa");
        String tempoRestante = request.getParameter("temporestante");
        
        SimpleDateFormat data = new SimpleDateFormat("HH:mm");
        Servico servico = null;
                
        try{
            servico = new Servico(nomeServico, descricao, data.parse(tempoMedio), data.parse(pausa), data.parse(tempoRestante));
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        Integer qtdServ = Integer.parseInt(request.getParameter("qtdsub"));
        for(int i = 1; i <= qtdServ; i++){
            
            String nomeSub = request.getParameter("nomeSub"+i);
            String valorSub = request.getParameter("valorSub"+i);
            
            Subservico sub = new Subservico(nomeSub, Float.parseFloat(valorSub));
            
            servico.setSubServ(sub);
        }
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        Gerente g = em.find(Gerente.class, ((Gerente)request.getSession().getAttribute("usuario")).getId());
        g.cadastrarServico(servico);
        
        List<Servico> lista = em.createQuery("select s from Servico s").getResultList();
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("Gerente/listaServicos.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("codigo"));

        EntityManager em = JPAUtil.getInstance().getEntityManager();
        Gerente g = em.find(Gerente.class, ((Gerente) request.getSession().getAttribute("usuario")).getId());
        Servico servico = em.find(Servico.class, id);
        g.excluirServico(servico);

        request.getRequestDispatcher("ListarServicos").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
