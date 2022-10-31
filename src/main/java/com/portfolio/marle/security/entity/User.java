
package com.portfolio.marle.security.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
    @NotNull
    private String nombre;
    @NotNull
    @Column(unique=true)
    private String nombreUsuario;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="usuario_rol",joinColumns=@JoinColumn(name="usuario_id"),
            inverseJoinColumns=@JoinColumn(name="rol_id"))
    private Set<Rol> roles=new HashSet<>();  

    public User() {
    }

    public User(String nombre, String nombreUsuario, String email, String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

 
    
}
   
