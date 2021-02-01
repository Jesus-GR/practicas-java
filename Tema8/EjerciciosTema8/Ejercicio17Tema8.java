/**
 * 
 */
package EjerciciosTema8;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;

import misfunciones.FuncionesMatematicas;

public class Ejercicio17Tema8 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero binario: ");
		int binario = Integer.parseInt(s.nextLine());

		System.out.print(FuncionesMatematicas.deBinarioADecimal(binario));
	}
}
