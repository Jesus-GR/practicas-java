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

public class Ejercicio19Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);

    int[] array = new int[12];
    for (int i = 0; i < 12; i++) {
      array[i] = (int) (Math.random() * 201);
    }
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d", i);
    }
    System.out.println("");
    for (int a : array) {
      System.out.printf("%4d", a);
    }
    System.out.println("");
    System.out.print("Introduzca el numero que quiere insertar: ");
    int numeroInsertar = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca la posicion donde lo quiere insertar (0-11): ");
    int posicion = Integer.parseInt(s.nextLine());

    for (int i = array.length - 1; i > posicion; i--) {
      array[i] = array[i-1];
      }
    
      array[posicion] = numeroInsertar;
    
    System.out.println("Resultado");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d", i);
    }
    System.out.println("");
    for (int a : array) {
      System.out.printf("%4d", a);
    }
    System.out.println("");
  }
}
