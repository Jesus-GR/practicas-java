package tema7;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio14Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] palabras = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    String[] palabrasIntroducidas = new String[8];
    for (int i = 0; i < 8; i++) {
      palabrasIntroducidas[i] = s.nextLine();
    }
    System.out.println("Array original: ");
    System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : palabrasIntroducidas) {
      System.out.printf("│%-8s", p);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    int contadorColor = 0;
    int contadorNoColor = 0;
    String[] ordenColor = new String[8];
    String[] palabrasNoColor = new String[8];
    for (int i = 0; i < 8; i++) {
      if (palabrasIntroducidas[i].equals("azul") || palabrasIntroducidas[i].equals("verde") || palabrasIntroducidas[i].equals("rojo") || palabrasIntroducidas[i].equals("amarillo") || palabrasIntroducidas[i].equals("azul") || palabrasIntroducidas[i].equals("naranja") || palabrasIntroducidas[i].equals("rosa") || palabrasIntroducidas[i].equals("negro") || palabrasIntroducidas[i].equals("blanco") || palabrasIntroducidas[i].equals("morado")) {
        ordenColor[contadorColor] = palabrasIntroducidas[i];
        contadorColor++;
      } else {
        palabrasNoColor[contadorNoColor] = palabrasIntroducidas[i];
        contadorNoColor++;
      }
    }
    contadorNoColor = 0;
    for (int i = 0; i < 8; i++) {
      if (i < contadorColor) {
        palabrasIntroducidas[i] = ordenColor[i];
      } else {
        palabrasIntroducidas[i] = palabrasNoColor[contadorNoColor];
        contadorNoColor++;
      }
    }
    System.out.println("Array resultado: ");
    System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : palabrasIntroducidas) {
      System.out.printf("│%-8s", p);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    System.out.println("");
  }

}
