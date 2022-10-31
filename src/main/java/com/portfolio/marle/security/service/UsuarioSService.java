
package com.portfolio.marle.security.service;

import com.portfolio.marle.security.entity.User;
import com.portfolio.marle.security.repository.UsuarioIRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioSService {
    @Autowired
    UsuarioIRepository usuIRepo;
    
    public Optional<User> getByNombreUsuario(String nombreUsuario){
        return usuIRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuIRepo.existsByNombreUsuario(nombreUsuario);
    }
    
     public boolean existsByEmail(String email){
        return usuIRepo.existsByEmail(email);
    }
     
     public void save(User user){
         usuIRepo.save(user);
     }
}
