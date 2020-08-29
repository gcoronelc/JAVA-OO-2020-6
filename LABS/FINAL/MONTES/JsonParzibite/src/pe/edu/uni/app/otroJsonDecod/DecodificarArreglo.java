/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.otroJsonDecod;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author montespierreg
 */
public class DecodificarArreglo {
    public static void main(String[] args) {
        String cadenaJson = "[{\"nombre\":\"Maggie\",\"edad\":30},{\"nombre\":\"Snowball\",\"edad\":41},{\"nombre\":\"Bichi\",\"edad\":51},{\"nombre\":\"Meca\",\"edad\":50}]";
        JSONArray arregloJson = new JSONArray(cadenaJson);

        // Nota: creamos la lista para ejemplos ilustrativos, no es necesaria
        //ArrayList<Mascota2> mascotas = new ArrayList();

        //iterar
        for (int i=0; i < arregloJson.length(); i++){
            // Obtener objeto a través del índice
            JSONObject posibleMascota = arregloJson.getJSONObject(i);
            
            // Acceder como accedíamos al jsonObject
            int edad = posibleMascota.getInt("edad");
            String nombre = posibleMascota.getString("nombre");
            
            // Luego de eso podemos crear la clase y obtener los beneficios
            // de la POO o usar los datos como nos plazca
            Persona2 mascota = new Persona2(nombre, edad);
            
            // Podemos hacer lo que sea con el objeto
            mascota.hablar();
            
            // Agregar a la lista, solo para ilustrar
            //mascotas.add(mascota);
            

    }
    }
    
        
    
    
    
}
