
package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;
public class Ejercicio25Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int volteado = 0;
    for (int i = numeroIntroducido; i > 0; i/=10) {
      volteado = (volteado*10)+(numeroIntroducido%10);
      numeroIntroducido/=10;
      
    }
    System.out.print(volteado);
  }
  
}
