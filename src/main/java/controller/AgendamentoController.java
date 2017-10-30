/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cabelereiro;
import model.JPAUtil;
import model.Servico;

/**
 *
 * @author Athos
 */
@WebServlet(name = "AgendamentoController", urlPatterns = {"/AgendamentoController"})
public class AgendamentoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        
        List<Cabelereiro> cab = em.createQuery("select c from Cabelereiro c").getResultList();
        List<Servico> serv = em.createQuery("select s from Servico s").getResultList();
        
        request.setAttribute("listaCabelereiro", cab);
        request.setAttribute("listaServico", serv);
        
        request.getRequestDispatcher("Cliente/agendamento.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
