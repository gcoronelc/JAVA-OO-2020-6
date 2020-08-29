/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.Practica02.Service;


public class comunes {
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public static boolean isDecimal(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //metodo para saber la cantidad de caracteres
//    public static int cantCaracter(String cad) {
//        int cant = 0;
//        for (int i = 0; i < cad.length(); i++) {
//            cant ++;
//        }
//        return cant;
//    }

}
