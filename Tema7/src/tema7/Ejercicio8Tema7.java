package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio8Tema7 {

  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    int[] temperatura = new int[12];

    for (int i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(s.nextLine());
    }

    for (int i = 0; i < 12; i++) {
//      if (mes[i].equals("febrero") || mes[i].equals("septiembre") || mes[i].equals("octubre") || mes[i].equals("noviembre") || mes[i].equals("diciembre")) {
//        System.out.print(mes[i] + ":\t\t");
//      } else {
//        System.out.print(mes[i] + ":\t\t\t");
//      }
      System.out.printf("%-10s :",mes[i]);

      for (int j = -50; j <= 0; j++) {
        
        if (temperatura[i] <= j) {
          System.out.print("■");
        } else {
          System.out.print(" ");
        }
      }
      for (int j = 0; j < 51; j++) {

        if (temperatura[i] >= j) {
          System.out.print("□");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");

    }
  }
}


