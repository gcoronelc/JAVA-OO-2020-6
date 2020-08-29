/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.prueba;

import pe.edu.uni.app.service.EdutecService;

/**
 *
 * @author montespierreg
 */
public class Prueba01 {
    public static void main(String[] args) {
        
        EdutecService servicio = new EdutecService();
        
        int n1, n2, n3, n4, n5;
     
        double prom1, prom2, prom3, prom4;
        
        n1=3;
        n2=4;
        n3=5;
        n4=6;
        n5=7;
        
        prom1 = servicio.promNum(n1, n2);
        prom2 = servicio.promNum(n1, n2, n3);
        prom3 = servicio.promNum(n1, n2, n3, n4);
        prom4 = servicio.promNum(n1, n2, n3, n4, n5);
        
        System.out.println(prom1);
        System.out.println(prom2);
        System.out.println(prom3);
        System.out.println(prom4);

    }
    
    
    
}
