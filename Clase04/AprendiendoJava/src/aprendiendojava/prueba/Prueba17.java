package aprendiendojava.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba17 {

	public static void main(String[] args) {

		try {
			int n1 = 10;
			int n2 = 0;

			if (n2 == 0) {
				throw new Exception("División por cero.");
			}
			int divi = n1 / n2;

			System.out.println("División: " + divi);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally{
			System.out.println("Bien, ahora los errores no pasan.");
		}

	}

}
