package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio20Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la capacidad en litros: ");
    int capacidad = Integer.parseInt(s.nextLine());
    int litros = (int) (Math.random() * capacidad) + 1;
    int espacioVacio = capacidad - litros;

    if (capacidad == litros) {
      for (int i = 0; i < capacidad; i++) {
        System.out.println("┃♒♒♒♒┃");
      }
    } else {
      for (int i = 0; i < espacioVacio; i++) {
        System.out.println("┃    ┃");
      }
      for (int i = 0; i < capacidad - espacioVacio; i++) {
        System.out.println("┃♒♒♒♒┃");
      }

    }

    System.out.println("┗━━━━┛");
    System.out.println("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+litros+" de agua");

  }

}
