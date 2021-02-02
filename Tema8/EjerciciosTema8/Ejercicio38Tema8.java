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
public class Ejercicio38Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {21};
		// Pintamos el array original
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		// Le pasamos al nuevo array la funcion filtraCapicuas para que solo me escoja los numros capicuas del array inicial
		int [] arrayCapicua = FuncionesArrays.filtraCapicuas(array);
		
		for (int a : arrayCapicua) {
			System.out.print(a);
		}
	}

}
