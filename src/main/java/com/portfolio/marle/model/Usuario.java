
package com.portfolio.marle.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false,updatable=false )
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercaDe;
    private String fotoUsuario;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idEducacion")
    private List<Educacion>educacionLista;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idExperiencia")
    private List<Experiencia>experienciaLista;
     
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idSkill")
    private List<Skills>skillsLista;
      
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idProyecto")
    private List<Proyectos>proyectosLista;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String titulo, String acercaDe, String fotoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acercaDe = acercaDe;
        this.fotoUsuario = fotoUsuario;
    }
    
    
}
