
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio7Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numeros = new int[100];
    for (int i = 0; i < 100; i++) {
      numeros[i] = (int) (Math.random()*21);
      System.out.print(numeros[i]+" ");
    }
    System.out.println("");
    System.out.print("Introduce el primer valor: ");
    int valor1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el segundo valor: ");
    int valor2 = Integer.parseInt(s.nextLine());
    for (int i = 0; i < 100; i++) {
      if(numeros[i]== valor1){
        System.out.print("'"+valor2+"' ");
      }else if(numeros[i]== valor2){
        System.out.print("'"+valor1+"' ");
      }else{
        System.out.print(numeros[i]+" ");
      }
    }
  }
  
}
