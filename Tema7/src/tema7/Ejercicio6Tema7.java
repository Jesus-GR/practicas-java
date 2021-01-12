package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio6Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 15 numeros por teclado: ");
    int cantidadNumeros = 15;
    int[] numeros = new int[cantidadNumeros];
    for (int i = 0; i < cantidadNumeros; i++) {
       numeros[i] = Integer.parseInt(s.nextLine());
//       System.out.print("numeros ["+i+"] = " +numeros[i]+" ");
    }
    
    System.out.println("numeros["+(numeros.length-1)+"] = " +numeros[numeros.length-1]+ " ");
        for (int i = 0; i < numeros.length-1; i++) {
          System.out.println("numeros ["+i+"] = "+numeros[i]+" ");
    }
   
  }

}
