package com.educacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tramites")

public class Tramite {
    
@Id
private String id;
private String tipo;
private String estatus;
private String estudianteId;

public Tramite(){}

public Tramite(String id, String tipo, String estatus, String estudianteId){
    this.tipo = tipo;
    this.estatus = estatus;
    this.estudianteId = estudianteId;
}

public String getId(){ return id;}
public void setId(String id){this.id = id;}

public String getTipo(){return tipo;}
public void setTipo(String tipo){this.tipo = tipo;}

public String getEstatus(){return estatus;}
public void setEstatus(String estatus){this.estatus = estatus;}

public String setEstudianteId(){return estudianteId;}
public void setEstudianteId(String estudianteId){this.estudianteId = estudianteId;}

public Object getDescripcion() {
    
    throw new UnsupportedOperationException("Metodo no implementado'");
}

public void setDescripcion(Object descripcion) {
    
    throw new UnsupportedOperationException("Metodo no implementado'");
}

}
