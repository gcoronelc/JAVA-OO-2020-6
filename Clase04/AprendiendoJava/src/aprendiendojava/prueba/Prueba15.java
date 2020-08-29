package aprendiendojava.prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba15 {

	public static void main(String[] args) {
		Map<String,Object> datos = new HashMap<>();
		datos.put("001", "Chiclayo");
		datos.put("002", "Trujillo");
		datos.put("003", "Arequipa");
		datos.put("004", "Huancayo");
		datos.put("005", "Cusco");
		datos.put("003", "Iquitos");
		
		Set<String> claves = datos.keySet();
		for (String key : claves) {
			System.out.println(key + " - " + datos.get(key));
		}
		
	}
}
