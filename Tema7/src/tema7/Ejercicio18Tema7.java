/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio18Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);
    int[] numero = new int[10];
    for (int i = 0; i < 10; i++) {
      numero[i] = (int) (Math.random() * 201);
    }
    System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    System.out.print("|Indice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│ %3d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    System.out.print("|Valor   ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%3d     ", numero[i]);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    int[] numeroMayorCien = new int[10];
    int[] numeroMenorCien = new int[10];
    int contadorMayorCien = 0;
    int contadorMenorCien = 0;
    for (int i = 0; i < 10; i++) {
      if (numero[i] >= 100) {
        numeroMayorCien[contadorMayorCien] = numero[i];
        contadorMayorCien++;
      } else {
        numeroMenorCien[contadorMenorCien] = numero[i];
        contadorMenorCien++;
      }
    }
    contadorMenorCien = 0;
    contadorMayorCien = 0;
    int contadorNumero = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        if (numeroMenorCien[contadorMenorCien] != 0) {
          numero[i] = numeroMenorCien[contadorMenorCien];
          contadorMenorCien++;
          contadorNumero++;
        } else {
          numero[i] = numeroMayorCien[contadorMayorCien];
          contadorMayorCien++;
        }

      } else {
        if (numeroMayorCien[contadorMayorCien] != 0) {
          numero[i] = numeroMayorCien[contadorMayorCien];
          contadorMayorCien++;
        } else {
          numero[i] = numeroMenorCien[contadorMenorCien];
          contadorMenorCien++;
        }

      }
    }
    System.out.println("");
    System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    System.out.print("|Indice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│ %3d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    System.out.print("|Valor   ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%3d     ", numero[i]);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  }
}
