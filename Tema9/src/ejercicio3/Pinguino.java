/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public class Pinguino extends Ave {

	
	/**Metodos**/
	
	@Override
	public void vuela(int distancia, int altura, int velocidad) {
		System.out.println("No puedo volar...Pero puedo nadar");
	}
	
	public void nada(int distancia, int profundidad, int velocidad) {
		System.out.println("Estoy nadando a una profundidad de "+profundidad+ " metros y a una velocidad de "+velocidad+" km/h");
		this.setKilometrosRecorridos(this.getKilometrosRecorridos()+distancia);
	}
}
