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
import model.Cliente;
import model.Endereco;
import model.JPAUtil;

/**
 *
 * @author Athos
 */
@WebServlet(name = "CadastroController", urlPatterns = {"/CadastroController"})
public class CadastroController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String cpf = request.getParameter("cpf");
        char sexo = request.getParameter("sexo").charAt(0);
        
        String cep = request.getParameter("cep");
        String logradouro = request.getParameter("logradouro");
        String bairro = request.getParameter("bairro");
        Integer numero = Integer.parseInt(request.getParameter("numero"));
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        
        Cliente cliente = new Cliente(nome, cpf, email, senha, sexo);
        cliente.setEndereco(new Endereco(cep, logradouro, bairro, numero, complemento, cidade, estado));
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        
        em.clear();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        
        request.getSession().setAttribute("usuario", cliente);
        
        response.sendRedirect("Cliente/index.jsp");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
