/**
 * 
 */
package ejercicio9;
import java.text.DecimalFormat;


/**
 * @author Mugre
 *
 */
public class Movil extends Terminal {
	private String tipoTarifa ;
	private double tarifa;
	private double tarifado = 0;

	/** Constructor **/
	public Movil(String n, String a) {
		this.numero = n;
		this.tipoTarifa = a;
		this.tarifa = 0;
	}

	/** Metodos **/
	public void llama(Movil x, int tiempo) {
		this.tiempoConversacion += tiempo;
		x.tiempoConversacion+=tiempo;
		this.tarifado += tiempo;
		
		double minutos =this.tarifado/60;
		if (this.tipoTarifa == "rata") {
			this.tarifa = minutos * 0.06;
		} else if (this.tipoTarifa == "mono") {
			this.tarifa =  minutos * 0.12;
		} else if (this.tipoTarifa == "bisonte") {
			this.tarifa = minutos * 0.30;
		}
		 

	}
	
	public String toString() {
		DecimalFormat formatoEuros = new DecimalFormat("0.00");
		 return "Nº "+this.numero+" - "+this.tiempoConversacion+"s de conversacion - tarificados "+formatoEuros.format(this.tarifa) + " euros";
	}
}
