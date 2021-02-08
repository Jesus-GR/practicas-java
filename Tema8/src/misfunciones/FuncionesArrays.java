package misfunciones;

public class FuncionesArrays {
	/**
	 * Nos pinta un array de una determinada longitud
	 * @param n El array que nos pinta
	 */
	public static void pintaArray(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

	}
	/**
	 * Nos genera un array de una determinada longitud y con valores aleatorios entre un maximo y un minimo
	 * @param n es la longitud del array
	 * @param minimo El valor minimo(incluido) que tendra el array
	 * @param maximoEl valor maximo(incluido) que tendra el array
	 * @return
	 */
	public static int[] generaArrayInt(int n, int minimo, int maximo) {
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
		}

		return x;
	}
	/**
	 * Nos saca el valor minimo que tiene un array
	 * @param x Es el array donde vamos a realizar la busqueda del minimo
	 * @return Nos devuelve un entero.
	 */
	public static int minimoArrayInt(int[] x) {
		int minimo = Integer.MAX_VALUE;

		for (int n : x) {
			if (n < minimo) {
				minimo = n;
			}
		}
		return minimo;
	}
	/**
	 * Nos saca el valor maximo que tiene un array
	 * @param x Es el array donde vamos a realizar la busqueda del minimo
	 * @return Nos devuelve un entero.
	 */
	public static int maximoArrayInt(int[] x) {
		int maximo = Integer.MIN_VALUE;
		for (int i : x) {
			if (i > maximo) {
				maximo = i;
			}
		}
		return maximo;
	}
	/**
	 * Realiza la media de todos los valores que contiene un array
	 * @param x Es el array del cual vamos a realizar la media
	 * @return Nos devuelve un valor de tipo int. 
	 */
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
	/**
	 * Nos confirma si un valor de tipo int se encuentra dentro de un array
	 * @param x El array donde vamos a hacer la comparacion
	 * @param y El valor tipo int que vamos a comparar 
	 * @return Nos devuelve true, si el valor se encuentra dentro del array o false en caso contrario
	 */
	public static boolean estaEnArrayInt(int[] x, int y) {
		boolean estaEnArray = false;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == y) {
				estaEnArray = true;
			}
		}
		return estaEnArray;
	}
		/**
		 * Nos dice la posicion que ocupa un valor tipo int dentro de un array
		 * @param x El array donde vamos a buscar la posicion
		 * @param y El valor tipo int del cual queremos saber la posicion
		 * @return Un valor tipo int.
		 */
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
		/**
		 * Rotamos todas las posiciones un valor hacia la derecha
		 * @param array Es el array del que partimos para rotar
		 * @return Nos devuelve un array con todas los valores rotados una posicion  hacia la derecha
		 */
	public static int[] rotaDerechaArrayInt(int[] array) {
		int[] arrayAuxiliar = new int[array.length];
		arrayAuxiliar[0] = array[array.length - 1];

		for (int i = 1; i < array.length; i++) {
			arrayAuxiliar[i] = array[i - 1];
		}
		return arrayAuxiliar;
	}
		/**
		 * Rotamos todas las posiciones un valor hacia la izquierda
		 * @param array Es el array del que partimos para rotar
		 * @return Nos devuelve un array con todas los valores rotados una posicion  hacia la izquierda
		 */
	public static int[] rotaIzquierdaArrayInt(int[] array) {
		int[] arrayAuxiliar = new int[array.length];
		arrayAuxiliar[arrayAuxiliar.length - 1] = array[0];

		for (int i = arrayAuxiliar.length - 1; i > 0; i--) {
			arrayAuxiliar[i - 1] = array[i];
		}
		return arrayAuxiliar;
	}
		/**
		 * De un array inicial, nos crea otro con los valores primos de dicho array inicial
		 * @param n el array inicial
		 * @return Otro array que solo contiene numeros primos
		 */
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
		/**
		 * De un array inicial, sacamos otro con los mismos valores que el inicial pero eliminando los valores repetidos tipo int
		 * @param n El array inicial
		 * @return Array tipo int sin repetidos
		 */
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
		/**
		 * Nos voltea las posiciones dentro de un array. 
		 * 1 2 3 4 5 6 7 8 9 
		 * 9 8 7 6 5 4 3 2 1 
		 * @param n El array inicial
		 * @return Otro array tipo int volteado
		 */
	public static int[] volteaArray(int[] n) {

		int[] arrayAux = new int[n.length];
		int contador = 0;
		for (int i = arrayAux.length - 1; i >= 0; i--) {
			arrayAux[contador] = n[i];
			contador++;
		}

		return arrayAux;
	}
		/**
		 * De un array inicial, nos un trozo de dicho array
		 * @param n El array inicial
		 * @param x La primera acotacion
		 * @param y La segunda acotacion
		 * @return Un array de tipo int
		 */
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
		/**
		 * Es igual que la funcion extraePrimos, solo que si no hay ningun primo en el array, nos devuelve -1
		 * @param n
		 * @return
		 */
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
		/**
		 * De un array inicial, nos crea otro array solo con los valores capicua de dicho array inicial
		 * @param x El array inicial
		 * @return Un array de tipo int
		 */
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
		/**
		 * A partir de un array x inicial, elegimos el valor de tipo int ("y") y nos crea otro array con solo los numeros que contengan el valor y
		 * @param x El array del que partimos
		 * @param y El valor tipo int 
		 * @return Un array tipo int
		 */
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
		int[] resultado = { -1 };
		if (longitudArray == 0) {
			return resultado;
		} else {
			return arrayConNumero;
		}
	}
		/**
		 * Extraemos los digitos de un numero entero y los almacenamos en un array. A cada valor del indice del array le corresponde un digito
		 * @param y El numero tipo int 
		 * @return Un array con los digitos de y
		 */
	public static int[] extraeDigitos(int y) {
		int longitud = FuncionesMatematicas.cuentaDigitos(y);
		int contadorArray = 0;
		int[] arrayDigitos = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			arrayDigitos[contadorArray++] = (y / FuncionesMatematicas.potenciaDe10(longitud - (i + 1))) % 10;
		}
		return arrayDigitos;
	}
		/**
		 * Nos crea una array con los valores de 2 arrays distintos.
		 * @param a array tipo int 
		 * @param b array tipo int
		 * @return Array c = ( a+b)
		 */
	public static int[] concatena(int[] a, int[] b) {
		int[] arrayAux = new int[a.length + b.length];
		int contadorArray = 0;
		for (int i = 0; i < a.length; i++) {
			arrayAux[i] = a[i];
			contadorArray++;
		}
		for (int i = 0; i < b.length; i++) {
			arrayAux[contadorArray] = b[i];
			contadorArray++;
		}
		return arrayAux;
	}
		/**
		 * Nos crea un array mezclando las posiciones de dos arrays iniciales (a[0],b[0],a[1],b[1]...)
		 * @param a Array inicial
		 * @param b Array inicial
		 * @return Array tipo int 
		 */
	public static int[] mezclaArrays(int[] a, int[] b) {

		int[] arrayMezclado = new int[a.length + b.length];
		System.out.println("A" + a.length);
		System.out.println("b" + b.length);
		int contadorA = 0;
		int contadorB = 0;
		for (int i = 0; i < arrayMezclado.length; i++) {
			if (i % 2 == 0 && contadorA < a.length) {
				arrayMezclado[i] = a[contadorA++];
			} else {
				if(contadorB < b.length) {
					arrayMezclado[i] = b[contadorB++];
				}else {
					arrayMezclado[i] = a[contadorA++];
				}
			}		
		}
		return arrayMezclado;
	}
		/**
		 * Nos devuelve un valor aleatorio dentro de un array.
		 * @param a Array inicial
		 * @return Valor tipo int
		 */
	public static int aleatorioDeArray (int[] a) {
		int numeroAleatorio = (int) (Math.random()*a.length);
		
		
		return a[numeroAleatorio];
	}
		/**
		 * Devuelve el numero de veces que aparece un digito dentro de un array
		 * @param digito El digito del cual queremos saber cuantas veces aparece en un array
		 * @param a El array donde buscamos el numero de posiciones
		 * @return Devuelve un valor tipo int
		 */
	public static int ocurrencias (int digito, int[] a) {
		int contadorOcurrencia = 0;
		for (int i = 0; i < a.length; i++) {
			if(digito == a[i]){
				contadorOcurrencia++;
				
			}
			
		}
		
		return contadorOcurrencia;
	}
	
	/**
	 * De un array String con palabras repetidas, sacamos otro quitando las repeticiones
	 * @param s Es el array inicial que contiene las repeticiones de las palabras
	 * @return Nos devuelve otro array que contiene las palabras del array inicial pero eliminando las repetidas
	 */
	public static String[] sinRepetir(String[] s) {
		String[] sinRepetido =  new String [s.length];
		int contadorRepetido = 0;
		int contadorArray = 0;
		for (int i = 0; i < sinRepetido.length; i++) {
			for (int j = 0; j < sinRepetido.length; j++) {
				if(s[i]!=sinRepetido[j]) {
					contadorRepetido++;
				}
				if(contadorRepetido==sinRepetido.length) {
					sinRepetido[contadorArray++] = s[i];
				}
			}
			contadorRepetido = 0;
		}
		String[] resultado = new String[contadorArray];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = sinRepetido[i];
		}

		return resultado;
	}

}
