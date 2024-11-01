package com.educacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "estudiantes")
public class Estudiante {

    @Id
    private String id;
    private String nombre;
    private int edad;
    private String carrera;
    private String jornada;
    private List<String> cursosAsignados;

    public Estudiante(){}

    public Estudiante(String nombre, String carrera, int edad, String jornada, List<String> cursosAsignados){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.jornada = jornada;
        this.cursosAsignados = cursosAsignados;
    }

    public String getId(){ return id;}
    public void setId(String id){this.id = id;}

    public String getNombre(){ return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}
    
    public String getCarrera(){ return carrera;}
    public void setCarrera(String carrera){this.carrera = carrera;}

    public String getJornada(){ return jornada;}
    public void setJornada(String jornada){this.jornada = jornada;}

    public List<String> getCursosAsignados(){ return cursosAsignados;}
    public void setCursosAsignados(List<String> cursosAsignados){this.cursosAsignados = cursosAsignados;}
    
}
