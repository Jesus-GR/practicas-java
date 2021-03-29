/**
 * 
 */
package ejercicio18;

/**
 * @author Mugre
 *
 */
public class Incidencia {
	private int puesto;
	private String problema;
	private String solucion = "";
	private String estado = "pendiente";
	private int numero = 0 ;
	private static int pendientes;
	
	/****Constructor*****/
	
	public Incidencia(int numero, String problema) {
		this.puesto = numero;
		this.problema = problema;
		this.numero ++;
		this.pendientes++;
	}
	
	/******Metodos****/
	
	public void resuelve(String solulcion) {
		this.estado = "resuelta";
		this.solucion = (solulcion);
		this.pendientes--;
	
	}
	
	
	public String toString() {
		if(estado.equals("pendiente")){
			return "Incidencia "+this.numero+" - Puesto: "+this.puesto+" - "+this.problema+" - "+this.estado;
		}else {
			return  "Incidencia "+this.numero+" - Puesto: "+this.puesto+" - "+this.problema+" - "+this.estado+" - "+this.solucion;
		}
		
	}

	

	
	
	/******Getter*****/
	
	public static int getPendientes() {
		return pendientes;
	}
	
}
