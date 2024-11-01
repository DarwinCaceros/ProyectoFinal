package com.educacion.controller;



import com.educacion.model.Curso;
import com.educacion.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")

public class CursoController {
    
    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> obtenerCursos(){
        return cursoService.obtenerCursos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> obtenerCursoPorId(@PathVariable String id){
        return cursoService.obtenerCursoPorId(id);
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoService.crearCurso(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizarCurso(@PathVariable String id, @RequestBody Curso curso) {
        return cursoService.actualizarCurso(id, curso);
    }

    @DeleteMapping
    public ResponseEntity<Object> eliminarCurso(@PathVariable String id) {
        return cursoService.eliminarCurso(id);
    }


}