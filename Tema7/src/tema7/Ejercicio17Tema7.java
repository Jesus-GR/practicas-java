/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio17Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[10];
    for (int i = 0; i < 10; i++) {
      numeros[i] = (int) (Math.random() * 101);
      System.out.print(numeros[i] + " ");
    }
    int numeroIntroducido = 0;
    boolean estaNumero = false;
    System.out.println("");
    do {
      System.out.print("Introduce un numero: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      for (int i = 0; i < 10 && !estaNumero; i++) {
        if (numeroIntroducido == numeros[i]) {
          estaNumero = true;
        }
      }
      if (estaNumero == false) {
        System.out.println("Lo siento. El numero introducido no esta en la lista. Vuelva a intentarlo");
      }
    } while (!estaNumero);

    int ultimo = 0;

    while (numeros[0] != numeroIntroducido) {
      ultimo = numeros[9];
      for (int i = 9; i > 0; i--) {
        numeros[i] = numeros[i - 1];
      }
      numeros[0] = ultimo;

    }
    for (int n : numeros) {
      System.out.print(n + " ");
    }
    System.out.println("");

  }

}
