
package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;
public class Ejercicio24Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un altura: ");
    int altura = Integer.parseInt(s.nextLine());
    int alturaPiso=0;
    int espacio = altura -1;
    int linea=1;
    int numero = 1;
    
    while(alturaPiso < altura){
      for (int i = espacio; i > 0; i--) {
        System.out.print(" ");
        
      }
      for (int i = linea; i > 0; i--) { 
        numero = numero;
        System.out.print(numero);
        numero++;
        
      }
      numero--;
      for (int i = linea; i >1; i--) {
        numero--;
        System.out.print(numero);
      }
      System.out.println("");
      linea++;
      espacio--;
      alturaPiso++;
      numero =1;
      
    }
  }
  
}
