/**
 * 
 */
package Ejercicio2;

/**
 * @author Mugre
 *
 */
public class Vehiculo {
	/********Atributos de clase******/
	public static int vehiculosCreados;
	public static int kilometrosTotales;
	/**********Atributos de instancia*******/
	public int kilometrosRecorridos;
	/******Metodos****/
	
	public void kilometrosTotales() {
		kilometrosTotales += kilometrosRecorridos;
	}
	
	public void anda(int km) {
		this.kilometrosRecorridos += km;
		Vehiculo.kilometrosTotales += km;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	
}
