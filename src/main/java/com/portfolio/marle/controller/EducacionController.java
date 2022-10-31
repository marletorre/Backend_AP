package com.portfolio.marle.controller;

import com.portfolio.marle.model.Educacion;
import com.portfolio.marle.service.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    private final EducacionService eduServ;
    
    public EducacionController(EducacionService eduServ){
        this.eduServ=eduServ;
    }
    
    @GetMapping
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
            List<Educacion> educaciones=eduServ.buscarEducaciones();
            return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion editEducacion=eduServ.editarEducacion(educacion);
        return new ResponseEntity<>(editEducacion,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Educacion> agregarEducacion(@RequestBody Educacion educacion){
        Educacion agreEducacion=eduServ.agregarEducacion(educacion);
        return new ResponseEntity<>(agreEducacion,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{idEducacion}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("idEducacion") Integer idEducacion){
            eduServ.borrarEducacion(idEducacion);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
