/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JuegosOlimpicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ArrayList<Deporte> atletas= new ArrayList ();
        int respuesta;
        Futbol RobinVanPersie = new Futbol(300, " Robin Van Persie ", "Holanda", true, "4 medallas de oro", true);
        atletas.add(RobinVanPersie);
        Futbol ArjenRobben = new Futbol(247, " Arjen Robben ", "Holanda", true, "3 medallas de oro", true);
        atletas.add(ArjenRobben);
        Futbol AlexisSanchez = new Futbol(203, " Alexis Sanchez ", "Chile", true, "5 medallas de oro", true);
        atletas.add(AlexisSanchez);
        Futbol EduardoVargas = new Futbol(104, " Robin Eduardo Vargas ", "Chile",false , "5 medallas de plata", true);
        atletas.add(EduardoVargas);
        Atletismo UsainBolt = new Atletismo(100, " Usain Bolt ", "Jamaica", true, "15 medallas de Oro", true);
        atletas.add(UsainBolt);
        Atletismo VeronicaCampbell = new Atletismo(200, " Michael Phelps ", "Jamaica", true, "5 medallas de Oro", true);
        atletas.add(VeronicaCampbell);
        Atletismo DonaldQuarrie= new Atletismo(200, " Donald Quarrie ", "Jamaica", true, "6 medallas de Oro", true);
        atletas.add(DonaldQuarrie);
        Atletismo ShellyAnn = new Atletismo(200, " Shelly-Ann ", "Jamaica", true, "5 medallas de plata", true);
        atletas.add(ShellyAnn);
        System.out.println("Bienvenidos al menu de ingreso: ¿Que pais desea elegir?  ");
        System.out.println("1. Holanda");
        System.out.println("2. Chile");
        System.out.println("3. Jamaica");
        respuesta=entrada.nextInt();
        
        switch(respuesta) {
            case 1:    
                System.out.println("Opcion 1");
                for (Deporte atleta : atletas) {
                    if (atleta.getPais().equals("Holanda")){
                    System.out.println(atleta.getNombre());
                    }      
                }
                
                break;
            case 2:
                System.out.println("Opcion 2");
                for (Deporte atleta : atletas) {
                    if (atleta.getPais().equals("Chile")) {
                    System.out.println(atleta.getNombre());
                    }
                }break;
            case 3:
                System.out.println("Opcion 3");
                for (Deporte atleta : atletas) {
                    if (atleta.getPais().equals("Jamaica")){
                        System.out.println(atleta.getNombre());
                    }
                }break;    
                
            default:
                System.out.println("Opcion no valida");
                break;             
        }
    }
}
