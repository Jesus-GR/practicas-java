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
	private static int numPizzasPedidas;
	private static int numPizzasServidas;
	/** Atributos de instancia **/
	private String tamaño;
	private String tipo;
	private String estado= "pedida";
	/*Constructor*/
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		numPizzasPedidas++;
	}

	/** Metodos **/
		
	public String toString() {
			return ("Pizza "+this.tamaño+" "+ this.tipo+" ,"+this.estado);
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
	
	public static int getNumPizzasPedidas() {
		return numPizzasPedidas;
	}

	public static int getNumPizzasServidas() {
		return numPizzasServidas;
	}
	
	
		
	}

