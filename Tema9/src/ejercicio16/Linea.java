/**
 * 
 */
package ejercicio16;

/**
 * @author Mugre
 *
 */
public class Linea {
	private Punto origen;
	private Punto fin;
	
	public Linea(Punto origen, Punto fin) {
		this.origen = origen;
		this.fin = fin;
		
		}
		public String toString() {
			return "Linea formada por los puntos " + origen + " y " +fin;
		}
	}

