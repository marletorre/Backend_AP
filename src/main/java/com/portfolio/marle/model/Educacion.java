
package com.portfolio.marle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private int idEducacion;
    private String institucion;
    private String carrera;
    private String anhoInicio;
    private String anhoFin;
    private String logoEscuela;

    public Educacion() {
    }

    public Educacion(int idEducacion, String institucion, String carrera, String anhoInicio, String anhoFin, String logoEscuela) {
        this.idEducacion = idEducacion;
        this.institucion = institucion;
        this.carrera = carrera;
        this.anhoInicio = anhoInicio;
        this.anhoFin = anhoFin;
        this.logoEscuela = logoEscuela;
    }
}
