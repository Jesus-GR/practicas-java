
package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 *
 */
import java.util.Scanner;
public class Ejercicio41Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    long numero = numeroIntroducido;
    long digito = 0;
    long contadorPar =0;
    long contadorImpar = 0;
    for (long i = numeroIntroducido; i > 0; i/=10) {
      digito = numeroIntroducido%10;
      numeroIntroducido/=10;
      if(digito%2==0){
        contadorPar++;
      }else{
        contadorImpar++;
      }
      
    }
    System.out.println("EL numero "+numero+" contiene "+contadorPar+" digitos pares y "+contadorImpar+" digitos impares.");
  }
  
}
