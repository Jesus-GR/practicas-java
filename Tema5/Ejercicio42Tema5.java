package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio42Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int numeroPrimo;
    int contadorPrimo = 0;
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      for (int j = 1; j < 100; j++) {
        if (i % j == 0) {
          contadorPrimo++;
        }

      }
      if (contadorPrimo == 2) {
        System.out.println(i + " es primo");
      } else {
        System.out.println(i + " no es primo");
      }
      contadorPrimo = 0;
    }
  }

}
