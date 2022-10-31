
package com.portfolio.marle.controller;

import com.portfolio.marle.model.Skills;
import com.portfolio.marle.service.SkillsService;
import java.util.List;
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
@RequestMapping("/skills")
public class SkillsController {
      private final SkillsService skiServ;
 public SkillsController(SkillsService skiServ){
        this.skiServ=skiServ;
    }
    
    @GetMapping
    public ResponseEntity<List<Skills>> obtenerSkills(){
            List<Skills> skills=skiServ.buscarSkill();
            return new ResponseEntity<>(skills,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
        Skills editSkills=skiServ.editarSkill(skills);
        return new ResponseEntity<>(editSkills,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Skills> agregarSkills(@RequestBody Skills skills){
        Skills agreSkill=skiServ.agregarSkill(skills);
        return new ResponseEntity<>(agreSkill,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{idSkill}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("idSkill") Integer idSkill){
            skiServ.borrarSkill(idSkill);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
