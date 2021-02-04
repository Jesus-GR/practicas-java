/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesMatematicas;

/**
 * @author Mugre
 *
 */

public class Ejercicio15Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 1000; i++) {
			if(FuncionesMatematicas.esPrimo(i)==true) {
				System.out.print(i+" ");
			}
		}

	}

}
