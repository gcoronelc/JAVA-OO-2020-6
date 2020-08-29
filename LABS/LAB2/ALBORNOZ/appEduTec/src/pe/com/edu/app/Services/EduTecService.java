
package pe.com.edu.app.Services;

import pe.com.edu.app.dto.EduTecDto;


public class EduTecService {
   
    public EduTecDto Calculo2(EduTecDto edu){
        //variables
         double calc;
       //proceso         
        calc=(edu.getNum1()+edu.getNum2())/2;
        //reporte
        edu.setResultado(calc);
        //salida
        return edu;
    }
    public EduTecDto Calculo3(EduTecDto edu){
        //variables
         double calc;
       //proceso         
        calc=(edu.getNum1()+edu.getNum2()+edu.getNum3())/3;
        //reporte
        edu.setResultado(calc);
        //salida
        return edu;
    }
    public EduTecDto Calculo4(EduTecDto edu){
        //variables
         double calc;
       //proceso         
        calc=(edu.getNum1()+edu.getNum2()+edu.getNum3()+edu.getNum4())/4;
        //reporte
        edu.setResultado(calc);
        //salida
        return edu;
    }
    public EduTecDto Calculo5(EduTecDto edu){
        //variables
         double calc;
       //proceso         
        calc=(edu.getNum1()+edu.getNum2()+edu.getNum3()+edu.getNum4()+edu.getNum5())/5;
        //reporte
        edu.setResultado(calc);
        //salida
        return edu;
    }
       
      
   
}
