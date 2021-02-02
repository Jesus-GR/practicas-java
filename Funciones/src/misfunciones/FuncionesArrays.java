package misfunciones;

public class FuncionesArrays {
	public static void pintaArray(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

	}

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
			if (posicion == 0) {
				posicion = -1;
			}
		}
		return posicion;
	}

	public static int[] rotaDerechaArrayInt(int[] array) {
		int[] arrayAuxiliar = new int[array.length];
		arrayAuxiliar[0] = array[array.length - 1];

		for (int i = 1; i < array.length; i++) {
			arrayAuxiliar[i] = array[i - 1];
		}
		return arrayAuxiliar;
	}

	public static int[] rotaIzquierdaArrayInt(int[] array) {
		int[] arrayAuxiliar = new int[array.length];
		arrayAuxiliar[arrayAuxiliar.length - 1] = array[0];

		for (int i = arrayAuxiliar.length - 1; i > 0; i--) {
			arrayAuxiliar[i - 1] = array[i];
		}
		return arrayAuxiliar;
	}

	public static int[] extraePrimos(int[] n) {
		int[] aux = new int[n.length];
		int contadorAux = 0;
		int digito = 0;
		for (int i = 0; i < n.length - 1; i++) {
			digito = n[i];
			if (FuncionesMatematicas.esPrimo(digito) == true) {
				aux[contadorAux++] = n[i];
			}

		}
		int[] resultado = new int[contadorAux];
		for (int i = 0; i < contadorAux; i++) {
			resultado[i] = aux[i];
		}
		return resultado;
	}

	public static int[] quitaRepetidos(int[] n) {
		int aux[] = new int[n.length];
		int i = 0;
		for (int numero : n) {
			if (!FuncionesMatematicas.contiene(aux, numero)) {
				aux[i++] = numero;
			}
		}
		int[] resultado = new int[i];
		for (int j = 0; j < i; j++) {
			resultado[j] = aux[j];
		}
		return resultado;
	}

	public static int[] volteaArray(int[] n) {

		int[] arrayAux = new int[n.length];
		int contador = 0;
		for (int i = arrayAux.length - 1; i >= 0; i--) {
			arrayAux[contador] = n[i];
			contador++;
		}

		return arrayAux;
	}

	public static int[] trozoArray(int[] n, int x, int y) {
		int longitudArray = 0;
		for (int i = x; i <= y; i++) {
			longitudArray++;
		}
		int[] array = new int[longitudArray];
		int contador = 0;
		for (int i = x; i <= y; i++) {
			array[contador++] = n[i];
		}
		return array;
	}

	public static int[] filtraPrimos(int[] n) {
		int contador = 0;
		for (int i : n) {
			if (FuncionesMatematicas.esPrimo(i)) {
				contador++;
			}
		}

		int[] arrayFinal = FuncionesArrays.extraePrimos(n);
		int[] resultado = { -1 };
		if (contador == 0) {
			return resultado;
		} else {

			return arrayFinal;
		}

	}

	public static int[] filtraCapicuas(int[] x) {

		int longitudCapicua = 0;
		for (int i : x) {
			if (FuncionesMatematicas.esCapicua(i)) {
				longitudCapicua++;
			}
		}
		int[] arrayCapicua = new int[longitudCapicua];
		int contador = 0;

		for (int i = 0; i < x.length; i++) {
			if (FuncionesMatematicas.esCapicua(x[i])) {
				arrayCapicua[contador++] = x[i];
			}
		}

		int[] resultado = { -1 };
		if (longitudCapicua == 0) {
			return resultado;

		} else {
			return arrayCapicua;
		}
	}

	public static int[] filtraConNumero(int[] x, int y) {
		int longitudArray = 0;
		for (int i : x) {
			if (FuncionesMatematicas.contieneDigito(i, y)) {
				longitudArray++;
			}
		}
		int[] arrayConNumero = new int[longitudArray];
		int contador = 0;
		for (int i = 0; i < x.length; i++) {
			if (FuncionesMatematicas.contieneDigito(x[i], y)) {
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


