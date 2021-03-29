package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio2 {

	public static void main (String[]args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int longitudLista = (int) (Math.random()*11)+10;
		System.out.println(longitudLista);
		System.out.println();
		
		for (int i = 0; i < longitudLista; i++) {
			numeros.add((int) (Math.random()*101));
		}
		
		System.out.println("ArrayList ");
		for (Integer integer : numeros) {
			System.out.print(integer+", ");
		}
		
		Collections.sort(numeros);
		
		
		
		int suma = 0;
		int sumaTotal = 0 ;
		for (int i = 0; i < numeros.size(); i++) {
			sumaTotal = suma+numeros.get(i);
			suma =  sumaTotal;
		}
		System.out.println();
		System.out.println("La suma total es: "+sumaTotal);
		int valorMaximo = numeros.get(numeros.size()-1);
		System.out.println("El valor máximo es: "+valorMaximo);
		int valorMinimo = numeros.get(0);
		System.out.println("El valor mínimo es: "+valorMinimo);
		double media = (double)sumaTotal/numeros.size();
		
		System.out.println("La media es: "+media);
	}
}
