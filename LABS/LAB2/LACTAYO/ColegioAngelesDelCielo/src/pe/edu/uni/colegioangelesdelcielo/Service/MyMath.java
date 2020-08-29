
package pe.edu.uni.colegioangelesdelcielo.Service;


public class MyMath {
    
    public static int factorial(int numero)
    {
        if(numero==0)
            return 1;
        else
        {
            int n=numero;
            for(int i=n-1;i>0;i--)
                n*=i;
            return n;
        }
    }
    public static int mcd(int n1,int n2)
    {
        int mod=-1;
        if(n1>=n2)
        {
            for(int i=2;i<=n1;i++){
                if(n1%i==0){
                    if(n2%i==0)
                        mod=i;
                }
            }
        }
        else{
            for(int i=2;i<=n2;i++){
                if(n2%i==0){
                    if(n1%i==0)
                        mod=i;
                }
            }
        }
        if(mod!=-1)
            return mod;
        else
            return 1;
    }
    public static int mcm(int n1,int n2)
    {
        return (n1*n2)/mcd(n1,n2);
    }
    public static String primo(int n)
    {
        String esPrimo="Primo";
        if(n!=1)
        {
            for(int i=n-1;i>1;i--)
            {
                if(n%i==0)
                    esPrimo="No primo";
            }
        }else
            esPrimo="No primo";
        return esPrimo;
    }
    public static String fibonacci(int nTerminos)
    {
        String serie="";
        int n=-1;
        int n1=1;
        int c;
        for(int i=0;i<nTerminos;i++)
        {
            c=n+n1;
            n=n1;
            n1=c;
            if(i==0)
                serie+=""+c;
            else
                serie+=","+c;
        }
        return serie;
    }
}

