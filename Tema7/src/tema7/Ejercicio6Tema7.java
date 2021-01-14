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

    }
    int ultimo = numeros[numeros.length-1];
    System.out.println(ultimo);
    int [] desplazado = new int[numeros.length];
    int contador =0;
    for (int i = 0; i < numeros.length; i++) {
      if(i==0){
        desplazado[i]= ultimo;
      }else{
        desplazado[i]=numeros[contador];
        contador++;
      }
      
    }
    for (int d : desplazado) {
      System.out.print(d+" ");
    }

  }
}
