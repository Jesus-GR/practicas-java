package misfunciones;

import java.util.Iterator;

public class FuncionesArrays {
	public static int[] generaArrayInt(int n, int minimo, int maximo) {
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
		}

		return x;
	}

	public static int minimoArrayInt(int[] x) {
		int minimo = Integer.MAX_VALUE;

		for (int n : x) {
			if (n < minimo) {
				minimo = n;
			}
		}
		return minimo;
	}

	public static int maximoArrayInt(int[] x) {
		int maximo = Integer.MIN_VALUE;
		for (int i : x) {
			if (i > maximo) {
				maximo = i;
			}
		}
		return maximo;
	}

	public static int mediaArray(int[] x) {
		int contador = 0;
		int suma = 0;
		for (int i = 0; i < x.length; i++) {
			suma = suma + x[i];
			contador++;
		}
		int media = suma / contador;
		return media;
	}

	public static boolean estaEnArrayInt(int[] x, int y) {
		boolean estaEnArray = false;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == y) {
				estaEnArray = true;
			}
		}
		return estaEnArray;
	}

	public static int posicionEnArray(int[] x, int y) {
		int posicion = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == y) {
				posicion = i;
			}
			if(posicion == 0) {
				posicion = -1;
			}
		}
		return posicion;
	}
}
