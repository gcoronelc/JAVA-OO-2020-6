package aprendiendojava.uno;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class ClaseB {

	public void mostrar() {
		ClaseA obj = new ClaseA();
		//System.out.println("n1: " + obj.n1); // Por que la variable n1 es privada.
		System.out.println("n2: " + obj.n2);
		System.out.println("n3: " + obj.n3);
		System.out.println("n4: " + obj.n4);
	}
}
