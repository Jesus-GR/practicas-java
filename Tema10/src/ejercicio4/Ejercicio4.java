package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> palabra = new ArrayList<String>();
		String datosIntroducidos = "";
		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce el " + i + " º numero: ");
			palabra.add(datosIntroducidos = s.nextLine());
		}
		System.out.println();

		Collections.sort(palabra);
		
		for (String i : palabra) {
			System.out.println(i);
		}
	}

}
