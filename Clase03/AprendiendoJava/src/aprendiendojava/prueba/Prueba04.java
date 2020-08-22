package aprendiendojava.prueba;

import aprendiendojava.model.PersonaAbstract;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba04 {

	public static void main(String[] args) {
		PersonaAbstract obj = new PersonaAbstract() {
			@Override
			public String cocinar() {
				return "+/-";
			}
		};
		
		System.out.println("Cocinas?: " + obj.cocinar());
	}
	
}
