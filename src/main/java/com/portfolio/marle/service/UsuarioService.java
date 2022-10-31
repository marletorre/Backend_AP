
package com.portfolio.marle.service;

import com.portfolio.marle.exception.UserNotFoundException;
import com.portfolio.marle.model.Usuario;
import com.portfolio.marle.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepository usuRepo;
    
    @Autowired
    public UsuarioService(UsuarioRepository usuRepo){
        this.usuRepo=usuRepo;
    }
    
    public Usuario agregarUsuario(Usuario usuario){
       return usuRepo.save(usuario);
    }
    
    public List<Usuario> listaUsuario(){
        return usuRepo.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario){
        return usuRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
        usuRepo.deleteById(id);
    }
    
    public Usuario buscarUsuario(Long id){
     return usuRepo.findById(id).orElseThrow(()->new UserNotFoundException("usuario no encontrado"));
    }
   
}
