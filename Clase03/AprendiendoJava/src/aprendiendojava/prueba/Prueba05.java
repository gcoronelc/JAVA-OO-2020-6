package aprendiendojava.prueba;

import aprendiendojava.model.HombreModel;
import aprendiendojava.model.MujerModel;
import aprendiendojava.model.PersonaAbstract;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba05 {

	public static void main(String[] args) {
		PersonaAbstract obj = new HombreModel();
		
		System.out.println("Cocinas?: " + obj.cocinar());
	}
	
}
