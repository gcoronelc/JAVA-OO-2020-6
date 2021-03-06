package aprendiendojava.service;

import aprendiendojava.service.spec.CalculoSpec;
import aprendiendojava.service.spec.MantenimientoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class TierraService implements CalculoSpec, MantenimientoSpec{

	@Override
	public double calcArea() {
		return 4566789;
	}

	@Override
	public void insertar() {
		System.out.println("Se inserto tierra.");
	}

	@Override
	public void modificar() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void eliminar() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
