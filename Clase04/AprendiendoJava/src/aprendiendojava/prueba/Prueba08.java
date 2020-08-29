package aprendiendojava.prueba;

import aprendiendojava.model.ClienteModel;
import aprendiendojava.model.ProductoModel;
import aprendiendojava.service.ClienteService;
import aprendiendojava.service.ProductoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba08 {

	public static void main(String[] args) {
		
		ClienteModel cm = new ClienteModel(200, "Gustavo Coronel");
		ClienteService cService = new ClienteService();
		cService.insertar(cm);
		
		ProductoModel pm = new ProductoModel(500, "Televisor", 5000);
		ProductoService pService = new ProductoService();
		pService.insertar(pm);
		
	}
}
