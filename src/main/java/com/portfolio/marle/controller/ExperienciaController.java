
package com.portfolio.marle.controller;

import com.portfolio.marle.model.Experiencia;
import com.portfolio.marle.service.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
     private final ExperienciaService expServ;
    
    public ExperienciaController(ExperienciaService expServ){
        this.expServ=expServ;
    }
    
    @GetMapping
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
            List<Experiencia> experiencias=expServ.buscarExperiencias();
            return new ResponseEntity<>(experiencias,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia editExperiencia=expServ.editarExperiencia(experiencia);
        return new ResponseEntity<>(editExperiencia,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Experiencia> agregarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia agreExperiencia=expServ.agregarExperiencia(experiencia);
        return new ResponseEntity<>(agreExperiencia,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{idExperiencia}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("idExperiencia") Integer idExperiencia){
            expServ.borrarExperiencia(idExperiencia);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
