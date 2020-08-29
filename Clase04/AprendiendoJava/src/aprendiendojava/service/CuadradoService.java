package aprendiendojava.service;

import aprendiendojava.service.spec.CalculoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CuadradoService implements CalculoSpec{
	
	private int lado;

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcArea() {
		return lado * lado;
	}

}
