package aprendiendojava.service.spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public interface CalculoSpec {
	
	// Son constantes
	double IGV = 0.18;

	double calcArea();
	
	static String getAutor(){ 
      return "Gustavo Coronel"; 
   }
	
	default String getAutor2(){ 
      return "Gustavo Coronel Castillo"; 
   } 
	 
	
}
