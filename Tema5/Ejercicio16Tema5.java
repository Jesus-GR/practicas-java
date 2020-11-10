package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio16Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero;
    numero = Integer.parseInt(s.nextLine());
    int i;
    int contador1 = 0;
    int contador2=0;
    int suma = 0;
    for (i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        contador1++;

      } else {
        contador2 = 0;
      }
      suma = contador1 + contador2;
      
    }
    if (suma != 2) {
      System.out.print("No es primo.\n");
    } else {
      System.out.print("Es primo.\n");
    }
  }
}
