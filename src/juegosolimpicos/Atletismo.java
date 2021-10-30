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
public class Atletismo extends Deporte {
    private int cantidaddeKilometros; 

    public Atletismo(String nombre, String pais, boolean gano, String medalla, boolean recordOlimpico) {
        super(nombre, pais, gano, medalla, recordOlimpico);
    }
    
    public int getCantidaddeKilometros() {
        return cantidaddeKilometros;
    }

    public void setCantidaddeKilometros(int cantidaddeKilometros) {
        this.cantidaddeKilometros = cantidaddeKilometros;
    }

    public Atletismo(int cantidaddeKilometros, String nombre, String pais, boolean gano, String medalla, boolean recordOlimpico) {
        super(nombre, pais, gano, medalla, recordOlimpico);
        this.cantidaddeKilometros = cantidaddeKilometros;
    }

    @Override
    public String toString() {
        return "Atletismo \n " + "cantidad de Kilometros: " + cantidaddeKilometros + super.toString();
    }
    @Override
    public void ConseguirValor(){
        System.out.println(cantidaddeKilometros);
    }
    
}
