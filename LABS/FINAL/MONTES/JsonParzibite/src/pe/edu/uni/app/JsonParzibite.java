/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app;

/**
 *
 * @author montespierreg
 */
public class JsonParzibite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "https://jsonplaceholder.typicode.com/todos";
        
        String respuesta = "";
        
        try{
            respuesta = Peticion.peticionHttpGet(url);
            System.out.println("La respuesta es: \n" + respuesta);
        } catch (Exception e){
            //Manejar exception
            System.out.println("Error en petición");
            e.printStackTrace();
        }
    }
    
}
