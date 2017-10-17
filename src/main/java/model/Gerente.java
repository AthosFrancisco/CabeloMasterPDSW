/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
    
    public void cadastrarCabelereiro(Cabelereiro cab){
        EntityManager em = JPAUtil.getEntityManager();
        cab.setGerente(this);
        em.getTransaction().begin();
        em.merge(cab);
        em.getTransaction().commit();
        em.clear();
    }

    public List<Cabelereiro> getCabelereiro() {
        return cabelereiro;
    }

    public void setCabelereiro(List<Cabelereiro> cabelereiro) {
        this.cabelereiro = cabelereiro;
    }
    
    
    
}
