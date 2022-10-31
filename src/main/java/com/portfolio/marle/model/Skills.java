
package com.portfolio.marle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Skills {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private int idSkill;
    private String nombreSkill;
    private String valor;

    public Skills() {
    }

    public Skills(int idSkill, String nombreSkill, String valor) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.valor = valor;
    }
    
    
}
