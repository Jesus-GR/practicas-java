/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesMatematicas;

/**
 * @author Mugre
 *
 */
public class Ejercicio16Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorLinea = 0 ;
		for(int i = 1; i < 99999; i++) {
			if(FuncionesMatematicas.esCapicua(i)==true) {
				System.out.print(i+" ");
				contadorLinea++;
				if(contadorLinea == 50) {
					contadorLinea = 0;
					System.out.println("");
				}
			}
		}
	}

}
