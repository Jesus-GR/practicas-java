
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio9Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int [] numero = new int[8];
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduzca un numero: ");
      numero [i]= Integer.parseInt(s.nextLine());
    }
    
    for(int n : numero){
      System.out.println(n+ (n%2 == 0 ? " -par": " -impar"));
    }
    
  }
  
}
