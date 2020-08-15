package aprendiendojava.uno;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class ClaseA {
	
	private int n1 = 100; // privada
	int n2 = 300; // paquete
	protected int n3 = 500; // protegida
	public int n4 = 1000; // publica
	private boolean javaEsBueno = true; // privada
	
	public void mostrar(){
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
		System.out.println("Java es bueno?: " + javaEsBueno);
	}

}
