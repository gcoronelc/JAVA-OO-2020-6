package aprendiendojava.prueba;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba13 {

	public static void main(String[] args) {

		// SET GENERICO
		Set conjunto1 = new HashSet();
		conjunto1.add(12345);
		conjunto1.add(12345.0);
		conjunto1.add(1234.56);
		conjunto1.add("Gustavo");
		conjunto1.add(new String("Gustavo"));

		for (Object object : conjunto1) {
			System.out.println(object);
		}

		// SET STRING
		Set<String> conjunto2 = new HashSet<>();
		conjunto2.add("Claudia");
		conjunto2.add("Aurora");
		conjunto2.add("Gustavo");
		conjunto2.add("Aurora");

		System.out.println("==============================");
		for (String cadena : conjunto2) {
			System.out.println(cadena);
		}
	}

}
