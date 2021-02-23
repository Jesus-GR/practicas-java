/**
 * 
 */
package ejercicio6;

/**
 * @author Mugre
 *
 */
public class Tiempo {
	/**
	 * Atributos de tiempo
	 */
	public int horas;
	public int minutos;
	public int segundos;
	
	/*Constructor*/
	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	/**Metodos**/
	
	public Tiempo suma(Tiempo t1) {
		
		int sumaSegundos = this.segundos + t1.segundos;
		int sumaMinutos = this.minutos + t1.minutos;
		int sumaHoras = this.horas + t1.horas;
		if(sumaSegundos >= 60) {
			sumaSegundos = 00;
			sumaMinutos +=1;
		}
		if(sumaMinutos >= 60) {
			sumaSegundos = 00;
			sumaMinutos = 00;
			sumaHoras +=1;
		}
		if(sumaHoras >=24) {
			sumaHoras = 00;
		}
		
		return new Tiempo (this.horas = sumaHoras, this.minutos = sumaMinutos, this.segundos = sumaSegundos) ;
		
	}
	
	public Tiempo resta(Tiempo t1) {
		int restaSegundos = this.segundos-t1.segundos;
		int restaMinutos = this.minutos - t1.minutos;
		int restaHoras = this.horas - t1.horas;
		if(this.segundos < t1.segundos) {
			System.out.println("No es posible obtener un resultado negativo");
			return new Tiempo (this.horas = restaHoras, this.minutos = restaMinutos, this.segundos = 0);
			
		}
		if(this.minutos < t1.minutos) {
			System.out.println("No es posible obtener un resultado negativo");
			return new Tiempo (this.horas = restaHoras, this.minutos = 0, this.segundos = restaSegundos);
			
		}
		if(this.horas < t1.horas) {
			System.out.println("No es posible obtener un resultado negativo");
			return new Tiempo (this.horas = 0, this.minutos = restaMinutos, this.segundos = restaSegundos);
			
		}
		
		return new Tiempo(this.horas = restaHoras, this.minutos = restaMinutos, this.segundos = restaSegundos);
	}
	
	public String toString() {
	
		return this.horas+" h "+this.minutos+" m "+this.segundos+" s ";
	}
	
}
