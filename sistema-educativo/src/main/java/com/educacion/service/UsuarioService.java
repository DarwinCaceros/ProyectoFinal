package com.educacion.service;

import com.educacion.model.Usuario;
import com.educacion.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerUsuarios(){
        return usuarioRepository.findAll();
    }

    public ResponseEntity<Usuario> obtenerUsuarioPorId(String id){
        return usuarioRepository.findById(id).map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public ResponseEntity<Usuario> actualizarUsuario(String id, Usuario usuario){
        return usuarioRepository.findById(id).map(u -> {
            u.setNombre(usuario.getNombre());
            u.setRol(usuario.getRol());
            return ResponseEntity.ok(usuarioRepository.save(u));
        }).orElse(ResponseEntity.notFound().build());
    }
    
    public ResponseEntity<Object> eliminarUsuario(String id) {
        return usuarioRepository.findById(id).map(u -> {
            usuarioRepository.delete(u);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}