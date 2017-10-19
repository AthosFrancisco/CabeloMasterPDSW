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
import model.Cabelereiro;
import model.Endereco;
import model.Gerente;
import model.JPAUtil;

/**
 *
 * @author Athos
 */
@WebServlet(name = "CabelereiroController", urlPatterns = {"/CabelereiroController"})
public class CabelereiroController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer id = Integer.parseInt(request.getParameter("codigo"));
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        String cep = request.getParameter("cep");
        String logradouro = request.getParameter("logradouro");
        String bairro = request.getParameter("bairro");
        Integer numero = Integer.parseInt(request.getParameter("numero"));
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        
        Integer idGerente = ((Gerente) request.getSession().getAttribute("usuario")).getId();
        Gerente g = new RetornaUsuario().getGerente(idGerente);

        Cabelereiro cab = new RetornaUsuario().getCabelereiro(id);
        cab.setNome(nome);
        cab.setEmail(email);
        cab.setSenha(senha);
        cab.setEndereco(new Endereco(cep, logradouro, bairro, numero, complemento, cidade, estado));
        cab.setGerente(g);
        
        if(g.getCabelereiro().contains(cab)){
            EntityManager em = JPAUtil.getInstance().getEntityManager();
            //em.clear();
            em.getTransaction().begin();
            em.merge(cab);
            em.getTransaction().commit();
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
