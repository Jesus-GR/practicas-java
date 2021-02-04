/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesArrays;
import misfunciones.FuncionesMatematicas;

/**
 * @author Mugre
 *
 */
public class Ejercicio36Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		int [] arrayInicial = {1,4,6};
		
		for (int i : arrayInicial) {
			System.out.print(i);
		}
		System.out.println();
		int [] arrayFinal = FuncionesArrays.filtraPrimos(arrayInicial);
		
		for (int i : arrayFinal) {
			System.out.print(i);
		}
	}
	

}
