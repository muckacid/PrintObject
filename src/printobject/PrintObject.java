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
     *
     * Esta aplicacion tiene como ojbetivo
     * ejemplificar la creacion de una clase
     * para posteriormente instanciar una clase 
     * y utilizar los atributos de clase a nuestra conveniencia 
     * utilizar los accesadores(getters) y mutadores(setters)
     * imprimiendolo de forma efectiva.
     *
     */
    public static void main(String[] args) {
        
        /*
        * Definimos en primer lugar los datos que utilizaremos a continuacion
        * En este bloque generamos la instancia de clase
        * En este caso utilizamos el metodo toString para imprimir el objeto
        * Clase nombreDelObjeto = new Constructor(parametros)
        */
        String nombre = "Maximiliano";
        LocalDate fechaDeNacimiento = LocalDate.of(1994, 1, 25);
        Persona objeto = new Persona(nombre, fechaDeNacimiento);
        System.out.println(objeto);
        
        /*
        * En este caso llamamos a los atributos de clase y los concatenamos
        * para generar la estructura que necesitemos.
        *
        */
        System.out.println("+--------------------------------------------+");
        System.out.println("| "+ objeto.getNombre());
        System.out.println("| Tu edad es ");
        System.out.println("+--------------------------------------------+");
        System.out.println("| Anos   : " + objeto.getAge().getYears());
        System.out.println("| Meses  : " + objeto.getAge().getMonths());
        System.out.println("| Dias   : " + objeto.getAge().getDays());
        System.out.println("+--------------------------------------------+");
        
        /*
        * Si en algun momento deseamos modificar el valor de un atributo
        * utilizamos los mutadores(Setters) e imprimimos para mostrar el cambio
        */
        objeto.setNombre("Maximiliano Moraga");
        // Podemos imrpimir directamente el nombre
        System.out.println("[->] " + objeto.getNombre());
        
        // O podriamos imprimir el objeto directamente como lo 
        // vimos anteriormente
        
        System.out.println(objeto);
        
        
        
        
        
    }

}
