package tema5;

import java.util.Scanner;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio17Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número por teclado: ");
    long numero;
    numero = Long.parseLong(s.nextLine());
    long i;
    long numeroSuma = 0;
    long suma;
    suma = 0;
    if (numero >= 0) {
      for (i = 0; i <= 100; i++) {

        /*numeroSuma=numero+1;*/
        suma = numero + i;

        System.out.println(suma);
        numero = suma;
      }

    } else {
      System.out.println("El número introducido no es positivo");
    }

  }

}
