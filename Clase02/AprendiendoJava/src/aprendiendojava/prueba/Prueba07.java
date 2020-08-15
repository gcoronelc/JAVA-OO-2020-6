package aprendiendojava.prueba;

import aprendiendojava.service.DemoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba07 {
	
	public static void main(String[] args) {
		DemoService service = new DemoService();
		
		System.out.println("Caso 1: " + service.operar());
		System.out.println("Caso 2: " + service.operar(20));
		System.out.println("Caso 3: " + service.operar("Gustavo"));
		System.out.println("Caso 4: " + service.operar(20, "Gustavo"));
		System.out.println("Caso 5: " + service.operar(20.0, "Gustavo"));
	}

}
