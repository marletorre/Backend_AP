
package com.portfolio.marle.service;

import com.portfolio.marle.model.Skills;
import com.portfolio.marle.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {
     private final SkillsRepository skiRepo;
    
    @Autowired
    public SkillsService(SkillsRepository skiRepo){
        this.skiRepo=skiRepo;
    }
    
    public Skills agregarSkill(Skills skill){
       return skiRepo.save(skill);
    }
    
    public List<Skills> listaSkills(){
        return skiRepo.findAll();
    }
    
    public Skills editarSkill(Skills skill){
        return skiRepo.save(skill);
    }
    
    public void borrarSkill(int id){
        skiRepo.deleteById(id);
    }
    public List<Skills> buscarSkill(){
        return skiRepo.findAll();
    }
}
