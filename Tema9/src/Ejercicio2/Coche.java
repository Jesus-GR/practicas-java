/**
 * 
 */
package Ejercicio2;

/**
 * @author Mugre
 *
 */
public class Coche extends Vehiculo {
	/******Atributos de instancia***/
	private int vidaUtilRuedas = 100;
	/******Constructor*****/
	public Coche() {
		vehiculosCreados++;
	}
	/*****Metodos*****/
	
	
	public void quemaRuedas() {
		if(vidaUtilRuedas > 10) {
			System.out.println("Estoy quemando ruedas");
			vidaUtilRuedas -= 10;
			System.out.println("Estoy desgastando las ruedas, ahora estan al "+vidaUtilRuedas+"%");
		}else {
			System.out.println("Lo siento, las ruedas han explotado");
		}
		
	}
}
