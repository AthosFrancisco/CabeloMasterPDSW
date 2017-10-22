/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Gerente;
import model.Cabelereiro;
import model.JPAUtil;

/**
 *
 * @author Athos
 */
@WebServlet(name = "ExcluirCabelereiroController", urlPatterns = {"/ExcluirCabelereiroController"})
public class ExcluirCabelereiroController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer id = Integer.parseInt(request.getParameter("codigo"));
        
        Cabelereiro c = new RetornaUsuario().getCabelereiro(id);
        
        Gerente g = new RetornaUsuario().getGerente(((Gerente) request.getSession().getAttribute("usuario")).getId());
        
        g.excluirCabelereiro(c);
        
        request.getRequestDispatcher("Gerente/ListarCabelereiros").forward(request, response);
    }

}
