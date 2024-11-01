package com.educacion.repository;

import com.educacion.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends MongoRepository<Curso, String> {

    List<Curso> findByNombre(String nombre);                         
    List<Curso> findByCatedratico(String catedraticoId);             
    List<Curso> findByGrado(String grado);                           
}