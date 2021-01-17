package tema7;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio12Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 10 numeros");
    int[] numeros = new int[10];
    for (int i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("\tArray Inicial");
    System.out.print("Indice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%3d", i);
    }
    System.out.println("|");

    System.out.print("Valor  ");
    for (int j = 0; j < 10; j++) {
      System.out.printf("|%3d", numeros[j]);
    }
    System.out.println("|");

    boolean esCorrecto = false;
    int posicionInicial = 0;
    int posicionFinal = 0;
    while (!esCorrecto) {
      System.out.print("Introduzca la posicion inical: ");
      posicionInicial = Integer.parseInt(s.nextLine());
      System.out.print("Introduzca la posicion final: ");
      posicionFinal = Integer.parseInt(s.nextLine());
      if (posicionInicial > posicionFinal) {
        esCorrecto = false;
        System.out.println("Los datos introducidos no son validos. Intentelo de nuevo.");
      } else {
        esCorrecto = true;
      }
    }
    int rotacion = posicionFinal - posicionInicial;
    int ultimo = 0;
    for (int j = 0; j < rotacion; j++) {
      ultimo = numeros[9];
      for (int i = 9; i > 0; i--) {
        numeros[i] = numeros[i - 1];
      }
      numeros[0] = ultimo;
    }
    System.out.println("");
    System.out.println("\tArray Final");
    System.out.print("Indice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%3d", i);
    }
    System.out.println("|");

    System.out.print("Valor  ");
    for (int j = 0; j < 10; j++) {
      System.out.printf("|%3d", numeros[j]);
    }
    System.out.println("|");
  }
}
