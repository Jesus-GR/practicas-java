/**
 * 
 */
package ejercicio17;

/**
 * @author Mugre
 *
 */
public class Piramide {
	private static int piramidesCreadas;

	private int altura;

	public Piramide(int altura) {
		this.altura = altura;
		this.piramidesCreadas ++;
		
	}

	public String toString() {
			return pintaPiramide(this.altura);
			
			
	}
	
	public String pintaPiramide(int altura) {
		String piramide = "";
		int planta = 1;
	    int longitudDeLinea = 1;
	    int espacios = altura - 1;
	    
	    while (planta <= altura) {
	      
	      // inserta espacios
	      for (int i = 1; i <= espacios; i++) {
	        piramide += ' ';
	      }

	      // pinta la línea
	      for (int i = 1; i <= longitudDeLinea; i++) {
	        piramide += '*';
	      }

	      piramide += '\n';

	      planta++;
	      espacios--;
	      longitudDeLinea += 2;
	    }
		 return piramide;
	}

	/*****GETTER****/
	public static int getPiramidesCreadas() {
		return piramidesCreadas;
	}
	
	
}
