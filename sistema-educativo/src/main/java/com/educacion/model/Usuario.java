package com.educacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")

public class Usuario {

    @Id
    private String id;
    private String nombre;
    private String email;
    private String rol;
    private boolean activo;

    public Usuario(){}

        public Usuario(String nombre, String email, String rol, boolean activo){
            this.nombre = nombre;
            this.email = email;
            this.rol = rol;
            this.activo = activo;
        }

        public String getId(){ return id;}
        public void setId(String id){ this.id = id;}

        public String getNombre(){ return nombre;}
        public void setNombre(String nombre){ this.nombre = nombre;}

        public String getEmail(){ return email;}
        public void setEmail(String email){ this.email = email;}

        public String getRol(){ return rol;}
        public void setRol(String rol){ this.rol = rol;}

        public boolean isActivo(){ return activo;}
        public void setActivo(boolean activo){this.activo = activo;}

    }
    


