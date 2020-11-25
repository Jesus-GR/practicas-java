package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio23Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sumaNumero = 0;
    int contador = 0;
    double media = 0;
    while (sumaNumero < 1000) {
      System.out.println("Introduce un número: ");
      int numeroIntroducido = Integer.parseInt(s.nextLine());
      sumaNumero = sumaNumero + numeroIntroducido;
      contador++;
      media = (double) sumaNumero / (double) contador;
    }
    System.out.println("El total de los números introducidos es: " + sumaNumero);
    System.out.println("Has introducido un total de " + contador + " números");
    System.out.println("La media es de : " + media);
  }

}
