/**
 * 
 */
package ejercicio17;

/**
 * @author Mugre
 *
 */
public class Rectangulo {
	
	private static int rectangulosCreados;
	
	private int alto;
	private int largo;

	
	/*****Constructor******/
	
	public Rectangulo (int largo, int alto) {
		this.alto = alto;
		this.largo = largo;
		this.rectangulosCreados ++;
	}
	
	
	/******Metodos*****/
	
	public String toString() {
		String rectangulo = "";
		
		for (int i = 0; i < this.alto; i++) {
			for (int j = 0; j < this.largo; j++) {
				rectangulo += "*";
			}
			rectangulo+= "\n";
		}
		
		return rectangulo;
	}

/******SETTER****/
	public static int getRectangulosCreados() {
		return rectangulosCreados;
	}
	
	
}
