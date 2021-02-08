/**
 * 
 */
package misfunciones;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;

public class FuncionesComprobacion {
	/**
	 * Comprueba si un dato introducido esta entre los valores maximo y minimo
	 * @param minimo Valor tipo int. Para que sea correcto, el valor debe ser superior
	 * @param maximo Valor tipo int. Para que sea correcto, el valor debe ser inferior
	 * @return Nos devuelve, si es correcto, el valor introducido, y si no, es un bucle que nos vuelve a hacer introducir el valor
	 */
	public static int comprobacionDatosIntrducidosCorrectos(int minimo, int maximo) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un numero: ");

		int datoIntroducido = 0;
		boolean esCorrecto = false;
		do {
			datoIntroducido = Integer.parseInt(s.nextLine());
			if (datoIntroducido >= minimo && datoIntroducido <= maximo) {
				esCorrecto = true;
			} else {

				System.out.print("Los datos intrducidos no son correctos, vuelva a introducir el numero:");
			}

		} while (!esCorrecto);
		return datoIntroducido;
	}
	/**
	 * Comprueba si un dato introducido es par
	 * @param numeroIntroducido El valo introducido que comprobamos si es par
	 * @returnNos devuelve, si es correcto, el valor introducido, y si no, es un bucle que nos vuelve a hacer introducir el valor
	 */
	public static int comprobacionDatosIntroducidosCorrectoPar(int numeroIntroducido) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un numero: ");

		int datoIntroducido = 0;
		boolean esCorrecto = false;
		do {
			datoIntroducido = Integer.parseInt(s.nextLine());
			if (datoIntroducido % 2 == 0) {
				esCorrecto = true;
			} else {

				System.out.print("Los datos intrducidos no son correctos, vuelva a introducir el numero:");
			}

		} while (!esCorrecto);
		return datoIntroducido;
	}
	/**
	 * Comprueba si un dato introducido es impar
	 * @param numeroIntroducido El valo introducido que comprobamos si es impar
	 * @returnNos devuelve, si es correcto, el valor introducido, y si no, es un bucle que nos vuelve a hacer introducir el valor
	 */
	public static int comprobacionDatosIntroducidosCorrectoImpar(int numeroIntroducido) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un numero: ");

		int datoIntroducido = 0;
		boolean esCorrecto = false;
		do {
			datoIntroducido = Integer.parseInt(s.nextLine());
			if (datoIntroducido % 2 != 0) {
				esCorrecto = true;
			} else {

				System.out.print("Los datos intrducidos no son correctos, vuelva a introducir el numero:");
			}

		} while (!esCorrecto);
		return datoIntroducido;
	}
}
