/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesArrays;

/**
 * @author Mugre
 *
 */
public class Ejercicio2028Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numero = FuncionesArrays.generaArrayInt(5, 1, 10);
		for (int i = 0; i < 5; i++) {
			System.out.print(numero[i]+" ");
		}
		System.out.println("");
		System.out.println(FuncionesArrays.mediaArray(numero));
		
		
		System.out.println(FuncionesArrays.estaEnArrayInt(numero, 5 ));
		System.out.println("La posicion es "+FuncionesArrays.posicionEnArray(numero, 5));
	}
	
	
}
