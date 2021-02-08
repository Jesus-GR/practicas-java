/**
 * 
 */
package misfunciones;

/**
 * @author Mugre
 *
 */
public class FuncionesString {
	/**
	 * Representa un numero entero en sistema de palos.
	 * 
	 * @param n El numero entero introducido
	 * @return
	 */
	public static String convierteEnPalotes(int n) {

		int digitos = FuncionesMatematicas.cuentaDigitos(n);
		String palote = "";
		String[] arrayPalote = { ". ", "| ", "|| ", "||| ", "|||| ", "||||| ", "|||||| ", "||||||| ", "|||||||| ",
				"||||||||| " };

		for (int i = 0; i < digitos; i++) {

			palote = palote + arrayPalote[(n / FuncionesMatematicas.potenciaDe10(digitos - (i + 1))) % 10];

		}
		return palote;
	}

	/**
	 * Representa un numero entero en sistema morse.
	 * 
	 * @param n El numero entero introducido
	 * @return
	 */
	public static String convierteEnMorse(int n) {
		String morse = "";
		int longitud = FuncionesMatematicas.cuentaDigitos(n);
		String[] arrayMorse = { "_ _ _ _ _  ", ". _ _ _ _  ", ". . _ _ _  ", " . . . _ _  ", ". . . . _  ",
				". . . . .  ", "_ . . . .  ", "_ _ . . .  ", "_ _ _ . .  ", "_ _ _ _ .  " };

		for (int i = 0; i < longitud; i++) {
			morse = arrayMorse[n % 10] + morse;
			n /= 10;
		}
		return morse;
	}

	/**
	 * Un numero entero lo respresenta con su nombre escrito.
	 * 
	 * @param n El numero entero introducido
	 * @return
	 */
	public static String convierteEnPalabras(int n) {
		int digitos = FuncionesMatematicas.cuentaDigitos(n);
		String[] arrayPalabras = { "Cero ", "Uno  ", "Dos ", " Tres  ", "Cuatro  ", "Cinco  ", "Seis  ", "Siete  ",
				"Ocho  ", "Nueve  " };
		String palabra = "";
		for (int i = 1; i <= digitos; i++) {
			if (i == 1) {
				palabra = palabra + arrayPalabras[(n / FuncionesMatematicas.potenciaDe10(digitos - i)) % 10];
			} else {
				palabra = palabra + "," + arrayPalabras[(n / FuncionesMatematicas.potenciaDe10(digitos - i)) % 10];
			}

		}
		return palabra;
	}

	public static String convierteArrayEnString(int[] a) {
		String caracter = "";

		for (int i = 0; i < a.length; i++) {
			caracter = caracter + a[i];
		}
		return caracter;
	}

	public static boolean contiene(String[] a, String b) {
		for (String numero : a) {
			if (numero == b) {
				return true;
			}
		}
		return false;
	}
}
