package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio24Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int longitud = 0;
    int digito = 0;
    for (int i = numeroIntroducido; i > 0; i /= 10) {
      longitud++;

    }

    int posicion = (int) (Math.random() * longitud) + 1;

    for (int j = posicion; j > 0; j--) {
      digito = numeroIntroducido % 10;
      numeroIntroducido /= 10;
    }

    System.out.println(digito);
  }
}
