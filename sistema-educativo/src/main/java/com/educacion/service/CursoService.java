package com.educacion.service;

import com.educacion.model.Curso;
import com.educacion.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> obtenerCursos() {
        return cursoRepository.findAll();
    }

    public ResponseEntity<Curso> obtenerCursoPorId(String id) {
        return cursoRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public ResponseEntity<Curso> actualizarCurso(String id, Curso curso) {
        return cursoRepository.findById(id).map(c -> {
            c.setNombre(curso.getNombre());
            c.setDescripcion(curso.getDescripcion());
            return ResponseEntity.ok(cursoRepository.save(c));
        }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> eliminarCurso(String id) {
        return cursoRepository.findById(id).map(c -> {
            cursoRepository.delete(c);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
