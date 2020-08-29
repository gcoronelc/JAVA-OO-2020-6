
package pe.edu.uni.EduTec.prueba;

import pe.edu.uni.EduTec.service.EduTecService;


public class EduTecPrueba {
    public static void main(String[] args) {
        double n1=15;
        double n2=9;
        double n3=17;
        double prom;
        EduTecService ets=new EduTecService();
        prom=ets.calcularPromedio(n1,n2,n3);
        System.out.println("Promedio: "+prom);
    }
}
