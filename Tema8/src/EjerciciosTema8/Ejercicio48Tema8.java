/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesArrays;

/**
 * @author Mugre
 *
 */
public class Ejercicio48Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,4,5,6};
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int [] b = {3,0,2,98};
		for (int i : b) {
			System.out.print(i+" ");
		}
		System.out.println();
		int [] arrayFinal = FuncionesArrays.concatena(a, b);
		
		for (int i : arrayFinal) {
			System.out.print(i+" ");
		}
	}

}
