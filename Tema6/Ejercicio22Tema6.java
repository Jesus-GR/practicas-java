
package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio22Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la longitud de la serpiente contando la cabeza: ");
    int longitudIntroducida = Integer.parseInt(s.nextLine());
    System.out.println("            @");
    for (int i = 0; i < longitudIntroducida-1; i++) {
      int longitud = (int)(Math.random()*3)+1;
      switch(longitud){
        case 1:
          System.out.println("            *");
          break;
        case 2: 
          System.out.println("           *");
          break;
        case 3:
          System.out.println("             *");
          break;
        default:
      }
    }
  }
  
}
