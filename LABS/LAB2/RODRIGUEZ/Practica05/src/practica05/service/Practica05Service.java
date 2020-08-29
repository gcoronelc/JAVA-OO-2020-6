
package practica05.service;

public class Practica05Service {
    
    int num1, num2;
    int factorial, mcd, mcm;
    String primo, fibonacci;
    
    public Practica05Service(){
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public Practica05Service(int num1){
        this.num1 = num1;
    }
    
    public Practica05Service(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }

    public int getMcd() {
        return mcd;
    }

    public void setMcd(int mcd) {
        this.mcd = mcd;
    }

    public int getMcm() {
        return mcm;
    }

    public void setMcm(int mcm) {
        this.mcm = mcm;
    }

    public String getPrimo() {
        return primo;
    }

    public void setPrimo(String primo) {
        this.primo = primo;
    }

    public String getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(String fibonacci) {
        this.fibonacci = fibonacci;
    }
    
}
