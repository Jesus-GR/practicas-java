/**
 * 
 */
package ejercicio9;

/**
 * @author Mugre
 *
 */
public class Terminal {
	public String numero;
	public double tiempoConversacion;
	
	/**Constructor**/
	
	
	/**Metodos**/
	public  void llama( Terminal x, int tiempo) {
		this.tiempoConversacion += tiempo;
		x.tiempoConversacion += tiempo;
	}
	/*Getter y Setter*/
	
	
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public double getTiempoConversacion() {
		return tiempoConversacion;
	}


	public void setTiempoConversacion(double tiempoConversacion) {
		this.tiempoConversacion = tiempoConversacion;
	}

	/***toString**/
	public String toString(){
		return "Nº "+this.numero+" - "+this.tiempoConversacion+"s de conversacion";
	}
}
