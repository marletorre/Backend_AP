
package com.portfolio.marle.service;

import com.portfolio.marle.model.Educacion;
import com.portfolio.marle.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepository eduRepo;
    
    @Autowired
    public EducacionService(EducacionRepository eduRepo){
        this.eduRepo=eduRepo;
    }
    
    public Educacion agregarEducacion(Educacion educacion){
       return eduRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducaciones(){
        return eduRepo.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return eduRepo.save(educacion);
    }
    
    public void borrarEducacion(int idEducacion){
        eduRepo.deleteById(idEducacion);
    }
}
