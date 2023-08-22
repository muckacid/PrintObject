/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printobject;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author morag
 */
public class Persona {

    private String nombre;
    private LocalDate nacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Period getAge() {
        /* 
            2023 08 21
            2023 07 31
            1994 01 25
        _______________
              29  6  6 
                
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = this.birthday;
        Period edad = Period.between(nacimiento, hoy);
        return edad;
         */

        return Period.between(this.nacimiento, LocalDate.now());
    }

    @Override
    public String toString() {
        String br = "\n";
        String line = "+----------------------------------------------";
        String res = "";
        res += line + br;
        res += "| Nombre              :" + nombre + br;
        res += "| Fecha de nacimiento :" + nacimiento + br;
        res += "| Edad                :" + getAge().getYears() + " anos" + br;
        res += line + br;

        return res;
    }

}
