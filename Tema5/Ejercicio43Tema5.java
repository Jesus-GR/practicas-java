
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio43Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    double contadorNumero =0;
    double division = 0;
    
    for (int i = numeroIntroducido; i > 0 ; i/=10) {
      contadorNumero++;
    }
    division = Math.pow(10, contadorNumero-1);
    System.out.print("Introduzca la posicion a partir de la cual quiere partir el numero: ");
    int posicion = Integer.parseInt(s.nextLine());
    double numeroCortado1 = 0;
    
    for (int i = 1; i < posicion; i++) {
      numeroCortado1 = numeroIntroducido/division;
      division/=10;
      
    }
    int numeroCortado2 = 0;
    int volteado = 0;
    for (int i = 0; i < contadorNumero-(posicion-1); i++) {
      volteado = (volteado*10)+numeroIntroducido%10;
      numeroIntroducido/=10;
    }
   
      for (int i = 0; i < volteado; i++) {
      numeroCortado2 = (numeroCortado2*10)+volteado%10;
      volteado/=10;
    }
   
    
    System.out.print("Los numeros partidos son el "+(int)numeroCortado1+" y el "+numeroCortado2);
    System.out.println("");
  }
  
}
