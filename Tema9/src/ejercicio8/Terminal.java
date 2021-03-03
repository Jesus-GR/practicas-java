/**
 * 
 */
package ejercicio8;

/**
 * @author Mugre
 *
 */
public class Terminal {
	private String numero;
	private int tiempoConversacion;
	
	/**Constructor**/
	public Terminal(String n) {
		this.numero = n;
	}
	
	/**Metodos**/
	public  void llama( Terminal x, int tiempo) {
		this.tiempoConversacion += tiempo;
		x.tiempoConversacion += tiempo;
	}
	
	public String toString(){
		return "Nº "+this.numero+" - "+this.tiempoConversacion+"s de conversacion";
	}
}
