
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio33 {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Introduce la altura de la u : ");
    int altura = Integer.parseInt(s.nextLine());
    int contadorAltura =1;
    for (int i = 0; i < altura-1; i++) {
      System.out.print("*");
      for (int j = 0; j < altura-2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
      if (contadorAltura==altura-1) {
        System.out.print(" ");
        for (int j = 0; j < altura-2; j++) {
          System.out.print("*");
        }
      }
      contadorAltura++;
    }
    System.out.println("");
  }
  
}
