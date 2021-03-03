/**
 * 
 */
package Ejercicio2;

/**
 * @author Mugre
 *
 */
public class Bicicleta extends Vehiculo {
	/******Atributo de instancia****/
	
	/***Constructor****/
	public Bicicleta() {

		Vehiculo.setVehiculosCreados(getVehiculosCreados()+1);
	}
	/**Metodos**/
	
	public void caballito() {
		System.out.print("No quiero, me parece algo peligroso. ");
	}
}
