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
public class Ejercicio40Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayInicial = {20,7};
		for (int i : arrayInicial) {
			System.out.print(i+" ");
		}
		System.out.println();
		int [] arrayFinal =filtraCon7(arrayInicial);
		for (int i : arrayFinal) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] filtraCon7(int[] x) {
		int longitudArray = 0;
		for (int i : x) {
			if (FuncionesMatematicas.contieneDigito(i, 7)) {
				longitudArray++;
			}
		}
		int[] arrayConNumero = new int[longitudArray];
		int contador = 0;
		for (int i = 0; i < x.length; i++) {
			if (FuncionesMatematicas.contieneDigito(x[i], 7)) {
				arrayConNumero[contador++] = x[i];
			}
		}
			int[] resultado = {-1};
			if (longitudArray == 0) {
				return resultado;
			} else {
				return arrayConNumero;
			}
		}

}
