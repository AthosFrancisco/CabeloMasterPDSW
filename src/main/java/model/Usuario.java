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
@Table(name = "TB_USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DISCRICAO_USUARIO", discriminatorType = DiscriminatorType.STRING, length = 20)
@Access(AccessType.FIELD)
public class Usuario implements Serializable{

    public Usuario() {
    }
    
    public Usuario(String nome, String cpf, String email, String senha, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
    }
    
    @Id
    @SequenceGenerator(allocationSize = 20, name = "SEQ_ID", initialValue = 1)
    @GeneratedValue(generator = "SEQ_ID")
    private Integer id;
    
    @Column(name = "TXT_NOME", nullable = false)
    private String nome;
    
    @Column(name = "TXT_CPF", nullable = false, unique = true)
    private String cpf;
    
    @Column(name = "TXT_EMAIL", nullable = false, unique = true)
    private String email;
    
    @Column(name = "TXT_SENHA", nullable = false)
    private String senha;
    
    @Column(name = "TXT_SEXO", nullable = false)
    private char sexo;
    
    @Embedded
    private Endereco endereco;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
