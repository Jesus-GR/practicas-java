package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio11Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 10 numeros");
    int[] numeros = new int[10];
    for (int i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("");
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
    int[] primos = new int[10];
    int[] noPrimos = new int[10];
    int contadorPrimos = 0;
    int cuentaPrimos = 0;
    int cuentaNoPrimos = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 1; j < 100; j++) {
        if (numeros[i] % j == 0) {
          contadorPrimos++;
        }
      }
      if (contadorPrimos == 2) {
        primos[cuentaPrimos] = numeros[i];
        cuentaPrimos++;
      } else {
        noPrimos[cuentaNoPrimos] = numeros[i];
        cuentaNoPrimos++;
      }
      contadorPrimos = 0;
    }
    int contadorNoPrimosBucleFinal = 0;
    for (int i = 0; i < 10; i++) {
      if (i < cuentaPrimos) {
        numeros[i] = primos[i];
      } else {
        numeros[i] = noPrimos[contadorNoPrimosBucleFinal];
        contadorNoPrimosBucleFinal++;
      }
    }
    System.out.println("");
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
