/**
 * 
 */
package EjerciciosTema8;

import misfunciones.FuncionesArrays;
import misfunciones.FuncionesComprobacion;
import misfunciones.FuncionesMatematicas;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;
public class Ejercicio2028Tema8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);

	/************************GENERA ARRAY********************************/	
		 /*int [] numero = FuncionesArrays.generaArrayInt(5, 1, 10);
		  for (int i = 0; i < 5; i++) {
			  System.out.print(numero[i]+" ");
			  } 
		  System.out.println("");
		 System.out.println(FuncionesArrays.mediaArray(numero));
		 
		 
		 System.out.println(FuncionesArrays.estaEnArrayInt(numero, 5 ));
		 System.out.println("La posicion es "+FuncionesArrays.posicionEnArray(numero, 5));*/
		 
/*****************************EXTRAE PRIMOS********************************/
		/*int [] n = {4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		// Pinta array original
		FuncionesArrays.pintaArray(n);
		
		System.out.println();
		
		
		//Damos el valor de la funcion extrae primos al array auxiliar
		int [] auxPrimo = FuncionesArrays.extraePrimos(n);
		
		FuncionesArrays.pintaArray(auxPrimo);*/
		
		
		/********************ROTA IZQ****************************************/
		
		/*int [] numero = {1,2,3,4,5,6,7,8};
		for (int i : numero) {
			System.out.print(i+" ");
		}
		System.out.println("");
		int [] arrayIzq = FuncionesArrays.rotaIzquierdaArrayInt(numero);
		
		for (int h : arrayIzq) {
			System.out.print(h+" ");
		}*/
		
		/*************Voltea Array*********************/
		/*int [] array = {1,2,3,4,5,6,7,8,9};
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		int [] aux = new int [array.length];
		aux = FuncionesArrays.volteaArray(array);
		System.out.println("");
		for (int i : aux) {
			System.out.print(i+" ");
		}*/
		
		/**************QuitaRepetidosArray*********************/
		
		/*int [] array = {1,2,2,3,4,5};
		for (int i : array) {
			System.out.print(i+"");
		}
		int [] aux = new int [array.length-1];
		aux = FuncionesArrays.quitaRepetidos(array);
		System.out.println("");
		for (int l = 0; l < aux.length; l++) {
			System.out.print(aux[l]+" ");
		}*/
		/****************QUITA REPETIDOS INT*******************/
		
		
		/*int numero = 12234;
		int n = FuncionesMatematicas.quitaRepetidos(numero);
		
		System.out.print(n);*/
		
		/*int [] array = {1,2,3,4,5,6,7,8,9};
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println("");
		int [] nuevoArray = FuncionesArrays.trozoArray(array, 3, 6);
		
		for (int i : nuevoArray) {
			System.out.print(i+" ");
		}*/
		
		//System.out.print(FuncionesMatematicas.posicionDeDigitoConPotencia(16901007056l, 8));
		
	}
}
