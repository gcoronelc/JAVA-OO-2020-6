package aprendiendojava.herencia;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Clase2 extends Clase1{
	
	public String profesor = "Eric Coronel";

	public Clase2() {
		super();
		System.out.println("Ahora estoy en la Clase2!!!!");
	}

	@Override
	public int sumar(int n1, int n2) {
		int suma;
		suma = (n1 + n2) * (n1 - n2);
		return suma;
	}
	
	public int sumar(int n1, int n2, int n3) {
		int suma;
		suma = (n1 + n2) * (n1 - n2);
		return suma;
	}

	public String obtenerProfesor(){
		return this.profesor + " - " + super.profesor;
	}
	
}