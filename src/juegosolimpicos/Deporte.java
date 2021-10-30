package juegosolimpicos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public abstract class Deporte implements RecordOlimpico {

    private String nombre;
    private String pais;
    private boolean gano;
    private String medalla; 
    private boolean recordOlimpico; 

    public Deporte(String nombre, String pais, boolean gano, String medalla, boolean recordOlimpico) {
        this.nombre = nombre;
        this.pais = pais;
        this.gano = gano;
        this.medalla = medalla;
        this.recordOlimpico = recordOlimpico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isGano() {
        return gano;
    }

    public void setGano(boolean gano) {
        this.gano = gano;
    }

    public String getMedalla() {
        return medalla;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public boolean isRecordOlimpico() {
        return recordOlimpico;
    }

    public void setRecordOlimpico(boolean recordOlimpico) {
        this.recordOlimpico = recordOlimpico;
    }

    public Deporte() {
    }

    @Override
    public String toString() {
        return "Deporte" + "nombre" + nombre + ", pais" + pais + ", gano " + gano + ", medalla" + medalla + ", record Olimpico " + recordOlimpico;
    }

    @Override
    public abstract void ConseguirValor();
    
}
