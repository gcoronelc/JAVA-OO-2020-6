package aprendiendojava.prueba;

import aprendiendojava.herencia.Clase1;
import aprendiendojava.herencia.Clase2;
import aprendiendojava.herencia.Clase3;
import aprendiendojava.model.MujerModel;
import aprendiendojava.model.PersonaAbstract;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba06 {

	public static void main(String[] args) {
		
		MujerModel obj = new MujerModel();
		Clase1 obj2 = new Clase2();
		
		System.out.println("obj es compatible con PersonaAbstract? " + (obj instanceof PersonaAbstract?"SI":"NO"));
		System.out.println("obj es compatible con MujerModel? " + (obj instanceof MujerModel?"SI":"NO"));
		System.out.println("obj2 es compatible con Clase2? " + (obj2 instanceof Clase2?"SI":"NO"));
		System.out.println("obj2 es compatible con Clase3? " + (obj2 instanceof Clase3?"SI":"NO"));
		
		//Clase3 obj3 = (Clase3) obj2;
	}
}
