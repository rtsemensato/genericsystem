package com.sistemaescolar.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "Disciplina")
public class Disciplina extends AbstractEntity{

    private String nome;
    
    @ManyToOne
    private GradeEscolar gradeEscolar;
    
    @ManyToOne
    private Professor professor;

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GradeEscolar getGradeEscolar() {
        return gradeEscolar;
    }

    public void setGradeEscolar(GradeEscolar gradeEscolar) {
        this.gradeEscolar = gradeEscolar;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    @Override
    public void updateParameters(Object entity) {
        Disciplina outro = (Disciplina) entity;
        this.nome = outro.nome;
        this.gradeEscolar = outro.gradeEscolar;
        this.professor = outro.professor;
    }

    
}
