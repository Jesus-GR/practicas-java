/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesArrays;

/**
 * @author Mugre
 *
 */
public class Ejercicio52Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arrayPrincipal = {8989,96,14,34,45,67,98765};
		for (int i : arrayPrincipal) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i <10; i++) {
			int resultado = FuncionesArrays.aleatorioDeArray(arrayPrincipal);
			
			System.out.print(resultado+" ");
		}
		
	}

}
