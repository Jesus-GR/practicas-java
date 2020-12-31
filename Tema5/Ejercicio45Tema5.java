
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio45Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("Introduzca la posicion dentro del numero: ");
    long posicion = Long.parseLong(s.nextLine());
    System.out.print("Introduzca el nuevo digito: ");
    long digito = Long.parseLong(s.nextLine());
    long contador =0;
    for (long i = numeroIntroducido; i > 0; i/=10) {
      contador++;
    }
    
    double potencia = Math.pow((double)10, (double)contador);
    long posicionInserccion =0;
    for (int i = 0; i <=posicion; i++) {
      posicionInserccion = numeroIntroducido/(long)potencia;
      potencia/=10;
    }
    posicionInserccion = posicionInserccion-posicionInserccion%10;
    posicionInserccion = posicionInserccion+digito;
    System.out.println(posicionInserccion);
    long volteado = 0;
    for (int i = 0; i < contador-posicion; i++) {
      volteado = (volteado*10)+numeroIntroducido%10;
      numeroIntroducido/=10;
    }
    long parteFinalNumero = 0 ;
    for (int i = 0; i <=volteado; i++) {
      parteFinalNumero = (parteFinalNumero*10)+volteado%10;
      volteado/=10;
    }
    System.out.println("El numero resultante es: "+posicionInserccion+""+parteFinalNumero);
  }
  
}
