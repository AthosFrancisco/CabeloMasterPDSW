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
@Table(name = "TB_CABELEREIRO")
@DiscriminatorValue(value = "CABELEREIRO")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Cabelereiro extends Usuario implements Serializable{
    
    @OneToMany(mappedBy = "cabelereiro", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Atendimento> atendimento;

    public List<Atendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(List<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }
}
