package pe.edu.uni.apppedido.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class PedidoService {
	
	public double calcImpuesto(double importe){
		double impuesto;
		impuesto = importe * 0.08;
		return impuesto;
	}

	public double calcTotal(double importe){
		double total;
                    if (importe > 1500){
                        total = importe - calcImpuesto(importe);
                    }
                     else {
                        total = importe;}                    
		return total;
	}
	
}
