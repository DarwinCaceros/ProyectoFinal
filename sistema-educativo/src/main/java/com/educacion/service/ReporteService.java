package com.educacion.service;

import com.educacion.repository.EstudianteRepository;
import com.educacion.repository.CursoRepository;
import com.educacion.repository.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReporteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private TramiteRepository tramiteRepository;

    public ResponseEntity<?> reporteEstudiantes() {
        return ResponseEntity.ok(estudianteRepository.findAll());
    }

    public ResponseEntity<?> reporteAsignaciones() {
        return ResponseEntity.ok(cursoRepository.findAll());
    }

    public ResponseEntity<?> reporteNotas() {
        
        return ResponseEntity.ok(estudianteRepository.findAll());
    }

    public ResponseEntity<?> reporteHistorialPagos() {
        
        return ResponseEntity.ok(estudianteRepository.findAll());
    }

    public ResponseEntity<?> reporteTramites() {
        return ResponseEntity.ok(tramiteRepository.findAll());
    }
}