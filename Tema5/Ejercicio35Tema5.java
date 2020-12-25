package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio35Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    boolean esCorrecto = true;
    int contadorAltura = 0;
    do {
      System.out.print("Introduzca la altura: ");
      altura = Integer.parseInt(s.nextLine());
      if (altura <= 3 || altura % 2 == 0) {
        System.out.println("El dato introducido no es correcto. Intentelo de nuevo");
        esCorrecto = false;
      } else {
        esCorrecto = true;
      }
    } while (!esCorrecto);

    int espacio = 0;
    int espacioInterno = altura-2;
    for (int i = 0; i < altura/2; i++) {
      for (int j = espacio; j > 0; j--) {
        System.out.print(" ");
      }
      espacio++;

      System.out.print("*");
      for (int j = 0; j < espacioInterno; j++) {
        System.out.print(" ");
      }
      System.out.println("*");

      espacioInterno -= 2;
      contadorAltura++;

    }
    for (int i = espacio; i > 0 ; i--) {
      System.out.print(" ");
    }
    System.out.println("*");
    espacioInterno = 1;
    for (int i = 0; i < altura/2; i++) {
      for (int j = espacio-1; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = espacioInterno; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
      espacioInterno+=2;
      espacio--;
    }
    
  }

}
