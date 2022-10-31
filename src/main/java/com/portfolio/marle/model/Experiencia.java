
package com.portfolio.marle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Experiencia {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idExperiencia;
    private String empresa;
    private String cargo;
    private String anhoInicio;
    private String anhoFin;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(int idExperiencia, String empresa, String cargo, String anhoInicio, String anhoFin, String descripcion) {
        this.idExperiencia = idExperiencia;
        this.empresa = empresa;
        this.cargo = cargo;
        this.anhoInicio = anhoInicio;
        this.anhoFin = anhoFin;
        this.descripcion = descripcion;
    }
    
    
}
