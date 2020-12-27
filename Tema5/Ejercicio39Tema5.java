
package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio39Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Introduce un numero entero positivo: ");
    int numero = Integer.parseInt(s.nextLine());
    int factorial =0;
    int multiplicacion = 1;
    for (int i = 1; i <= numero; i++) {
      System.out.print(i+"! = ");
     factorial = i * multiplicacion;
     multiplicacion = factorial;
      System.out.println(factorial);
      
    }
  }
  
}
