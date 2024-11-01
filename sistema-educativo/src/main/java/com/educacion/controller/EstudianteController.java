package com.educacion.controller;

import com.educacion.model.Estudiante;
import com.educacion.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")

public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.obtenerEstudiantes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerEstudiantePorId(@PathVariable String id){
        return estudianteService.obtenerEstudiantePorId(id);
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.crearEstudiante(estudiante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable String id, @RequestBody Estudiante estudiante){
        return estudianteService.actualizarEstudiante(id, estudiante);
    }

    @DeleteMapping
    public ResponseEntity<Object> eliminarEstudiante(@PathVariable String id){
        return estudianteService.eliminarEstudiante(id);
    }


}
