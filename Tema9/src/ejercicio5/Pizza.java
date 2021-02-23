/**
 * 
 */
package ejercicio5;

/**
 * @author Mugre
 *
 */
public class Pizza {
	/** Atributos de clase **/
	public static int numPizzasPedidas;
	public static int numPizzasServidas;
	/** Atributos de instancia **/
	private String tama�o;
	private String tipo;
	private String estado= "pedida";
	/*Constructor*/
	public Pizza(String tama�o, String tipo) {
		this.tama�o = tama�o;
		this.tipo = tipo;
		numPizzasPedidas++;
	}

	/** Metodos **/
		
	public String toString() {
			return ("Pizza "+this.tama�o+" "+ this.tipo+" ,"+this.estado);
		}
	
	public String sirve() {
		if(this.estado == "servida") {
			System.out.println("Esa pizza ya se ha servido");
			return null;
		}else {
			numPizzasServidas++;
		return this.estado = " servida";
		}
		
	}

	/***Getter y Setter***/
	
	public int getNumPizzasPedidas() {
		return numPizzasPedidas;
	}

	public int getNumPizzasServidas() {
		return numPizzasServidas;
	}
	
	
		
	}

