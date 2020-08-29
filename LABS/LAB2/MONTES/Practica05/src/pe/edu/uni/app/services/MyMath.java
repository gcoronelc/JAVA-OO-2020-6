/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.services;

/**
 *
 * @author montespierreg
 */
public class MyMath {
    
    
    
    public int f(int n){
        int fact;
        
        if(n == 1){
		fact = 1;
        }else{

		fact = n * f(n-1);
        }
        
        return fact;
    }
    
    //////////////////////////////////////////////
    
    public double mcd(int n1, int n2){
        double a,b, mcd = 0;
        
        a = Math.max(n1, n2);
        b = Math.min(n1, n2);
        
        while(b!=0){
            mcd = b;
            
            b = a%b;
            
            a = mcd;
        }
        
        return mcd;
    }
    
    public double mcm(int n1, int n2){
        double a,b, mcm = 0;
        
        a = Math.max(n1, n2);
        b = Math.min(n1, n2);
        
        mcm = (a / mcd(n1, n2))*b;
        
        return mcm;
    }
    
    public String calcTotM(int n1, int n2){
        
        return("El M.C.M. entre " + n1 +" y " + n2 +" es: "+ mcm(n1, n2) + "\n" +
               "El M.C.D. entre " + n1 +" y " + n2 +" es: "+ mcd(n1, n2));
    }
    
   public int fibonacci(int n){
        if (n>1){
           return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
         }
    }
   
   public String totFib(int n){
       String fb = "";
       for(int i = 0; i < n; ++i){
           fb = fb + "\n " + fibonacci(i);
       }
       return fb;
   }
   ////////////////////////////
   
   public String primo(int hasta){
       String prm = "";
        int desde = 2;
        boolean esPrimo;

        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                prm = prm + "\n " + i;
            }
        }
        return prm;
   }
}
