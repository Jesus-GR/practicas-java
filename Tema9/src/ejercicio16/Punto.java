/**
 * 
 */
package ejercicio16;

/**
 * @author Mugre
 *
 */
public class Punto {
	private double x;
	private double  y;
	
	/*********Constructor**********/
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
		
	}
	
}
