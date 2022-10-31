
package com.portfolio.marle.service;

import com.portfolio.marle.model.Proyectos;
import com.portfolio.marle.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
     private final ProyectosRepository proRepo;
    
    @Autowired
    public ProyectosService(ProyectosRepository proRepo){
        this.proRepo=proRepo;
    }
    public Proyectos agregarProyecto(Proyectos proyecto){
       return proRepo.save(proyecto);
    }
    
    public List<Proyectos> listaProyecto(){
        return proRepo.findAll();
    }
    
    public Proyectos editarProyecto(Proyectos proyecto){
        return proRepo.save(proyecto);
    }
    
    public void borrarProyecto(int id){
        proRepo.deleteById(id);
    }
    public List<Proyectos> buscarProyecto(){
        return proRepo.findAll();
    }
}
