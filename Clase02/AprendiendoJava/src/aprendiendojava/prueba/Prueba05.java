package aprendiendojava.prueba;

import aprendiendojava.model.ProductoModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba05 {

	public static void main(String[] args) {
		
		ProductoModel prod01 = new ProductoModel();
		
		/*
		prod01.setNombre("Mascarilla");
		prod01.setPrecio(5.99);
		prod01.setStock(10000);
		prod01.setActivo(true);
		*/
		
		
		System.out.println("Nombre: " + prod01.getNombre());
		System.out.println("Precio: " + prod01.getPrecio());
		System.out.println("Stock: " + prod01.getStock());
		System.out.println("Activo: " + prod01.isActivo());
		
	}
	
	
}
