/*
Desarrollar un programa para sumar 2 numeros.
*/

package pe.edu.uni.app.demos;

import java.util.Scanner;


/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo02 {
	
	public static void main(String[] args) {
		// Variables
		int numero1, numero2, suma;
		Scanner scanner = new Scanner(System.in);
		// Lectura
		System.out.println("LECTURA DE DATOS");
		System.out.println("-----------------------------------");
		System.out.print("Número 1: ");
		numero1 = scanner.nextInt();
		System.out.print("Número 2: ");
		numero2 = scanner.nextInt();
		// Proceso
		suma = numero1 + numero2;
		// Reporte / Salida
		System.out.println("");
		System.out.println("REPORTE");
		System.out.println("---------------------------------------");
		System.out.println("Suma: " + suma);
	}
	
}
