/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.persistence.*;
import model.Endereco;
import model.Gerente;

/**
 *
 * @author ALUNO
 */
public class TesteConexao {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancomaster");
        EntityManager em = emf.createEntityManager();
        
//        Gerente g = new Gerente("Athos", "09236474114", "athos@gmail.com", "123", 'M');
//        g.setEndereco(new Endereco("53170280", "rua antonio berenguer", "passarinho", 358, "", "Olinda", "PE"));
//        
//        em.getTransaction().begin();
//        em.persist(g);
//        em.getTransaction().commit();
//        em.close();

//        Gerente g = em.find(Gerente.class, 1);
//        Query q = em.createQuery("select g from Gerente g where g.nome = :nome and g.senha = :senha");
//        q.setParameter("nome", "athos@gmail.com");
//        q.setParameter("senha", "123");
//        
//        Gerente g = (Gerente) q.getSingleResult();
    }
}
