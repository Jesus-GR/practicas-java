package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio20Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introducta la altura por favor: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el caracter de la pirámide: ");
    String relleno = s.nextLine();
    int numeroFilas = 1;
    int espacio = altura - 1;
//    int numeroRelleno = 1;
    int e = 0;
    int cuentaEspacio = 0;
    while (numeroFilas <= altura) {
      if (e == -1) {
        for (e = -1; e < espacio; e++) {
          System.out.print(" ");
          if (e >= 3) {
            System.out.print(relleno);
          }

        }
      } else {
        for (e = -1; e < espacio; e++) {
          System.out.print(" ");
        }

        System.out.print(relleno);
        for (int j = 1; j < cuentaEspacio; j++) {
          System.out.print(" ");
        }
        if (numeroFilas >= 2) {
          System.out.println(relleno);
        }

      }
//      cuentaEspacio++;
      espacio--;


      numeroFilas++;
      cuentaEspacio +=2;
      if (numeroFilas <= 2) {
        System.out.println("");
      }
    }for (int p = 0; p <cuentaEspacio+1 ; p++) {
      System.out.print(relleno);
    }
    
    
  }
}
