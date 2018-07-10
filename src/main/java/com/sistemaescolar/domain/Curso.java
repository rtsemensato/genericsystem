package com.sistemaescolar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "curso")
public class Curso extends AbstractEntity{

    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    
    @ManyToOne
    private Instituicao instituicao;

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
       
    @Override
    public void updateParameters(Object entity) {
        Curso outro = (Curso) entity;
        this.nome = outro.nome;
        this.instituicao = outro.instituicao;
    }

}
