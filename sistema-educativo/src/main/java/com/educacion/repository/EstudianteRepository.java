package com.educacion.repository;

import com.educacion.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

    List<Estudiante> findByCarrera(String carrera);                    
    List<Estudiante> findByJornada(String jornada);                   
    List<Estudiante> findByEdadBetween(int minEdad, int maxEdad);      
    List<Estudiante> findByCursoAsignado(String cursoId);              
}
