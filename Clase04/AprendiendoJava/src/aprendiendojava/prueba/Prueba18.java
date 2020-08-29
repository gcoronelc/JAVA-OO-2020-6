package aprendiendojava.prueba;

import aprendiendojava.util.NotaFueraRango;
import javax.swing.JOptionPane;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba18 {

	public static void main(String[] args) {

		try {
			int n1 = 40;
			int n2 = 5;
			
			if( n1 > 20 ){
				throw new NotaFueraRango("No te pases con este nota.");
			}

			if (n2 == 0) {
				throw new Exception("División por cero.");
			}
			int divi = n1 / n2;

			System.out.println("División: " + divi);
		} catch (Exception e) {
			// System.err.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
		} finally{
			System.out.println("Bien, ahora los errores no pasan.");
		}

	}

}
