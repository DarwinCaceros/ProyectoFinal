package com.educacion.service;

import com.educacion.model.Tramite;
import com.educacion.repository.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TramiteService {

    @Autowired
    private TramiteRepository tramiteRepository;

    public List<Tramite> obtenerTramites() {
        return tramiteRepository.findAll();
    }

    public ResponseEntity<Tramite> obtenerTramitePorId(String id) {
        return tramiteRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public Tramite crearTramite(Tramite tramite) {
        return tramiteRepository.save(tramite);
    }

    public ResponseEntity<Tramite> actualizarTramite(String id, Tramite tramite) {
        return tramiteRepository.findById(id).map(t -> {
            t.setDescripcion(tramite.getDescripcion());
            t.setEstatus(tramite.getEstatus());
            return ResponseEntity.ok(tramiteRepository.save(t));
        }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> eliminarTramite(String id) {
        return tramiteRepository.findById(id).map(t -> {
            tramiteRepository.delete(t);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
