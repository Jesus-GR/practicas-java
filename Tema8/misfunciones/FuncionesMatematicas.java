/**
 * 
 */
package misfunciones;

/**
 * @author Mugre
 *
 */
public class FuncionesMatematicas {

	/**
	 * Contador de digitos de un numero long
	 * 
	 * @param x Numero long introducido
	 * @return Contador, que es la cantidad de digitos que tiene el numero x
	 */
	public static int cuentaDigitos(long x) {
		int contador = 0;
		for (long i = x; i > 0; i /= 10) {
			contador++;
		}
		return contador;
	}
	/**
	 * 
	 * @param x: Numero tipo int que introducimos
	 * @return Cuenta cuantos digitos tiene un numero int introducido
	 */
	public static int cuentaDigitos(int x) {

		return cuentaDigitos((long) x);
	}
	
	/**
	 * 
	 * @param x: Numero tipo int introducido
	 * @return volteado: El numero x volteado.
	 */
	public static int voltea(int x) {
		int volteado = 0;
		for (int i = x; i > 0; i /= 10) {
			volteado = (volteado * 10) + (x % 10);
			x /= 10;
		}
		return volteado;
	}
	
	/**
	 * 
	 * Lo mismo que funcion volteado pero con numeros tipo long
	 */
	public static long voltea(long x) {
		return voltea((long) x);
	}
	/**
	 * 
	 * @param x: Numero introducido tipo int
	 * @return Devuelve true, si el numero introducido es capicua y false, si no lo es.
	 */
	 
	public static boolean esCapicua(int x) {

		if (x == voltea(x)) {
			return true;
		} else
			return false;

	}
	/**
	 * 
	 * @param x: Numero introducido de tipo int
	 * @return: Devuelve true, si el numero introducido es primo y false si no lo es.
	 */
	public static boolean esPrimo(int x) {
		int contadorPrimo = 0;
		for (int i = 1; i < 1000; i++) {
			if (x % i == 0) {
				contadorPrimo++;
			}
		}
		if (contadorPrimo == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esPrimo(long x) {
		return esPrimo((long) x);
	}
	
	/**
	 * 
	 * @param x: Numero introducido de tipo int
	 * @return: Devuelve x modificado. Incrementa x hasta que sea primo. 
	 */
	public static int siguientePrimo(int x) {
		if (esPrimo(x) == true) {
			return x;
		} else {
			while (esPrimo(x) != true) {
				x++;
			}
			return x;
		}
	}
	/**
	 * 
	 * @param x: Base introducida para la potencia
	 * @param y: Exponente introducido para la potencia
	 * @return: Devuelve el resultado de multiplicar x por si misma y veces
	 */
	public static long potencia(long x, long y) {
		long potencia = x;
		for (int i = 1; i < y; i++) {
			potencia = potencia * x;

		}
		return potencia;
	}

	/**
	 * 
	 * @param x Es el numero que introducimos
	 * @param y Es la posicion del digito que queremos sacar
	 * @return posicion. Devuelve el digito que esta en la posicion y, contando
	 *         desde 0 Por ejemplo si metemos 3 como y, realmente la posicion de un
	 *         numero es la 4 porque seria 0,1,2 y 3.
	 */
	public static int devuelveDigito(int x, int y) {
		long digitos = cuentaDigitos(x);
		long posicion = 0;

		posicion = x / potencia(10, ((digitos - 1) - y));
		posicion = posicion % 10;

		return (int) posicion;
	}
	/**
	 * 
	 * @param x: Numero que introducimos de tipo int
	 * @param y: Numero de tipo int del cual queremos sacar su posicion
	 * @return contador: Devuelve la posicion del numero y
	 */
	public static int posicionDeDigito (int x, int y) {
		int numeroDigitos = cuentaDigitos(x);
		int numero = voltea(x);
		int digito = 0;
		int contador = 0;
		while(digito!=y && contador<=numeroDigitos + 1) {
			digito = numero%10;
			numero/=10;
			contador++;
		}
		if(contador>numeroDigitos) {
			return -1;
		}else {
			return contador;
		}
		
	}
	
	public static int quitaDigitoPorDetras (int x, int y) {
	
		for(int i = y; i > 0; i--) {
			
			x/=10;
		}
		return x;
	}
	
	public static int quitaDigitoPorDelante ( int x, int y) {
			x = voltea(x);
			for(int i = y; i > 0; i--) {
				x/=10;
			}
			return voltea(x);
	}
	public static int pegaDigitoPorDetras (int x, int y) {
		return x*10+y;
		
	}
	public static long pegaDigitoPorDelante (long x, long y) {
		long contador = cuentaDigitos(x);
		long numeroFinal = 0;
		numeroFinal= y * potencia(10,contador) + x;
		return numeroFinal;
		
	}
	public static long juntaNumeros (long x, long y) {
		long contador = cuentaDigitos(y);
		long numeroFinal = x * potencia(10,contador) + y;
		return numeroFinal;
	}

}
