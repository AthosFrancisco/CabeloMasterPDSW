/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Athos
 */
@WebServlet(name = "CadastrarServicoController", urlPatterns = {"/CadastrarServicoController", "/ServicoController"})
public class CadastrarServicoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String r = request.getParameter("value");
        
        SimpleDateFormat data = new SimpleDateFormat("HH:mm");
        
        JSONArray array = new JSONArray(r);
        JSONObject objeto = array.getJSONObject(0);
        
        String nomeServico = objeto.getString("nome");
        String descricao = objeto.getString("descricao");
        String tempoMedio = objeto.getString("tempomedio");
        String pausa = objeto.getString("pausa");
        String tempoRestante = objeto.getString("temporestante");
        
        Servico servico = null;
                
        try{
            servico = new Servico(nomeServico, descricao, data.parse(tempoMedio), data.parse(pausa), data.parse(tempoRestante));
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        for(int i = 1; i < array.length(); i++){
            JSONObject obj = array.getJSONObject(i);
            
            String nomeSub = obj.getString("nome");
            String valor = obj.getString("valor");
            
            Subservico sub = new Subservico(nomeSub, Float.parseFloat(valor));
            
            servico.setSubServ(sub);
        }
        
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        Gerente g = em.find(Gerente.class, ((Gerente)request.getSession().getAttribute("usuario")).getId());
        g.cadastrarServico(servico);
        
        request.getRequestDispatcher("ListarServicos").forward(request, response);
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
