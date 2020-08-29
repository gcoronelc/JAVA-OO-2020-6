
package practica05.model;

public class Practica05MyMath {
    
    public int calcularFactorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public int calcularMCD(int num1, int num2){
        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }
            else{
                num2 -= num1;
            }
        }
        return num1;
    }
    
    public int calcularMCM(int num1, int num2){
        int mcm, i;
        mcm=1;
        i=2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        }
        
        return mcm;
    }
    
    public String calcularFibonacci(int num){
        int num1 = 0, num2 = 1, suma = 1;
        String serie="0";
        
        for (int i = 1; i < num; i++) {
             
            serie = serie + "," + suma;
             
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;

        }
        
        return serie;
        
    }
    
    public String calcularPrimo(int num){
        if(num % 2 == 0){
            return "NO ES PRIMO";
        }
        else{
            return "ES PRIMO";
        }
    }
    
}
