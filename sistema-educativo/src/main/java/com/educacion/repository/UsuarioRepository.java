package com.educacion.repository;

import com.educacion.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

        List<Usuario> findByNombre(String nombre);
        List<Usuario> findByRol(String rol);
        List<Usuario> findByActivo(boolean activo);
    
}
