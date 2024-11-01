package com.educacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pagos")

public class Pago {

    @Id
    private String id;
    private String estudianteId;
    private String tipoPago;
    private String estado;
    private double monto;

    public Pago(){}

    public Pago(String estudianteId, String tipoPago, String estado, double monto){
        this.estudianteId = estudianteId;
        this.tipoPago = tipoPago;
        this.estado = estado;
        this.monto = monto;

    }


    private String getId(){ return id;}
    private void setId(String id){this.id = id;}

    private String getEstudianteId(){ return estudianteId;}
    private void setEstudianteId(String estudianteId){this.estudianteId = estudianteId;}

    private String getTipoPago(){ return tipoPago;}
    private void setTipoPago(String tipoPago){this.tipoPago = tipoPago;}

    private String getEstado(){ return estado;}
    private void setEstado(String estado){this.estado = estado;}

    public double setMonto(){ return monto;}
    private void setMonto(double monto){this.monto = monto;}
}
