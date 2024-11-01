package com.educacion.controller;


import com.educacion.model.Tramite;
import com.educacion.service.TramiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tramites")

public class TramiteController {

    @Autowired
    private TramiteService tramiteService;

    @GetMapping
    public List<Tramite> obtenerTramites() {
        return tramiteService.obtenerTramites();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tramite> obtenerTramitePorId(@PathVariable String id) {
        return tramiteService.obtenerTramitePorId(id);
    }

    @PostMapping
    public Tramite crearTramite(@RequestBody Tramite tramite) {
        return tramiteService.crearTramite(tramite);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tramite> actualizarTramite(@PathVariable String id, @RequestBody Tramite tramite) {
        return tramiteService.actualizarTramite(id, tramite);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminarTramite(@PathVariable String id) {
        return tramiteService.eliminarTramite(id);
    }
    
}
