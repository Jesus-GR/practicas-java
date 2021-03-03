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
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	/**********Atributos de instancia*******/
	private int kilometrosRecorridos;
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
	
	
	

	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	public void setKilometrosRecorridos() {
		
	}

	@Override
	public String toString() {
		return "Vehiculo [kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	
	
	
}
