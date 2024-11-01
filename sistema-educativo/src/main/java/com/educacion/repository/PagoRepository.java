package com.educacion.repository;

import com.educacion.model.Pago;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PagoRepository extends MongoRepository<Pago, String>{
    List<Pago> findByEstudiante(String estudianteId);
    List<Pago> findByEstado(String estado);
    List<Pago> findByTipoPago(String pago);
}
