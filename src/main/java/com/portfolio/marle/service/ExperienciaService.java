
package com.portfolio.marle.service;

import com.portfolio.marle.model.Experiencia;
import com.portfolio.marle.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepository expRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository expRepo){
        this.expRepo=expRepo;
    }
    
    public Experiencia agregarExperiencia(Experiencia experiencia){
       return expRepo.save(experiencia);
    }
    
    public List<Experiencia> listaExperiencia(){
        return expRepo.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return expRepo.save(experiencia);
    }
    
    public void borrarExperiencia(int id){
        expRepo.deleteById(id);
    }
    
     public List<Experiencia> buscarExperiencias(){
        return expRepo.findAll();
    }
}
