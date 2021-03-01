/**
 * 
 */
package ejercicio7;

/**
 * @author Mugre
 *
 */
public class Zona {
	private int entradasPorVender;
	
	/***Constructor***/
	public Zona(int n) {
		this.entradasPorVender = n;
	}
	
	public int getEntradasPorVender() {
		return this.entradasPorVender;
	}
	
	public void vender(int n) {
		if(this.entradasPorVender == 0) {
			System.out.println("Lo siento, las entradas para esta zona estan agotadas");
		}else if(this.entradasPorVender < n) {
			System.out.println("Solo me quedan "+this.entradasPorVender+" entradas para esa zona");
		}else {
			this.entradasPorVender -=n;
			System.out.println("Aqui tiene sus "+n+" entradas, gracias");
		}
	}
}
