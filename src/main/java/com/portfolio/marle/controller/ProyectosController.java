
package com.portfolio.marle.controller;

import com.portfolio.marle.model.Proyectos;
import com.portfolio.marle.service.ProyectosService;
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
@RequestMapping("/proyectos")
public class ProyectosController {
     private final ProyectosService proServ;
    
    public ProyectosController(ProyectosService proServ){
        this.proServ=proServ;
    }
    
    @GetMapping
    public ResponseEntity<List<Proyectos>> obtenerProyectos(){
            List<Proyectos> proyectos=proServ.buscarProyecto();
            return new ResponseEntity<>(proyectos,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyectos){
        Proyectos editProyectos=proServ.editarProyecto(proyectos);
        return new ResponseEntity<>(editProyectos,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Proyectos> agregarProyectos(@RequestBody Proyectos proyecto){
        Proyectos agreProyecto=proServ.agregarProyecto(proyecto);
        return new ResponseEntity<>(agreProyecto,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{idProyecto}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("idProyecto") Integer idProyecto){
            proServ.borrarProyecto(idProyecto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
     
}
