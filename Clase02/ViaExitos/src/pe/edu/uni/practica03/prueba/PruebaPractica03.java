package pe.edu.uni.practica03.prueba;

import pe.edu.uni.practica03.service.Practica03Service;

public class PruebaPractica03 {

	public static void main(String[] args) {

		int horas, dias;
		double pagoxhoras, salario, renta, total;

		horas = 8;
		dias = 20;
		pagoxhoras = 100;

		Practica03Service service = new Practica03Service();
		service.setCant_horas(horas);
		service.setCant_dias(dias);
		service.setPagoxhoras(pagoxhoras);

		salario = service.calcSalario();
		renta = service.calcRenta(salario);
		total = service.calcTotal(salario);

		System.out.println("Salario: " + salario);
		System.out.println("Renta: " + renta);
		System.out.println("Total: " + total);

	}

}
