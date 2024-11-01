package com.educacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cursos")
public class Curso {

    @Id
    
    private String id;
    private String nombre;
    private String catedraticoId;
    private String grado;

    public Curso(){}
    public Curso(String nombre, String id, String catedraticoId, String grado){
        this.nombre = nombre;
        this.catedraticoId = catedraticoId;
        this.grado = grado;
    }
    

    public String getId(){ return id;}
    public void setId(String id){this.id = id;}

    public String getNombre(){ return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getCatedraticoId(){ return catedraticoId;}
    public void setCatedraticoId(String catedraticoId){this.catedraticoId = catedraticoId;}


    public String getGrado(){ return grado;}
    public void setGradro(String grado){this.grado = grado;}
    public Object getDescripcion() {
        
        throw new UnsupportedOperationException("Metodo no implementado'");
    }
    public void setDescripcion(Object descripcion) {
        
        throw new UnsupportedOperationException("Metodo no implementado'");
    }


}
