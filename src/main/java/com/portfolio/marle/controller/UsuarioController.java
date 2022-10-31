
package com.portfolio.marle.controller;

import com.portfolio.marle.model.Usuario;
import com.portfolio.marle.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
     private final UsuarioService usuServ;
    
    
    public UsuarioController(UsuarioService usuServ){
        this.usuServ=usuServ;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
            Usuario usuario=usuServ.buscarUsuario(id);
            return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario=usuServ.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario){
        Usuario agreUsuario=usuServ.agregarUsuario(usuario);
        return new ResponseEntity<>(agreUsuario,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarUsuario(@PathVariable("id") Long id){
        usuServ.borrarUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
