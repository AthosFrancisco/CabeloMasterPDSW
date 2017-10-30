/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "EditarServicoController", urlPatterns = {"/EditarServicoController"})
public class EditarServicoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");

        EntityManager em = JPAUtil.getInstance().getEntityManager();

        Integer id = Integer.parseInt(request.getParameter("codigo"));

        Servico s = em.find(Servico.class, id);

        if (acao != null && acao.equals("remover")) {

            for (int i=0; i<s.getSubServ().size();i++) {
                Subservico sub = s.getSubServ().get(i);
                
                String codigoItem = request.getParameter("codigoItem");

                System.out.println(s.getSubServ().get(i).toString());
                System.out.println(codigoItem);

                if (s.getSubServ().get(i).toString().equals(codigoItem)) {
                    em.getTransaction().begin();
                    s.getSubServ().remove(sub);
                    em.getTransaction().commit();
                    break;
                }
            }
        }
        s = em.find(Servico.class, id);
        request.setAttribute("servico", s);
        request.getRequestDispatcher("Gerente/editarServico.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("codigo"));
        String nomeServico = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String tempoMedio = request.getParameter("tempomedio");
        String pausa = request.getParameter("pausa");
        String tempoRestante = request.getParameter("temporestante");

        SimpleDateFormat data = new SimpleDateFormat("HH:mm");

        EntityManager em = JPAUtil.getInstance().getEntityManager();
        Servico servico = em.find(Servico.class, id);
        servico.setNomeServico(nomeServico);
        servico.setDescricao(descricao);

        try {
            servico.setTempoMedioAtendimento(data.parse(tempoMedio));
            servico.setPausa(data.parse(pausa));
            servico.setTempoRestanteAtendimento(data.parse(tempoRestante));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Integer qtdServ = Integer.parseInt(request.getParameter("qtdsub"));
        for (int i = 1; i <= qtdServ; i++) {

            String nomeSub = request.getParameter("nomeSub" + i);
            String valorSub = request.getParameter("valorSub" + i);

            Subservico sub = new Subservico(nomeSub, Float.parseFloat(valorSub));

            servico.setSubServ(sub);
        }

        List<Servico> lista = em.createQuery("select s from Servico s").getResultList();
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("Gerente/listaServicos.jsp").forward(request, response);
    }

}
