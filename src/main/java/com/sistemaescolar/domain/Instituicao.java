package com.sistemaescolar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "instituicao")
public class Instituicao extends AbstractEntity{

    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    
    @Column(length = 18, nullable = false, unique = true)
    private String cnpj;

    public Instituicao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void updateParameters(Object entity) {
        Instituicao outro = (Instituicao) entity;
        this.nome = outro.nome;
        this.cnpj = outro.cnpj;
    }  
}
