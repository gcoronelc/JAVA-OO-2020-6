/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.appviaexitos.prueba;

import pe.edu.uni.appviaexitos.service.PagoService;

/**
 *
 * @author maran
 */
public class Prueba02 {
    public static void main(String[] args) {
        //Variables
        double horas, dias, precio, impuesto,pago;
        
        //Datos
        horas = 50;
        dias = 100;
        precio = 200;
        
        //Proceso
        PagoService service = new PagoService();
        impuesto = service.calcImpuesto(horas, dias, precio);
        pago = service.calcPago(horas, dias, precio);
        
        //Reporte
        System.out.println("Impuesto: "+ impuesto);
        System.out.println("Pago: "+ pago);
        System.out.println("Total: "+ horas * dias * precio);
        
        
    }
}
