/**
 * 
 */
package ejercicio4;

/**
 * @author Mugre
 *
 */
public class Fraccion {
	private int numerador;
	private int denominador;
	
	/***Constructor****/
	
	public Fraccion(int n, int d) {
		this.numerador = n;
		this.denominador = d;
		
	}
	
	/****Metodos****/
	 public String toString() {
		      return this.numerador + "/" + this.denominador;
		    }
	
	public Fraccion invierte() {
		int cambio = this.numerador;
		return new Fraccion( this.numerador = this.denominador, this.denominador = cambio);
	}
	
	public Fraccion multiplica(Fraccion f) {
			
		return new Fraccion(this.numerador* f.getNumerador(), this.denominador * f.getDenominador());
	}

	public Fraccion divide(Fraccion f) {
		return new Fraccion (this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
	}
	public Fraccion simplifica () {
		int numerador;
		int denominador;
		for(int i = 2; i < Math.min(this.numerador, this.denominador); i++){
			while(this.numerador % i == 0 && this.denominador % i == 0) {
				 this.numerador /= i;
				this.denominador /= i;
			}
		}
		return new Fraccion (this.numerador,this.denominador);
	}
	
	
	/****Getter y Setter***/
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	
}
