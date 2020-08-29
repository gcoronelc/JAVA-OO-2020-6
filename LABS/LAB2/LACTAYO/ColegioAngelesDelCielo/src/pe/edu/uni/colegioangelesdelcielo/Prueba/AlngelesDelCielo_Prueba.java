
package pe.edu.uni.colegioangelesdelcielo.Prueba;

import pe.edu.uni.colegioangelesdelcielo.Service.MyMath;

public class AlngelesDelCielo_Prueba {
    public static void main(String[] args) {
        int res=MyMath.factorial(6);
        String res2=MyMath.primo(793);
        int res3=MyMath.mcd(49, 52);
        int res4=MyMath.mcm(49, 52);
        String res5=MyMath.fibonacci(10);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        
    }
}
