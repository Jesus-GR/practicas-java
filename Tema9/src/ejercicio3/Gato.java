/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public class Gato extends Mamifero {
	private boolean estaEnCelo;
	
	/**Constructor**/
	public Gato (String raza) {
		super(raza);
		/*this.setRaza(raza);*/
		
	}
	public Gato() {
		
	}
	public Gato( boolean estaEnCelo) {
		super();
		this.estaEnCelo = estaEnCelo;
	}
	
	
	public Gato(String raza, boolean estaEnCelo) {
		super(raza);
		this.estaEnCelo = estaEnCelo;
	}
	
	
	/***Metodo***/
	
	public void maulla() {
		System.out.println("Miau");
	}
}
