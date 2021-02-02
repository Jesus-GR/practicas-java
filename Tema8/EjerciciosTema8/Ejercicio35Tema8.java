/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesString;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;
public class Ejercicio35Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: " );
		int numero = Integer.parseInt(s.nextLine());
		
		FuncionesString.convierteEnPalotes(numero);

	}

}
