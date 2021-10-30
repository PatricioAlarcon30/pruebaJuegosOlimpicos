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
public class Futbol extends Deporte {
    private int cantidaddeGoles;

    public int getCantidaddeGoles() {
        return cantidaddeGoles;
    }

    public void setCantidaddeGoles(int cantidaddeGoles) {
        this.cantidaddeGoles = cantidaddeGoles;
    }

    public Futbol(int cantidaddeGoles, String nombre, String pais, boolean gano, String medalla, boolean recordOlimpico) {
        super(nombre, pais, gano, medalla, recordOlimpico);
        this.cantidaddeGoles = cantidaddeGoles;
    }

    @Override
    public String toString() {
        return "Futbol{" + "cantidaddeGoles=" + cantidaddeGoles + '}';
    }
    @Override
    public void ConseguirValor(){
        System.out.println(cantidaddeGoles);
    }
}
