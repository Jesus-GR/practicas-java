//package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio6Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeroAzar = ((int) (Math.random()*101));
    System.out.println(numeroAzar);
    boolean numeroAcertado = true;
    int contador = 4;
    do {
      System.out.println("Introduce un número: ");
      int numeroIntroducido;
      numeroIntroducido = Integer.parseInt(s.nextLine());

      if (numeroIntroducido != numeroAzar) {
        numeroAcertado = false;
        System.out.print("El numero no es correcto. ");
        if(contador>0){
        System.out.println("Te quedan " + contador + " intentos");
        }
      } else {
        numeroAcertado = true;
        System.out.println("Enhorabuena, has acertado");
      }
      contador--;
    } while (!numeroAcertado && contador >= 0);
    if (!numeroAcertado) {
      System.out.println("Lo siento, no te quedan intentos");

    }
  }
}
