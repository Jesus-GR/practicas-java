/**
 * 
 */
package misfunciones;

import java.util.Iterator;

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
	public static int cuentaDigitos(int x) {
		int contador = 0;
		for (int i = x; i > 0; i /= 10) {
			contador++;
		}
		return contador;
	}
	
	public static long cuentaDigitos(long x) {
		return (long) cuentaDigitos( x);
	}
	/**
	 * Te da la posición de un int introducio dentro de un long
	 * @param x El numero tipo long que metemos
	 * @param y El numero del cual  queremos que nos de la posición
	 * @return
	 */
	public static int posicionDeDigitoConPotencia(int x, int y) {
		int contador = FuncionesMatematicas.cuentaDigitos(x);
		int digito = 0;
		for (int i = 0 ; i < contador; i++) {
			digito = (int)(x / FuncionesMatematicas.potencia(10,contador-i)) %10;
			if (digito== y){
				return i;
			}
		}
		return -1;
		
	}
	/**
	 * 
	 * @param x: Numero tipo int que introducimos
	 * @return Cuenta cuantos digitos tiene un numero int introducido
	 */
	/*public static int cuentaDigitos(int x) {

		return (int)cuentaDigitos((long) x);
	}*/
	
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
	/**\
	 *  Quita una serie de digitos por la derecha del numero
	 * @param x Numero que introducimos del tipo int
	 * @param y Cantidad de digitos que quitamos
	 * @return X sin digitos por detras
	 */
	public static int quitaDigitoPorDetras (int x, int y) {
	
		for(int i = y; i > 0; i--) {
			
			x/=10;
		}
		return x;
	}
	/**\
	 * Quita una serie de digitos por la parte de la izq
	 * @param x Numero que introducimos del tipo int
	 * @param y Cantidad de digitos que quitamos 
	 * @return Numero x - digitos que hemos quitado por la parte izq
	 */
	public static int quitaDigitoPorDelante ( int x, int y) {
			x = voltea(x);
			for(int i = y; i > 0; i--) {
				x/=10;
			}
			return voltea(x);
	}
	/**
	 * Pega un digito por la parte de detras(Derecha)
	 * @param x Numero que introducimos del tipo int
	 * @param y Numero que pegamos a x 
	 * @return Devuelve xy
	 */
	public static int pegaDigitoPorDetras (int x, int y) {
		return x*10+y;
		
	}
	/**
	 * Pega un digito por la parte de delante(Izquierda)
	 * @param xNumero que introducimos de tipo int
	 * @param y Numero que pegamos
	 * @return yx
	 */
	public static long pegaDigitoPorDelante (long x, long y) {
		long contador = (long)cuentaDigitos(x);
		long numeroFinal = 0;
		numeroFinal= y * potencia(10,contador) + x;
		return numeroFinal;
		
	}
	/**\
	 * Pega 2 numeros
	 * @param x Numero que introducimos de tipo int
	 * @param y Segundo numero de tipo int que se pega al primero
	 * @return xy
	 */
	public static long juntaNumeros (long x, long y) {
		long contador = cuentaDigitos(y);
		long numeroFinal = x * potencia(10,contador) + y;
		return numeroFinal;
	}
	/**
	 * Introducimos un numero binario tipo int y devuelve un numero decimal tipo int
	 * @param x Numero binario que introducimos tipo int
	 * @return Numero decimal tipo int
	 */
	public static long deBinarioADecimal(int x) {
		int contador = 0;
		for (int i =  x; i > 0; i /= 10) {
			contador++;
		}
		int[] resultado = new int[contador];
		int digito = 0;
		for (int i = 0; i < contador; i++) {
			digito =  x % 10;
			resultado[i] = digito * (int) Math.pow(2, i);
			x /= 10;
		}
		int suma = 0;
		for (int i = 0; i < resultado.length; i++) {
			suma = suma + resultado[i];
		}
		
		return suma;
	}
	
	public static int deBinarioADecimal(long x) {
		return  deBinarioADecimal( x);
	}
	/**
	 * Pasa un número int  de decimal a binario int
	 * @param x Es el número int que decimal que queremos cambiar a binario
	 * @return
	 */
	
	public static int deDecimalABinario(int x) {
		int numero =x;
		int contadorArray = 0 ;
		while(numero >= 1) {
			numero/=2;
			contadorArray ++;
		}
		int [] resto = new int [contadorArray];
		numero =x;
		for(int i = 0; i< resto.length; i++) {
			resto[i] = numero % 2;
			numero/=2;
		}
		int binario = 0;
		for(int i = resto.length-1 ; i >= 0; i--) {
			binario = (binario * 10) + resto[i];
		}
		return binario;
	}
	/**
	 * No da un valor true si el numero que que introducimos está dentro del array y false si no lo está
	 * @param a Es el array donde hacemos la búsqueda del número
	 * @param n Es el número que queremos comprobar
	 * @return Un valor booleano(True o false)
	 */
	public static boolean contiene(int[]a, int n) {
		for (int numero : a) {
			if(numero == n) {
				return true;
			}
		}
		return false;
	}
	/**
	 * De un número int introducido nos quita los números que son repetidos
	 * @param n El número donde vamos a quitar los repetidos
	 * @return
	 */
	public static int quitaRepetidos(int n) {
		int contador = FuncionesMatematicas.cuentaDigitos(n);
		int [] array = new int [contador];
		int contadorArray = contador;
		for (int i = contador-1; i >=0; i--) {
			if(!FuncionesMatematicas.contiene(array,n%10 )) {
				array[contadorArray-1] = n%10;
				contadorArray--;
			}
			n/=10;
		}
		
		int numeroSinRepetido = 0;
		for (int i = 0; i < array.length; i++) {
			numeroSinRepetido = (numeroSinRepetido *10) +  array[i];
		}
			
	
		return numeroSinRepetido;
	}
	public static long quitaRepetidos(long n) {
		
		return quitaRepetidos((int)n);
	}
	/**
	 *  Nos da un valor booleano de true si x está en el numero n o false si no lo está
	 * @param n El numero donde vamos a buscar x
	 * @param x El numero que introducimos para saber si lo contiene
	 * @return
	 */
	public static boolean contieneDigito(int n, int x) {
		boolean estaDigito = false;
		int cantidadDigitos = FuncionesMatematicas.cuentaDigitos(n);
		for (int i = 0; i < cantidadDigitos; i++) {
			if(n%10 == x) {
				 estaDigito = true;
				 n/=10;
			}
		}
		return estaDigito;
	}
	
	/**
	 * Nos devuelve el valor de la potencia de 10 elevada n veces
	 * @param n Exponente de la potencia
	 * @return
	 */
	public static int potenciaDe10(int n) {
		int potencia = 1 ;
		for (int i = 0; i < n; i++) {
			 potencia = potencia*10; 
		}
		return potencia;
	}
	
	
	
}
