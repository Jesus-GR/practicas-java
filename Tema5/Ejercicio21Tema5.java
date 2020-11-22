package tema5;

/**
 *
 * @author Jesús Guiérrez
 */
import java.util.Scanner;

public class Ejercicio21Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int numerosIntroducidos = 0;
    int totalNumeros = 0;
    int totalImpares = 0;
    int sumaNumeroImpar = 0;
    int mediaImpares = 0;
    int numeroIntroducidoImpar = 0;
    int maximoPar = 0;
    do {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(s.nextLine());
//      System.out.println(numero);
      if (numero % 2 != 0 && numero >= 0) {
        totalImpares = numero + sumaNumeroImpar;
        sumaNumeroImpar = totalImpares + numero - numero;
        numeroIntroducidoImpar++;
      } else {
        if (numero > maximoPar) {
          maximoPar = numero;
        }
        numerosIntroducidos++;
      }
    } while (numero >= 0);
    totalNumeros = numerosIntroducidos - 1;
    mediaImpares = totalImpares / numeroIntroducidoImpar;
    System.out.println("El total de los números introducidos son: " + totalNumeros);
    System.out.println("La media de los impares es: " + mediaImpares);
    System.out.println("El máximo de los número par es: " + maximoPar);

  }
}
