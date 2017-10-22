/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author athos.carmo
 */
@Entity
@Table(name = "TB_GERENTE")
@DiscriminatorValue(value = "GERENTE")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Gerente extends Usuario implements Serializable{

    public Gerente() {
    }
    
    public Gerente(String nome, String cpf, String email, String senha, char sexo) {
        super(nome, cpf, email, senha, sexo);
    }
    
    @OneToMany(mappedBy = "gerente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Cabelereiro> cabelereiro;
    
    public List<Cabelereiro> getCabelereiro() {
        return cabelereiro;
    }

    public void setCabelereiro(Cabelereiro cabelereiro) {
        if(cabelereiro == null){
            this.cabelereiro = new ArrayList<>();
        }
        this.cabelereiro.add(cabelereiro);
    }
    
    public Cabelereiro verCabelereiro(Integer id){
        Cabelereiro cabExiste = null;
        for(Cabelereiro c:this.cabelereiro){
            if(c.getId() == id){
                cabExiste = c;
                break;
            }
        }
        return cabExiste;
    }
    
    public void excluirCabelereiro(Cabelereiro c){
        
        if(this.cabelereiro.contains(c)){
            
            EntityManager em = JPAUtil.getInstance().getEntityManager();
            em.clear();
            em.getTransaction().begin();
            c = em.find(Cabelereiro.class, c.getId());
            em.remove(c);
            em.getTransaction().commit();
        }
    }
    
    public void cadastrarServico(Servico servico){
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        em.clear();
        em.getTransaction().begin();
        em.persist(servico);
        em.getTransaction().commit();
    }
    
    public void excluirServico(Servico servico){
        
        EntityManager em = JPAUtil.getInstance().getEntityManager();
        em.clear();
        em.getTransaction().begin();
        servico = em.find(Servico.class, servico.getId());
        em.remove(servico);
        em.getTransaction().commit();
    }
}
