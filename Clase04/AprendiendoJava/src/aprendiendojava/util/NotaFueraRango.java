package aprendiendojava.util;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class NotaFueraRango extends Exception{

	public NotaFueraRango() {
		super("Nota fuera de rango.");
	}

	public NotaFueraRango(String mensaje) {
		super(mensaje);
	}
	
}
