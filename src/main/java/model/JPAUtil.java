/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.*;

/**
 *
 * @author Athos
 */
public class JPAUtil {
    
    protected JPAUtil(){
        emf = Persistence.createEntityManagerFactory("bancomaster");
        em = emf.createEntityManager();
    }
    
    public static JPAUtil instancia;
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static JPAUtil getInstance(){
        if(instancia == null){
            instancia =  new JPAUtil();
        }
        return instancia;
    }

    public EntityManager getEntityManager(){
        return em;
    }
}
