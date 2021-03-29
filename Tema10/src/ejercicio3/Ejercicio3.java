package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<Integer>();
		int datosIntroducidos = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce el " + i + " º numero: ");
			numero.add(datosIntroducidos = Integer.parseInt(s.next()));
		}
		System.out.println();

		Collections.sort(numero);
		
		for (Integer integer : numero) {
			System.out.println(integer);
		}

	}

}
