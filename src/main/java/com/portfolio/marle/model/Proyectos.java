
package com.portfolio.marle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private int idProyecto;
    private String nombreProyecto;
    private String descripcion;
    private String urlProyecto;
    private String imgProyecto;

    public Proyectos() {
    }

    public Proyectos(int idProyecto, String nombreProyecto, String descripcion, String urlProyecto, String imgProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.imgProyecto = imgProyecto;
    }
    
}
