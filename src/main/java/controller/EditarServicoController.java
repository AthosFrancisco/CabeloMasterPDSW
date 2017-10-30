/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "EditarServicoController", urlPatterns = {"/EditarServicoController"})
public class EditarServicoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer id = Integer.parseInt(request.getParameter("codigo"));
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        
        Servico s = em.find(Servico.class, id);
        
        request.setAttribute("servico", s);
        
        request.getRequestDispatcher("Gerente/editarServico.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
