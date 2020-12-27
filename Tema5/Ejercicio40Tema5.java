package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio40Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esCorrecto = false;
    int alturaIntroducida = 0;
    int altura = 0;
    do {
      System.out.print("Introduzca la altura: ");
      alturaIntroducida = Integer.parseInt(s.nextLine());
      altura = alturaIntroducida - 1;
      if (alturaIntroducida <= 3 || alturaIntroducida % 2 == 0) {
        System.out.println("El dato introducido no es correcto. Por favor vuelta a intentarlo. ");
        esCorrecto = false;
      } else {
        esCorrecto = true;
      }
    } while (!esCorrecto);
    int espacio = alturaIntroducida - 1;
    int espacioInterno = 1;
    for (int i = 0; i < altura; i++) {
      if (i < 1) {
        for (int j = espacio; j > 0; j--) {
          System.out.print(" ");
        }
        System.out.println("*");
      } else if (i <= (altura / 2)) {

        for (int j = espacio - 1; j > 0; j--) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 0; j < espacioInterno; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
        espacioInterno += 2;
        espacio--;
      } else if (i > altura / 2 && i < altura) {
        
        for (int j = espacio + 1; j > 0; j--) {
          System.out.print(" ");
        }

        System.out.print("*");

        for (int j = espacioInterno-4; j > 0; j--) {
          System.out.print(" ");
        }
        System.out.println("*");
        espacioInterno-=2;
        espacio++;
      }
    }
    for (int j = espacio+1; j >0; j--) {
          System.out.print(" ");
        }
        System.out.println("*");
  }

}
