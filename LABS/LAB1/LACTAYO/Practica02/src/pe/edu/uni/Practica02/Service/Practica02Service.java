
package pe.edu.uni.Practica02.Service;

public class Practica02Service {
    private double capital,importeAcumulado,interes;
    private int periodos;

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }
    
    public double calcularImporte()
    {
        importeAcumulado=capital*Math.pow((1+interes/100), periodos);
        return importeAcumulado;
    }
}
