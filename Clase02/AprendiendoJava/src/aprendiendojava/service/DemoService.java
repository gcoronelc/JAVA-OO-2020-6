package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class DemoService {

	public int operar(){
		return 10;
	}
	public int operar(int n){
		return n*2;
	}
	public String operar(String dato){
		return dato;
	}
	public String operar(int n, String nombre){
		return (nombre + " - " + n);
	}
	public String operar(double n, String nombre){
		return (nombre + " - " + n);
	}
	
}
