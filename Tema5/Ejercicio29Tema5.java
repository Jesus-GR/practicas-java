package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio29Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero maximo: ");
    int numeroMaximo = Integer.parseInt(s.nextLine());
    System.out.print("Introduce un numero por el cual no puede ser divisible: ");
    int numeroNoDivisible = Integer.parseInt(s.nextLine());
    int contador = 1;
    int resultado = 0;

    while (contador < numeroMaximo) {
      resultado = contador / numeroNoDivisible;
      if (contador % numeroNoDivisible != 0) {
        System.out.print(contador + ",");
      } else {
        System.out.print(" ,");
      }
      contador++;
    }

  }
}
