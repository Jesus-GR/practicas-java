
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio3Tema7 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int[] numero = new int[10];
   int numeroIntroducido = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
    numeroIntroducido = Integer.parseInt(s.nextLine());
    numero[i] = numeroIntroducido;
    }
    for (int i = 9; i >=0; i--) {
      System.out.println("numero ["+i+"]: "+numero[i]);
    }
   
    
  }
  
}
