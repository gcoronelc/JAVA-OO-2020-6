
package pe.edu.uni.Practica02.Prueba;

import pe.edu.uni.Practica02.Service.Practica02Service;

public class Practica02Prueba {
    public static void main(String[] args) {
        double capital,importeAcumulado;
        int interes,periodos;
        
        capital=3500;
        interes=10;
        periodos=9;
        
        Practica02Service ps=new Practica02Service();
        
        ps.setCapital(capital);
        ps.setInteres(interes);
        ps.setPeriodos(periodos);
        
        importeAcumulado=ps.calcularImporte();
        importeAcumulado=(double)Math.round(importeAcumulado*100)/100;
        
        System.out.println("Importe acumulado: "+importeAcumulado);
    }
}
