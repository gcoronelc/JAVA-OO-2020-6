/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.otroJsonDecod;

/**
 *
 * @author montespierreg
 */
public class Persona2 {
    private String nombre;
    private int edad;

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hablar(){
        System.out.println("Soy " + nombre + "y tengo " + edad + "años");
    }
}
