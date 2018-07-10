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
@Table(name = "aluno")
public class Aluno extends AbstractEntity{
    
    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    
    @Column(nullable = false, unique = true)
    private String ra;
    
    @ManyToOne
    private Turma turma;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    @Override
    public void updateParameters(Object entity) {
        Aluno outro = (Aluno) entity;
        this.nome   = outro.nome;
        this.ra = outro.ra;
        this.turma  = outro.turma;
    } 
}
