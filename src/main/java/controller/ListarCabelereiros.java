/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Gerente;

/**
 *
 * @author Athos
 */
@WebServlet(name = "ListarCabelereiros", urlPatterns = {"/ListarCabelereiros"})
public class ListarCabelereiros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Gerente gerente = new RetornaUsuario().getGerente(((Gerente) request.getSession().getAttribute("usuario")).getId());
        
        request.setAttribute("lista", gerente.getCabelereiro());
        
        request.getRequestDispatcher("Gerente/listaCabelereiros.jsp").forward(request, response);
    }


}
