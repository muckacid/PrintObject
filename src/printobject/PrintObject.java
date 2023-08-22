/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printobject;

import java.time.LocalDate;

/**
 *
 * @author morag
 */
public class PrintObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            esta aplicacion tiene como ojbetivo 
            ejemplificar la creacion de una clase
            para posteriormente instanciar una clase
            y ejemplificar como utilizar un ojjeto imprimiendolo
            de forma efectiva.
            */
        String nombre = "Maximiliano";
        LocalDate fechaDeNacimiento = LocalDate.of(1994, 1, 25);
        // Clase nombreDelObjeto = new Constructor(parametros)
        Persona objeto = new Persona(nombre, fechaDeNacimiento);
    
        System.out.println("+----------------------------------------------");
        System.out.println("| Nombre              :" + objeto.getNombre());
        System.out.println("| Fecha de nacimiento :" + objeto.getNacimiento());
        System.out.println("+----------------------------------------------");
    }
    
}
