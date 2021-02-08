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
public class Ejercicio54Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int contador = FuncionesMatematicas.ocurrencias(5,12345454);
	
		System.out.println(contador);
		
		int[] arrayOcurrencia = {6,66,666,66666};
		
		int contadorArray = FuncionesArrays.ocurrencias(666, arrayOcurrencia);
		System.out.print(contadorArray);
}
}
