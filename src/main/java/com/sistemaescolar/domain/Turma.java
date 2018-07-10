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
@Table(name = "turma")
public class Turma extends AbstractEntity {
    
    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    
    @Column(length = 4, nullable = false)
    private Integer anoInicio;
    
    @Column(length = 4)
    private Integer anoFim;
   
    @ManyToOne
    private Curso curso;
    
    @ManyToOne
    private GradeEscolar gradeEscolar;

    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(Integer anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Integer getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(Integer anoFim) {
        this.anoFim = anoFim;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public GradeEscolar getGradeEscolar() {
        return gradeEscolar;
    }

    public void setGradeEscolar(GradeEscolar gradeEscolar) {
        this.gradeEscolar = gradeEscolar;
    }
    
    @Override
    public void updateParameters(Object entity) {
         Turma outro = (Turma) entity;
         this.nome      = outro.nome;
         this.anoInicio = outro.anoInicio;
         this.anoFim    = outro.anoFim;
         this.curso     = outro.curso;
         this.gradeEscolar = outro.gradeEscolar;
    }
}
