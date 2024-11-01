package com.educacion.service;

import com.educacion.model.Estudiante;
import com.educacion.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerEstudiantes() {
        return estudianteRepository.findAll();
    }

    public ResponseEntity<Estudiante> obtenerEstudiantePorId(String id) {
        return estudianteRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public ResponseEntity<Estudiante> actualizarEstudiante(String id, Estudiante estudiante) {
        return estudianteRepository.findById(id).map(e -> {
            e.setNombre(estudiante.getNombre());
            e.setCarrera(estudiante.getCarrera());
            return ResponseEntity.ok(estudianteRepository.save(e));
        }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> eliminarEstudiante(String id) {
        return estudianteRepository.findById(id).map(e -> {
            estudianteRepository.delete(e);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}