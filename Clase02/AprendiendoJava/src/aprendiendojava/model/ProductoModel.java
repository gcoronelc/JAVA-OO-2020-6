package aprendiendojava.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class ProductoModel {

	private String nombre;
	private double precio;
	private int stock;
	private boolean activo;

	public ProductoModel() {
		this.nombre = "Coca Cola";
		this.precio = 2.40;
		this.stock = 100;
		this.activo = true;
		System.out.println("Objeto creado.");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("Chau objeto.");
	}

}
