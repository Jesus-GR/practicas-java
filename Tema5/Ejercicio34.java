package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un numero: ");
    long primerNumero = Integer.parseInt(s.nextLine());
    System.out.print("Introduce otro numero: ");
    long segundoNumero = Integer.parseInt(s.nextLine());
    long volteadoPrimero = 0;
    long volteadoSegundo = 0;
    long contadorPrimero = 0;
    long contadorSegundo = 0;
    for (long i = primerNumero; i > 0; i /= 10) {
      volteadoPrimero = (volteadoPrimero * 10) + primerNumero % 10;
      primerNumero /= 10;
      contadorPrimero++;
    }
    for (long i = segundoNumero; i > 0; i /= 10) {
      volteadoSegundo = (volteadoSegundo * 10) + segundoNumero % 10;
      segundoNumero /= 10;
      contadorSegundo++;
    }

    System.out.println("volteadoPrimero es " + volteadoPrimero);
    System.out.println("VolteadoSegundo es " + volteadoSegundo);

    long digito= 0;
    long numeroPar=0;
    long numeroImpar = 0;
 
    for (long i = volteadoPrimero; i > 0; i /= 10) {
      digito = volteadoPrimero % 10;
      volteadoPrimero /= 10;
      if (digito % 2 == 0) {
        numeroPar = (numeroPar*10) + digito;
      } else {
        numeroImpar = (numeroImpar * 10 )+ digito;
      }

      digito = volteadoSegundo % 10;
      volteadoSegundo /= 10;
      if (digito % 2 == 0) {
        numeroPar = (numeroPar * 10) + digito;
      } else {
        numeroImpar = (numeroImpar * 10 + digito);
      }
    }

    System.out.println("numeroPar "+numeroPar);
    
    System.out.println("numeroImpar "+numeroImpar);

  }

}
