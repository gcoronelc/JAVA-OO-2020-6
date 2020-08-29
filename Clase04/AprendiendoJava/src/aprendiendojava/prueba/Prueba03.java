package aprendiendojava.prueba;

import aprendiendojava.service.spec.CalculoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		
		// Clase anónima
		CalculoSpec obj = new CalculoSpec() {
			@Override
			public double calcArea() {
				return 1000;
			}
		};
		
		System.out.println(obj.calcArea());
	}

}
