
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio47Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esCorrecto = false;
    int altura =0;
    do{
      System.out.print("Introduzca la altura: ");
     altura = Integer.parseInt(s.nextLine());
    if(altura<5 || altura%2==0){
      esCorrecto = false;
      System.out.println("Los datos introducidos son incorrectos. Intentelo de nuevo");
    }else{
      esCorrecto = true;
    }
    }while(!esCorrecto);
    
    
    for (int i = 0; i <= altura; i++) {
      if(i==0){
        System.out.println("MMMMMM");
      }else if(i > 0 && i < (altura/2)){
        System.out.println("M    M");
      }else if (i==(altura/2)){
        System.out.println("MMMMMM");
      }else if ( i> (altura/2)+1 && i < altura){
        System.out.println("M    M");
      }else if(i >= altura){
        System.out.println("MMMMMM");
      }
    }
  }
  
}
