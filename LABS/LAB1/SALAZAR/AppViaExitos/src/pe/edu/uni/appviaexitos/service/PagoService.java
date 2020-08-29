/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.appviaexitos.service;

/**
 *
 * @author maran
 */
public class PagoService {
    
    
    public double calcImpuesto(double horas, double dias, double precio){
        double total, impuesto;
        total = horas * dias * precio;
        if(total > 1500){
            impuesto = total * 0.08;
        } else {
            impuesto = 0;
        }
        return impuesto;
    }

    public double calcPago(double horas, double dias, double precio){
        double total, impuesto, pago;
        total = horas * dias * precio;
        impuesto = calcImpuesto(horas, dias, precio);
        pago = total - impuesto;
        return pago;
               
    }
    
            
    
    
}
