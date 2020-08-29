
package pe.com.edu.app.Pruebas;

import pe.com.edu.app.Services.EduTecService;
import pe.com.edu.app.dto.EduTecDto;


public class Prueba01 {
 
    public static void main(String[] args) {
        //variables
        EduTecDto educ=new EduTecDto();
        //datos
        educ.setNum1(10.0);
        educ.setNum2(20.0);
        //proceso
        EduTecService eduTec=new EduTecService();
        educ=eduTec.Calculo2(educ);
        //reporte
        System.out.println("Promedio de dos numeros   :" + educ.getResultado());
        
    }
  
          
    
}
