
package com.portfolio.marle.security.service;

import com.portfolio.marle.security.entity.User;
import com.portfolio.marle.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    UsuarioSService usuSServ;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        User user=usuSServ.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(user);
    }
    
}
