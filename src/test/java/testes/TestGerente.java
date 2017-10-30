/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import controller.RetornaUsuario;
import java.util.List;
import javax.persistence.EntityManager;
import model.Cabelereiro;
import model.Gerente;
import model.JPAUtil;
import org.junit.Test;

/**
 *
 * @author Athos
 */
public class TestGerente {
    
    //@Test
    public void testConsulta(){
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        Gerente g = em.find(Gerente.class, 1);
        
        List<Cabelereiro> lista = g.getCabelereiro();
        
        for(Cabelereiro c: lista){
            System.out.println(c.getNome());
        }
    }
    
    //@Test
    public void testExcluir(){
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        
        Cabelereiro c = em.find(Cabelereiro.class, 5);
        
        Gerente g = em.find(Gerente.class, 1);

        g.excluirCabelereiro(c);
    }
}
