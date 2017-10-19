/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cabelereiro;

/**
 *
 * @author Athos
 */
@WebServlet(name = "VerCabelereiroController", urlPatterns = {"/VerCabelereiroController"})
public class VerCabelereiroController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("codigo"));
        Cabelereiro cab = new RetornaUsuario().getCabelereiro(id);
        
        request.setAttribute("cab", cab);
        
        response.sendRedirect("/Gerente/editarCabelereiro.jsp");
    }

}
