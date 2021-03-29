package ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> alumno = new ArrayList<String>();

		alumno.add("Pepe");
		alumno.add("Luis");
		alumno.add("Jose");
		alumno.add("Paco");
		alumno.add("Alberto");
		alumno.add("Sergio");
		alumno.add("Felipe");
		
		for (String string : alumno) {
			System.out.println(string);
		}

	}
}
