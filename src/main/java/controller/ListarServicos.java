/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.JPAUtil;
import model.Servico;

/**
 *
 * @author Athos
 */
@WebServlet(name = "ListarServicos", urlPatterns = {"/ListarServicos"})
public class ListarServicos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        
        List<Servico> lista = em.createQuery("select s from Servico s").getResultList();
        
        request.setAttribute("lista", lista);
        
        request.getRequestDispatcher("Gerente/listaServicos.jsp").forward(request, response);
    }

}
