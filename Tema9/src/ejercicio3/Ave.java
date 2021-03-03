/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public class Ave extends Animal {
	/***Atributos Instancia**/
	private String tipoPluma; 
	private String tipoPico;
	private String colorPluma;
	private int velocidadVuelo;
	
	/**Constructor**/
	public Ave(String raza) {
		super(raza);
	}
	/*public Ave(String colorPluma) {
		this.colorPluma = colorPluma;
	}*/
	public Ave() {
		
	}
	/***Metodos***/
	public void vuela(int distancia, int altura, int velocidad){
		System.out.println("Estoy volando a "+altura+" metros sobre el suelo y a una velocidad de "+velocidad+" km/h");
		this.setKilometrosRecorridos(this.getKilometrosRecorridos()+distancia) ;
	}
	void carrera (Ave contrincante) {
		
	}
	
	
	/***Metodo Setter**/
	
	public void setVelocidadVuelo(int velocidadVuelo) {
		this.velocidadVuelo = velocidadVuelo;
	}
	
}
