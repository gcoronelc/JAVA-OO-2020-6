package aprendiendojava.service.oracle;

import aprendiendojava.service.spec.MantenimientoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class ProductoService implements MantenimientoSpec{

	@Override
	public void insertar() {
		System.out.println("Registro insertado en Oracle.");
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
