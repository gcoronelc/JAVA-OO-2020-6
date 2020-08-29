package aprendiendojava.service;

import aprendiendojava.model.ClienteModel;
import aprendiendojava.service.spec.Mantenimiento2Spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class ClienteService implements Mantenimiento2Spec<ClienteModel>{

	@Override
	public void insertar(ClienteModel model) {
		System.out.println("Se inserto el cliente: " + model.getNombre() );
	}

	@Override
	public void modificar(ClienteModel model) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void eliminar(int id) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
