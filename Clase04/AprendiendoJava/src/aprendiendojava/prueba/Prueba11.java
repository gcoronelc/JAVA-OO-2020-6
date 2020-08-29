package aprendiendojava.prueba;

import java.util.Arrays;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba11 {

	public static void main(String[] args) {
		
		int[] notas = {16,12,10,14,8,13};
		
		Arrays.sort(notas);
		int suma = 0;
		for (int i = 2; i < notas.length; i++) {
			int nota = notas[i];
			suma += nota;
		}
		double prom = suma * 1.0 / (notas.length - 2);
		
		System.out.println("Promedio: " + prom);
	}
	
	
}
