  /**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public abstract class  Animal {
	
	/***Atributos de instancia****/
	private String sexo;
	private int  altura; //En cm
	private int  anchura;// En cm 
	private String raza;
	private int kilometrosRecorridos;
	private String tipoAlimentacion; //Por ejemplo, carnívoro, herbíburo...
	private String tipoComida; // Por ejemplo, pescado, carne
	
	/***Constructor***/
	public Animal(String raza, String sexo) {
		this.raza = raza;
		this.sexo = sexo;
	}
	
	public Animal(String raza) {
		this.raza = raza;
	}
	
	public Animal() {
		
	}
	
	/****Añadir métodos como come, duerme, se aparea con...//
	
	
	/****Getter***/
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
		
	
	
	}

