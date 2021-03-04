/**
 * 
 */
package ejercicio10;

/**
 * @author Mugre
 *
 */
public class Ameba {
	private int peso ;

	/**** Constructor ***/

	public Ameba() {
		
	}

	/****** Metodos *****/
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void come(int pesoComida) {
		this.peso += pesoComida -1;
	}
	public void come(Ameba a) {
		this.peso += a.peso-1;
		a.peso = 0;
	}
	
	public String toString() {
		return "Soy una ameba y peso "+this.peso+" microgramos";
	}
}
