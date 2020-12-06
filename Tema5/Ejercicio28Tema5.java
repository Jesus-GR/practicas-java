
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio28Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un numero entero: ");
    int numeroEntero= Integer.parseInt(s.nextLine());
    long factorial = 0;
    long numero = 1;
    for (int i = 1; i <=numeroEntero; i++) {
      factorial = numero * i;
      numero = factorial;
    }
    System.out.println(numeroEntero+"! = "+ factorial);
  }
  
}
