package aprendiendojava.prueba;

import aprendiendojava.service.CuadradoService;
import aprendiendojava.service.RectanguloService;
import aprendiendojava.service.TierraService;
import aprendiendojava.service.spec.CalculoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba07 {

	public static void main(String[] args) {
		
		TierraService obj1 = new TierraService();
		CalculoSpec var1 = obj1;
		
		CalculoSpec obj2 = new CuadradoService();
		CuadradoService var2 = (CuadradoService) obj2;
		
		System.out.println("Autor 2: " + var2.getAutor2());
		
		CuadradoService obj3 = new CuadradoService();
		//RectanguloService var3 = (RectanguloService) obj3;
		
	}
	
}
