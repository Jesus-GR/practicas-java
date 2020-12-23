
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio31 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    int contadorAltura = 1;
    
    while(contadorAltura<=altura){
      if(contadorAltura <= altura-1){
        System.out.println("*");
      }else{
        for (int i = 0; i < (altura/2)+1; i++) {
          System.out.print("*");
        }
      }
      contadorAltura++;
      
    }
    System.out.println("");
    
    
  }
  
}
