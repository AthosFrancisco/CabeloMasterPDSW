/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
    
}
