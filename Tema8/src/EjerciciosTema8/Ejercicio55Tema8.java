/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesArrays;

/**
 * @author Mugre
 *
 */
public class Ejercicio55Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"coche","avion","moto","hola","Hola","Ducati","ducati","Hola","moto","ordenador","coche"};
		String[] sinRepetido = FuncionesArrays.sinRepetir(s);
		for (String string : sinRepetido) {
			System.out.print(string+" ");
		}
	}
	
	

}
