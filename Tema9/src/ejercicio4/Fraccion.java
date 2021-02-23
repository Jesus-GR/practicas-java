/**
 * 
 */
package ejercicio4;

/**
 * @author Mugre
 *
 */
public class Fraccion {
	public int numerador;
	public int denominador;
	public int simbolo;
	
	/***Constructor****/
	
	public Fraccion(int n, int d) {
		if(n==0) {
			System.out.println("El numerador no puede ser 0");
		}else {
			if(n*d<0) {
				this.simbolo = -1;
			}else {
				this.simbolo = 1;
			}
		}
		this.numerador = n;
		this.denominador = d;
		
	}
	
	/****Metodos****/
	 public String toString() {
		      return this.numerador + "/" + this.denominador;
		    }
	
	public Fraccion invierte() {
		return new Fraccion( this.denominador, this.numerador);
	}
	
	public Fraccion multiplica(Fraccion f) {
		return new Fraccion(this.numerador* f.getNumerador(), this.denominador * f.getDenominador());
	}

	public Fraccion divide(Fraccion f) {
		return new Fraccion (this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
	}
	public Fraccion simplifica (Fraccion f) {
		
		
		
		return f;
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

	public int getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(int simbolo) {
		this.simbolo = simbolo;
	}
	
}
