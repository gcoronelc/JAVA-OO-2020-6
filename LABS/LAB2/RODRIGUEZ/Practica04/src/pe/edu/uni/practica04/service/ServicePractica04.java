package pe.edu.uni.practica04.service;

public class ServicePractica04 {

    private double num1, num2, num3, num4, num5;
    private double promedio;
    
    public ServicePractica04(){
        
    }
    
    public ServicePractica04(double num1, double num2){
        
        this.num1 = num1;
        this.num2 = num2;
        this.promedio = (num1 + num2)/2;
        
    }
    
    public ServicePractica04(double num1, double num2, double num3){
        
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.promedio = (num1 + num2 + num3)/3;
        
    }
    
    public ServicePractica04(double num1, double num2, double num3, double num4){
        
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.promedio = (num1 + num2 + num3 + num4)/4;
        
    }
    
    public ServicePractica04(double num1, double num2, double num3, double num4, double num5){
        
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.promedio = (num1 + num2 + num3 + num4 + num5)/5;
        
    }
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
