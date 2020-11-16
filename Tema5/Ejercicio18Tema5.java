package tema5;

import java.util.Scanner;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio18Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    int numeroPrimero = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el segundo número: ");
    int numeroSegundo = Integer.parseInt(s.nextLine());
    int i;
    if (numeroPrimero < numeroSegundo) {
      for (i = numeroPrimero; i <= numeroSegundo; i += 7) {
        System.out.println(i);
      }
    } else if (numeroSegundo < numeroPrimero) {
      for (i = numeroSegundo; i <= numeroPrimero; i += 7) {
        System.out.println(i);
      }
    } else if (numeroPrimero == numeroSegundo || numeroPrimero - numeroSegundo < 7 || numeroSegundo - numeroPrimero < 7) {
      System.out.println("El valor introducido no es correcto.");
    }
  }

}
