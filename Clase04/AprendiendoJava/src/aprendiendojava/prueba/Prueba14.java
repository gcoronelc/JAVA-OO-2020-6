package aprendiendojava.prueba;

import aprendiendojava.model.ClienteModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba14 {

	public static void main(String[] args) {
		// LISTA GENERICA
		List lista =  new ArrayList();
		lista.add(3456);
		lista.add(3456.56);
		lista.add("Gustavo Coronel");
		lista.add(new ClienteModel(190, "Gustavi Coronel"));
		lista.add(3456);
		lista.add("Gustavo Coronel");
		
		/*
		for (Object object : lista) {
			System.out.println(object);
		}
		*/
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));			
		}
		
		// LISTA ESPECIFICAS
		List<String> lista2 = new ArrayList<>();
		lista2.add("Gustavo Coronel");
		lista2.add("Claudia Ramirez");
		lista2.add("Jorge Torres");
		lista2.add("Laura ruiz");
		lista2.add("Javier Romero");
		
		lista2.add(2, "Carmen Montes");
		lista2.set(3, "César Quispe");
		lista2.remove(4);
		
		System.out.println("=============================");
		for (String string : lista2) {
			System.out.println(string);
		}
	}
}
