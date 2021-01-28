package EjerciciosTema8;

import misfunciones.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio1Tema8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int numero = 12345;
		/*System.out.println(numero);
		System.out.println(FuncionesMatematicas.cuentaDigitos(numero));

		System.out.println(FuncionesMatematicas.voltea(numero));

		System.out.print("Introduce un numero entero positivo para saber si es capicua: ");
		int numeroIntroducido = Integer.parseInt(s.nextLine());
		System.out.println(FuncionesMatematicas.esCapicua(numeroIntroducido));

		int numeroPrimo =0;
		do {
			System.out.print("Introduce un numero para saber si es primo: ");
			numeroPrimo = Integer.parseInt(s.nextLine());
			System.out.println(FuncionesMatematicas.esPrimo(numeroPrimo));
		} while ( numeroPrimo != -1);
		
		System.out.print("Introduce un numero : ");
		numero = Integer.parseInt(s.nextLine());
		System.out.print(FuncionesMatematicas.siguientePrimo(numero));
		
		System.out.print("Introduce un numero como base: ");
		int base = Integer.parseInt(s.nextLine());
		System.out.print("Introduce un numero como exponente: ");
		int exponente = Integer.parseInt(s.nextLine());
		System.out.println(Math.pow(base, exponente));
		System.out.print(FuncionesMatematicas.potencia(base, exponente));
		
		System.out.print("Introduce un numero: ");
		numero = Integer.parseInt(s.nextLine());
		System.out.print("Introduce una posicion : ");
		int posicion = Integer.parseInt(s.nextLine());
		
		System.out.print(FuncionesMatematicas.devuelveDigito(numero, posicion));
		System.out.print("Introduce un numero: ");
		numero = Integer.parseInt(s.nextLine());
		System.out.print("Introduce de que digito quieres la posicion : ");
		int digito = Integer.parseInt(s.nextLine());
		
		System.out.print(FuncionesMatematicas.posicionDeDigito(numero, digito));
		
		System.out.print(FuncionesMatematicas.quitaDigitoPorDetras(12345, 1));
		
		System.out.print(FuncionesMatematicas.quitaDigitoPorDelante(12345, 3));
		System.out.println(FuncionesMatematicas.pegaDigitoPorDetras(12345, 3));
		System.out.println(FuncionesMatematicas.pegaDigitoPorDelante(12345, 3234));
		System.out.print(FuncionesMatematicas.juntaNumeros(22222, 11111));*/
		long numerjo = FuncionesMatematicas.juntaNumeros(22222, 11111);
		System.out.print(numerjo);
	}
}
