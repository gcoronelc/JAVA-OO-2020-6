
package pe.com.edu.app.dto;

public class EduTecDto {
    //variables de entrada
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double num5;
    //variables de salida
    private double  resultado;
   //valores por defecto
    public EduTecDto() {
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.num3 = 0.0;
        this.num4 = 0.0;
        this.num5 = 0.0;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
