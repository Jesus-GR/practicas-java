package tema5;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio44Tema5 {

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
    System.out.print("Introduzca la posicion donde quiere insertar: ");
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
   
      for (int i = 0; i <= volteado; i++) {
      numeroCortado2 = (numeroCortado2*10)+volteado%10;
      volteado/=10;
    }
   
    System.out.print("Introduzca el digito que quiere insertar: ");
    int digitoInsertar = Integer.parseInt(s.nextLine());
    System.out.print("EL numero resultante es "+(int)numeroCortado1+""+digitoInsertar+""+numeroCortado2);
    System.out.println("");
  }
  
}
