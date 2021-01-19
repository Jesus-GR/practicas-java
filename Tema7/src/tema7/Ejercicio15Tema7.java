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

public class Ejercicio15Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);

    int[] ocupacion = new int[11];
    for (int i = 1; i < 11; i++) {
      ocupacion[i] = (int) (Math.random() * 5);
    }
    boolean salir = false;
    boolean estaLibre = false;
    int reserva = 0;
    do {
      System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
      System.out.print(" Mesa nº ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %3d    ", i);
      }
      System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
      System.out.print("Ocupacion");
      for (int i = 1; i < 11; i++) {
        System.out.printf("|%3d     ", ocupacion[i]);
      }
      System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
      System.out.println("");
      estaLibre = false;
      System.out.print("Por favor, ¿Cuantos son? (Introduzca -1 para salir) : ");
      reserva = Integer.parseInt(s.nextLine());
      if (reserva == -1) {
        salir = true;
        System.out.println("Gracias. Hasta pronto.");
      } else if (reserva >= 5) {
        System.out.println("Lo siento, el número máximo por mesa es de 4 personas");
      } else if (reserva < 5) {
        for (int j = 1; j < 11 && !estaLibre; j++) {
          if (ocupacion[j] == 0) {
            ocupacion[j] = reserva;
            System.out.println("Por favor, siéntese en la mesa " + j);
            estaLibre = true;

          }
        }
        for (int i = 1; i < 11 && !estaLibre; i++) {
          if (!estaLibre && ocupacion[i] + reserva < 5) {
            ocupacion[i] += reserva;
            System.out.println("Tendrá que compartir mesa. Por favor, siéntese en la mesa : " + i);
            estaLibre = true;
          } 
        }
         if (!estaLibre) {
            System.out.println("Lo siento. Estamos completos.");
            estaLibre = true;
          }

        }

      }while (!salir);

    } 
  }
