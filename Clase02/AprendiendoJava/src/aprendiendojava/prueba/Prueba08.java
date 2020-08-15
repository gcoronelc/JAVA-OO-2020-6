package aprendiendojava.prueba;

import aprendiendojava.model.ProductoModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba08 {

	public static void main(String[] args) {
		
		ProductoModel prod01 = new ProductoModel("Televisor", 7000.0, 200, true);
	
		
		System.out.println("Nombre: " + prod01.getNombre());
		System.out.println("Precio: " + prod01.getPrecio());
		System.out.println("Stock: " + prod01.getStock());
		System.out.println("Activo: " + prod01.isActivo());
		
	}
	
	
}
