package aprendiendojava.prueba;

import aprendiendojava.model.ClienteModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba10 {

	public static void main(String[] args) {
		//String[] nombres = new String[5];
		String[] nombres = {"Gustavo", "Ricardo", "Sergio", "Jose", "César"};
		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}

		
		System.out.println("======================================");
		ClienteModel lista[] = {
			new ClienteModel(300, "Ricardo"),
			new ClienteModel(301, "Gustavo"),
			new ClienteModel(302, "Karla"),
			new ClienteModel(303, "Manuel"),
			new ClienteModel(304, "Alicia"),
		}; 
		for (ClienteModel model : lista) {
			System.out.println(model.toString());
		}
		
	}
}
