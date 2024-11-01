package com.educacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="notas")

public class Nota {

    @Id
    private String id;
    private String estudianteId;
    private String cursoId;
    private double parcialUno;
    private double parcialDos;
    private double examenFinal;
    private double total;

    public Nota(){}

    public Nota (String estudianteId, String cursoId, double parcialUno, double parcialDos, double examenFinal, double total){
        this.estudianteId = estudianteId;
        this.cursoId = cursoId;
        this.parcialUno = parcialUno;
        this.parcialDos = parcialDos;
        this.examenFinal = examenFinal;
        this.total = parcialUno + parcialDos + examenFinal;
    }

    public String getId(){return id;}
    public void setId(String id){this.id = id;}

    public String getCursoId(){return cursoId;}
    public void setCursoId(String cursoId){this.cursoId = cursoId;}

    public String getEstudianteId(){return estudianteId;}
    public void setEstudianteId(String estudianteId){this.estudianteId = estudianteId;}

    public double getParcialUno(){return parcialUno;}
    public void setParcialUno(double parcialUno){this.parcialUno = parcialUno;}

    public double getParcialDos(){return parcialDos;}
    public void setParcialDos(double parcialDos){this.parcialDos = parcialDos;}

    public double getExamenFinal(){return examenFinal;}
    public void setExamenFinal(double examenFinal){this.examenFinal = examenFinal;}

    public double getTotal(){return total;}
    public void setTotal(double total){this.total = total;}
    
}
