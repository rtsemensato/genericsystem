package com.sistemaescolar.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "gradeEscolar")
public class GradeEscolar extends AbstractEntity{

    public GradeEscolar() {
    }
    
    @Override
    public void updateParameters(Object entity) {
        GradeEscolar outro = (GradeEscolar) entity;
    }
  
}
