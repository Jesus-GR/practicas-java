/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesMatematicas;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;
public class Ejercicio18Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numeroIntroducido = Integer.parseInt(s.nextLine());
		
		System.out.print(FuncionesMatematicas.deDecimalABinario(numeroIntroducido));
	}

}
