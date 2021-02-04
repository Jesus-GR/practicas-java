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
