package aprendiendojava.prueba;

import aprendiendojava.service.sqlserver.ProductoService;
import aprendiendojava.service.spec.MantenimientoSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {

	public static void main(String[] args) {
		MantenimientoSpec mant = new ProductoService();
		mant.insertar();
	}
}
