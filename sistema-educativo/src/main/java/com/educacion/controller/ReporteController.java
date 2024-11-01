package com.educacion.controller;

import com.educacion.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reportes")

public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping("/estudiantes")
    public ResponseEntity<?> reporteEstudiantes() {
        return reporteService.reporteEstudiantes();
    }

    @GetMapping("/asignaciones")
    public ResponseEntity<?> reporteAsignaciones() {
        return reporteService.reporteAsignaciones();
    }

    @GetMapping("/notas")
    public ResponseEntity<?> reporteNotas() {
        return reporteService.reporteNotas();
    }

    @GetMapping("/historial-pagos")
    public ResponseEntity<?> reporteHistorialPagos() {
        return reporteService.reporteHistorialPagos();
    }

    @GetMapping("/tramites")
    public ResponseEntity<?> reporteTramites() {
        return reporteService.reporteTramites();
    }
    
}
