
package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio38Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esCorrecto = false;
    int alturaIntroducida = 0;
    do{
    System.out.print("Introduzca la altura: ");
     alturaIntroducida = Integer.parseInt(s.nextLine());
     
    if(alturaIntroducida<=3 || alturaIntroducida%2 == 0){
      System.out.println("El dato introducido no es correcto. Por favor vuelta a intentarlo. ");
      esCorrecto = false;
    }else{
      esCorrecto=true;
    }
    }while(!esCorrecto);
    int altura = alturaIntroducida;
    int espacio = 0;
    int relleno = altura;
    for (int i = 0; i < altura/2; i++) {
      for (int j = espacio; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j <relleno; j++) {
        System.out.print("*");
      }
      relleno-=2;
      espacio++;
      System.out.println("");
      
    }
    espacio = (altura/2);
    relleno = 1;
    for (int i = 0; i < (alturaIntroducida/2)+1; i++) {
      for (int j = espacio; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < relleno; j++) {
        System.out.print("*");
      }
      espacio--;
      relleno+=2;
      System.out.println("");
    }
  
  }
  
}
