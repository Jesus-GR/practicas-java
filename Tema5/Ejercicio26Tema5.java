package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio26Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(s.nextLine());
    int numeroFinal = numero; // Esto lo pongo porque en el print final me da numero =0;
    int volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;

    }

    System.out.print("Introduce un dígito: ");
    long digito = Integer.parseInt(s.nextLine());
    long contadorNumero = 0;
    long contadorPosicion = 0;
    long posicionFinal = 0;
    while (volteado > 0) {
      contadorNumero = volteado % 10;
      volteado /= 10;
      contadorPosicion++;
      if (contadorNumero == digito) {
        posicionFinal = contadorPosicion;
      System.out.println("La posicion del digito es; "+posicionFinal);
      }
      
      
    }
//    System.out.println("El dígito " + digito + " se encuentra dentro del numero " + numeroFinal + " en la posición " + contadorPosicion);
    System.out.println("");
  }
}
