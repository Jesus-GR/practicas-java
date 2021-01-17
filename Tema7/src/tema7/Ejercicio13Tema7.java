package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio13Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[100];

    for (int i = 0; i < 100; i++) {
      numeros[i] = (int) (Math.random() * 101);
    }
    for (int numero : numeros) {
      System.out.print(numero + " ");
    }
    int maximo = 0;
    int minimo = 100;
    for (int i = 0; i < 100; i++) {
      if (numeros[i] > maximo) {
        maximo = numeros[i];
      } else if (numeros[i] < minimo) {
        minimo = numeros[i];
      }
    }
    System.out.println("");
    System.out.print("Que quiere descatar? (1-minimo, 2-maximo): ");
    int eleccion = Integer.parseInt(s.nextLine());

    if (eleccion == 1) {
      for (int i = 0; i < 100; i++) {
        if (numeros[i] == minimo) {
          System.out.print("**" + numeros[i] + "** ");
          minimo += 100;
        } else {
          System.out.print(numeros[i] + " ");
        }
      }
    } else {
      for (int i = 0; i < 100; i++) {
        if (numeros[i] == maximo) {
          System.out.print("**" + numeros[i] + "** ");
          maximo += 100;
        } else {
          System.out.print(numeros[i] + " ");
        }
      }
    }
  }

}
