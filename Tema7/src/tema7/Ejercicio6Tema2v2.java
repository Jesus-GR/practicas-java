
package tema7;

import java.util.Scanner;

public class Ejercicio6Tema2v2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 15 numeros por teclado: ");
    int cantidadNumeros = 15;
    int[] numeros = new int[cantidadNumeros];
    for (int i = 0; i < cantidadNumeros; i++) {
      numeros[i] = Integer.parseInt(s.nextLine());

    }
    System.out.println("El array normal");
    for (int numero : numeros) {
      System.out.print(numero+" ");
    }
    System.out.println("");
    int ultimo = numeros[14];
    for (int i = 14; i > 0; i--) {
      numeros[i] = numeros[i-1]; 
    }
    numeros[0]=ultimo;
    System.out.println("El array modificado");
    for (int n : numeros) {
      System.out.print(n+" ");
    }
  }
  
}
