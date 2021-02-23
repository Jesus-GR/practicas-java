package ejercicio4;

public class Fraccionn {
	  
	  private int signo;
	  private int numerador;
	  private int denominador;
	  
	  public Fraccionn(int n, int d) {
	    if (d == 0) {
	      System.out.println("Una fracci�n no puede tener como denominador el n�mero 0");
	    } else {
	      if (n * d < 0) {
	        this.signo = -1;
	      } else {
	        this.signo = 1;
	      }
	      this.numerador = Math.abs(n);
	      this.denominador = Math.abs(d);
	    }
	  }

	  int getNumerador(){
	    return this.numerador;
	  }
	  
	  int getDenominador(){
	    return this.denominador;
	  }
	  
	  public String toString() {
	    if (signo == -1) {
	      return "-" + this.numerador + "/" + this.denominador;
	    } else {
	      return this.numerador + "/" + this.denominador;
	    }
	  }

	  /**
	   * Devuelve una fracci�n invertida. Lo que antes era el numerador
	   * ahora ser� el denominador y viceversa.
	   * 
	   * @return fracci�n invertida
	   */
	  public Fraccionn invierte() {
	    return new Fraccionn(this.signo * this.denominador, this.numerador);
	  }
	  
	  /**
	   * Devuelve una fracci�n multiplicada por un escalar (un n�mero)
	   * <code>n</code>.
	   * <p>
	   * Cuando una fracci�n se multiplica por un n�mero <code>n</code>, el
	   * resultado es otra fracci�n con el mismo denominador que la
	   * original.
	   * El numerador se obtiene multiplicando <code>n</code> por el
	   * numerador de la fracci�n original.
	   * 
	   * @param n escalar por el que se multiplica la fracci�n original
	   * @return  fracci�n multiplicada por <code>n</code>
	   */
	  public Fraccion multiplica(int n) {
	    return new Fraccion(this.signo * this.numerador * n, this.denominador);
	  }

	  /**
	   * Devuelve una fracci�n que es el resultado de multiplicar la
	   * fracci�n original por otra fracci�n que se pasa como par�metro.
	   * <p>
	   * Cuando se multiplican dos fracciones, el numerador de la fracci�n
	   * resultante es el resultado de multiplicar los numeradores de las
	   * dos fracciones. El denominador de la fracci�n resultante se calcula
	   * de forma an�loga.
	   * 
	   * @param f fracci�n por la que se multiplica la fracci�n original
	   * @return  resultado de multiplicar la fracci�n original por la
	   *          fracci�n que se pasa como par�metro
	   */
	  public Fraccionn multiplica(Fraccionn f) {
	    return new Fraccionn(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
	  }

	  /**
	   * Devuelve una fracci�n dividida entre un escalar (un n�mero) <code>n
	   * </code>.
	   * <p>
	   * Cuando una fracci�n se divide entre un n�mero <code>n</code>, el
	   * resultado es otra fracci�n con el mismo numerador que la original.
	   * El denominador se obtiene multiplicando <code>n</code> por el
	   * denominador de la fracci�n original.
	   * 
	   * @param n escalar entre el que se divide la fracci�n original
	   * @return  fracci�n dividida entre <code>n</code>
	   */
	  public Fraccionn divide(int n) {
	    return new Fraccionn(this.signo * this.numerador, this.denominador * n);
	  }

	  /**
	   * Devuelve una fracci�n que es el resultado de dividir la fracci�n
	   * original entre otra fracci�n que se pasa como par�metro.
	   * <p>
	   * Para obtener la divisi�n de dos fracciones, el numerador de una
	   * fracci�n se multiplica por el denominador de otra y viceversa.
	   * 
	   * @param f fracci�n entre la que se quiere dividir la fracci�n
	   *          original
	   * @return  resultado de dividir la fracci�n original entre la
	   *          fracci�n que se pasa como par�metro
	   */
	  public Fraccionn divide(Fraccionn f) {
	    return new Fraccionn(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
	  }

	  /**
	   * Devuelve una fracci�n que es el resultado de simplificar la
	   * fracci�n original.
	   * <p>
	   * Para simplificar una fracci�n, se comprueba si numerador y
	   * denominador son divisibles entre el mismo n�mero. En tal caso, los
	   * dos se dividen. Se repite el proceso hasta que la fracci�n que se
	   * obtiene es irreducible (no se puede simplificar m�s).
	   * 
	   * @return  resultado de simplificar (si se puede) la fracci�n
	   *          original, o la misma fracci�n en caso de que la original
	   *          sea irreducible
	   */
	  public Fraccion simplifica() {
	    
	    int s = this.signo;
	    int n = this.numerador;
	    int d = this.denominador;
	      
	    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
	      while (((n % i) == 0) && ((d % i) == 0)) {
	        n /= i;
	        d /= i;
	      }
	    }

	    return new Fraccion(s * n, d);
	  }
	}
