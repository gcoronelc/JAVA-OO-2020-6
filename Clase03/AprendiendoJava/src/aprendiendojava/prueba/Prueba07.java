package aprendiendojava.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba07 {

	public static void main(String[] args) {
		
		// Forma 1: Recorrido indexado
		/*
		int notas[];
		notas = new int[5];
		notas[0] = 15;
		notas[1] = 18;
		notas[2] = 13;
		notas[3] = 17;
		notas[4] = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println("nota " + i + ": " + nota);
		}
		*/
		
		// Forma 2: For EACH
		/*
		int[] notas = {12,54,67,21,45,67};
		for (int nota : notas) {
			System.out.println("nota: " + nota);
		}
		*/
		
		// Forma 3
		int[] notas;
		notas = new int[]{54,76,89,34,56,78};
		for (int nota : notas) {
			System.out.println("Nota: " + nota);
		}
		
	}
}
