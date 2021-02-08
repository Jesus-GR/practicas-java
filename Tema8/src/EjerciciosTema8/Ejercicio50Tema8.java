package EjerciciosTema8;

import misfunciones.FuncionesArrays;

public class Ejercicio50Tema8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,9,8,7,6};
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] b = {5};
		for (int i : b) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] c = FuncionesArrays.mezclaArrays(a, b);
		
		for (int i : c) {
			System.out.print(i+" ");
		}
	}

}
