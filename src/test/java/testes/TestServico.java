/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import model.JPAUtil;
import model.Servico;
import org.junit.Test;

/**
 *
 * @author Athos
 */
public class TestServico {
    
    @Test
    public void inserirServico(){

        Date hTempoMedio = null, hPausa = null, hTempoRestante = null;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        try {
            hTempoMedio = sdf.parse("01:00");
            hPausa = sdf.parse("00:00");
            hTempoRestante = sdf.parse("00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Servico servico = new Servico("Alisamento", "alisar", hTempoMedio, hPausa, hTempoRestante);
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        em.clear();
        em.getTransaction().begin();
        em.persist(servico);
        em.getTransaction().commit();
    }
}
