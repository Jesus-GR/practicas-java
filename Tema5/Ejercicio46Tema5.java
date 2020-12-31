package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio46Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esCorrecto = false;
    int altura = 0;
    int anchura = 0;
    do {
      System.out.print("Introduce la anchura del rectangulo (como minimo 2): ");
      anchura = Integer.parseInt(s.nextLine());
      System.out.print("Introduce la altura(como minimo 2): ");
      altura = Integer.parseInt(s.nextLine());
      if (altura >= 2 && anchura >= 2 && anchura > altura) {
        esCorrecto = true;
      } else {
        System.out.println("Lo siento. Los datos introducidos no son correctos.");
        System.out.println("El valor minimo de la altura y la anchura debe ser de 2 y la anchura debe ser mayor que la altura");
        esCorrecto = false;
      }
    } while (!esCorrecto);
    for (int i = 0; i <= altura; i++) {
      if (i == 0) {
        for (int j = 0; j < anchura; j++) {
          System.out.print("*");
        }
        System.out.println("");
      } else if (i > 0 && i < altura-1) {
        System.out.print("*");
        for (int j = 0; j < anchura - 2; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      } else if(i==altura){
        for (int j = 0; j < anchura; j++) {
          System.out.print("*");
        }
      }
    }
  }
}
