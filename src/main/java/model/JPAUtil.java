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
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    static{
        emf = Persistence.createEntityManagerFactory("bancomaster");
        em = emf.createEntityManager();
    }
    
    public static EntityManager getEntityManager(){
        return em;
    }
}
