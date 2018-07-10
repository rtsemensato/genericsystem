package com.sistemaescolar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "professor")
public class Professor extends AbstractEntity{
    
    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    
    @Column(nullable = false)
    private String titulacao;

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
    public void updateParameters(Object entity) {
        Professor outro = (Professor) entity;
        this.nome = outro.nome;
        this.titulacao = outro.titulacao;
    }
 
}
