package pe.edu.uni.practica03.service;

import pe.edu.uni.practica03.dto.PagoDto;

public class Practica03Service {
    
    private int cant_horas, cant_dias;
    private double pagoxhoras, salario, renta, total;

    public void setCant_horas(int cant_horas) {
        this.cant_horas = cant_horas;
    }

    public void setCant_dias(int cant_dias) {
        this.cant_dias = cant_dias;
    }

    public void setPagoxhoras(double pagoxhoras) {
        this.pagoxhoras = pagoxhoras;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double calcSalario(){
        salario = cant_horas * cant_dias * pagoxhoras;
        return salario;
    }
    
    public double calcRenta(double salario){
        if(salario >= 1500){
            renta = salario * 0.08;
        }
        else{
            renta = 0;
        }
        return renta;
    }
    
    public double calcTotal(double salario){
        total = salario - calcRenta(salario);
        return total;
    }
    
	 
	 public PagoDto procSalario( PagoDto dto){
		 
		 
		 return dto;
	 }
	 
}
