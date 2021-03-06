package aprendiendojava.service.spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public interface Mantenimiento2Spec<T> {
	
	void insertar(T model);
	
	void modificar(T model);
	
	void eliminar(int id);

}
