/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.JsonDecodif;

import org.json.JSONObject;

/**
 *
 * @author montespierreg
 */
public class ParsearObjeto {
    
    
    
    public static void main(String[] args) {
    String cadenaJson = "{\"nombre\":\"Maggie\",\"edad\":30}";
    
    //Crear un nuevo objeto JSON
    JSONObject objetoJson = new JSONObject(cadenaJson);
    
    // Y ahora podemos acceder a través de getTipoDeDato
    int edad = objetoJson.getInt("edad");
    String nombre = objetoJson.getString("nombre");
    
    // Luego de eso podemos crear la clase y obtener los beneficios
    // de la POO o usar los datos como nos plazca
    Persona humano = new Persona(nombre, edad);
    
        // Podemos hacer lo que sea con el objeto
        humano.hablar();
    }
    
}
