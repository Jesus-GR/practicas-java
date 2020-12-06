package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio27Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(s.nextLine());
    int cuenta = 0;
    int suma = 0;
    int numeroSuma = 0;
    for (int i = 0; i <= numero; i += 3) {
      System.out.print(i + ", ");
      suma = numeroSuma + i;
      cuenta++;
      numeroSuma = suma;
      
    }
    System.out.println("");
    System.out.print("El total de multiplos de 3 es: " + cuenta);
    System.out.println("");
    System.out.print("La suma total de los multiplos de 3 es: " + suma);
    System.out.println("");
  }

}
