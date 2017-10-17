/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cabelereiro;
import model.Cliente;
import model.Gerente;
import model.JPAUtil;

/**
 *
 * @author Athos
 */
public class RetornaUsuario {
    
    public RetornaUsuario(){
    }
    
    public RetornaUsuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    private static String login;
    private static String senha;
    private static EntityManager em;
    
    public Gerente getGerente(){
        
        em = JPAUtil.getEntityManager();
        
        Query q = em.createQuery("select g from Gerente g where g.email = :login and g.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
        
        return (Gerente) q.getSingleResult();
    }
    
    public Cabelereiro getCabelereiro(){
        
        em = JPAUtil.getEntityManager();
        
        Query q = em.createQuery("select c from Cabelereiro c where c.email = :login and c.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
        
        return (Cabelereiro) q.getSingleResult();
    }
    
    public Cliente getCliente(){
        
        em = JPAUtil.getEntityManager();
        
        Query q = em.createQuery("select c from Cliente c where c.email = :login and c.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
        
        return (Cliente) q.getSingleResult();
    }

    public Gerente getGerente(Integer id){
        em = JPAUtil.getEntityManager();
        return em.find(Gerente.class, id);
    }
    
    public Cabelereiro getCabelereiro(Integer id){
        em = JPAUtil.getEntityManager();
        return em.find(Cabelereiro.class, id);
    }
    
    public Cliente getCliente(Integer id){
        em = JPAUtil.getEntityManager();
        return em.find(Cliente.class, id);
    }
}