package com.educacion.repository;

import com.educacion.model.Tramite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TramiteRepository extends MongoRepository<Tramite, String> {

        List<Tramite> findByTipo(String tipo);
        List<Tramite> findByEstatus(String estatus);
        List<Tramite> findByEstudianteId(String estudianteId);
    
}
