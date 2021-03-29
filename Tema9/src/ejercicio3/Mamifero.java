/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public abstract class Mamifero extends Animal {
	private String tipoPelo;
	private int numMamas;
	
	/***Constructor***/
	public Mamifero(String raza, String sexo) {
		super(raza, sexo);
	}
	
	public Mamifero() {
		
	}
	public Mamifero(String tipoPelo, int numMamas) {
		this.tipoPelo = tipoPelo;
		this.numMamas = numMamas;
	}

	/***Métodos***/
	
	public void amamanta() {
		System.out.println("Estoy amamantando");
	}
	
	
	public void bebeLeche() {
		System.out.println("Estoy bebiendo leche...");
	}
}
