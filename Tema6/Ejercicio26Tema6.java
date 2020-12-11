package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio26Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la anchura de la tableta: ");
    int anchura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca la altura de la tableta: ");
    int altura = Integer.parseInt(s.nextLine());
    int contador = 1;

    int alturaAleatoria = (int) (Math.random() * altura) + 1;
    for (int i = 0; i < altura; i++) {
      if (alturaAleatoria == contador) {
        int bocado = ((int) (Math.random() * 2) + 1);
        switch (bocado) {
          case 1:
            System.out.print(" ");
            for (int k = 0; k < anchura - 1; k++) {
              System.out.print("*");
            }
            break;
          case 2:
            for (int q = 0; q < anchura - 1; q++) {
              System.out.print("*");
            }
            System.out.print(" ");
        }
      } else {
        for (int j = 0; j < anchura; j++) {
          System.out.print("*");
        }
      }
      System.out.println("");
      contador++;

    }
  }
}
