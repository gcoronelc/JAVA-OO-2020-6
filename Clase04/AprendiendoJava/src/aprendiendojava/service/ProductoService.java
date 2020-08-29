package aprendiendojava.service;

import aprendiendojava.model.ProductoModel;
import aprendiendojava.service.spec.Mantenimiento2Spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class ProductoService implements Mantenimiento2Spec<ProductoModel>{

	@Override
	public void insertar(ProductoModel model) {
		System.out.println("Se inserto el producto: " + model.getNombre() );
	}

	@Override
	public void modificar(ProductoModel model) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void eliminar(int id) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
