package aprendiendojava.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba12 {
	
	public static void main(String[] args) {
		
		double prom1 = calcPromedio( 15, 18 );
		double prom2 = calcPromedio( 15, 18.0, 19 );
		double prom3 = calcPromedio( 15, 18, 16, 14 );
		
		System.out.println("Prom1: " + prom1);
		System.out.println("Prom2: " + prom2);
		System.out.println("Prom3: " + prom3);
		
	}

	private static double calcPromedio(double ... notas) {
		double prom = 0;
		for (double nota : notas) {
			prom += nota;
		}
		prom /= notas.length;
		return prom;
	}

}
