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
	public Gato (String raza, String sexo) {
		super(raza,sexo);

		/*this.setRaza(raza);*/
		
	}
	public Gato() {
		
	}
	public Gato( boolean estaEnCelo) {
		super();
		this.estaEnCelo = estaEnCelo;
	}
	
	
	
	/***Metodo***/
	
	public void maulla() {
		System.out.println("Miau");
	}
}
