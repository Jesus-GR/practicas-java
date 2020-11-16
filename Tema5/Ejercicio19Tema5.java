package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio19Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introdue un caracter para la pirámide: ");
    String caracter = (s.nextLine());
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = altura - 1;

    while (planta <= altura) {

      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(caracter);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
