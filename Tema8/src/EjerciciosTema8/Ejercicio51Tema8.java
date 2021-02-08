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
public class Ejercicio51Tema8 {

	/**Introducimos un array con numeros aleatorios y nos dice si dichos numeros son primos y/o capicuas
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayAleatorio = FuncionesArrays.generaArrayInt(10, 2, 100);
		
		for (int i : arrayAleatorio) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i < arrayAleatorio.length; i++) {
			if(FuncionesMatematicas.esPrimo(arrayAleatorio[i]) && FuncionesMatematicas.esCapicua(arrayAleatorio[i])) {
				System.out.println("El "+arrayAleatorio[i]+" es primo y es capicúa.");
			}else if(!FuncionesMatematicas.esPrimo(arrayAleatorio[i]) && !FuncionesMatematicas.esCapicua(arrayAleatorio[i])) {
				System.out.println("El "+arrayAleatorio[i]+" no es primo y no es capicúa.");
			}else if(FuncionesMatematicas.esPrimo(arrayAleatorio[i]) && !FuncionesMatematicas.esCapicua(arrayAleatorio[i])) {
				System.out.println("El "+arrayAleatorio[i]+" es primo y no es capicúa.");
			}else if(!FuncionesMatematicas.esPrimo(arrayAleatorio[i]) && FuncionesMatematicas.esCapicua(arrayAleatorio[i])) {
				System.out.println("El "+arrayAleatorio[i]+" no es primo y  es capicúa.");
			}
		}
	}

}
