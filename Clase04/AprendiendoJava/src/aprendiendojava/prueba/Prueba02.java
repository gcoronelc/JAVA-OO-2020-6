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
public class Prueba02 {
	
	public static void main(String[] args) {
		
		CuadradoService cuadrado1 = new CuadradoService();
		cuadrado1.setLado(5);
		mostrarArea( cuadrado1 );
		
		RectanguloService rectangulo1 = new RectanguloService();
		rectangulo1.setBase(7);
		rectangulo1.setAltura(8);
		mostrarArea( rectangulo1 );
		
		TierraService tierra = new TierraService();
		mostrarArea( tierra );
		
		System.out.println("Autor: " + CalculoSpec.getAutor());
		System.out.println("Autor: " + tierra.getAutor2());
		System.out.println("IGV: " + CalculoSpec.IGV);
		
	}

	private static void mostrarArea(CalculoSpec figura) {
		System.out.println("Area: " + figura.calcArea());
	}

}
