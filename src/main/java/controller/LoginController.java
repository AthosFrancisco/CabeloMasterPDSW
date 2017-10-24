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
import javax.servlet.http.HttpSession;
import model.Cabelereiro;
import model.Cliente;
import model.Gerente;

/**
 *
 * @author Athos
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession(false) != null) {
            request.getSession().invalidate();
        }

        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String tipo = request.getParameter("tipo");

        RetornaUsuario result = new RetornaUsuario(login, senha);

        if (tipo.toUpperCase().equals("GERENTE")) {
            Gerente gerente = result.getGerente();
            sessao.setAttribute("usuario", gerente);
            response.sendRedirect("Gerente/index.jsp");
        } else if (tipo.toUpperCase().equals("CABELEREIRO")) {
            Cabelereiro cabelereiro = result.getCabelereiro();
            sessao.setAttribute("usuario", cabelereiro);
            response.sendRedirect("Cabelereiro/index.jsp");
        } else if (tipo.toUpperCase().equals("CLIENTE")) {
            Cliente cliente = result.getCliente();
            sessao.setAttribute("usuario", cliente);
            response.sendRedirect("Cliente/index.jsp");
        } else {

        }
    }

}
