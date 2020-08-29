package aprendiendojava.service;

import aprendiendojava.service.spec.CalculoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class RectanguloService implements CalculoSpec{

	private int base;
	private int altura;

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	@Override
	public double calcArea() {
		return base * altura;
	}

}
