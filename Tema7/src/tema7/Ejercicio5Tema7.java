
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio5Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int [10];
    System.out.print("Introduce 10 numeros: ");
    int numeroIntroducido =0;
    int maximo = 0;
    int minimo = 1000000;
    for (int i = 0; i < 10; i++) {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      numeros[i] = numeroIntroducido;
      if(numeros[i]>maximo){
        maximo = numeros[i];
      }
      if(numeros[i]< minimo){
        minimo=numeros[i];
      }
    }
    System.out.println("------------------------------");
    for (int i = 0; i < numeros.length; i++) {
      if(numeros[i]== maximo){
        System.out.println(numeros[i]+" maximo");
      }else if(numeros[i]== minimo){
        System.out.println(numeros[i]+" minimo");
      }else{
        System.out.println(numeros[i]);
      }
      
    }
  }
  
}
