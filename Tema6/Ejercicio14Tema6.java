package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio14Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int pruebaNumero = 0;
    int numeroAleatorio = 0;

    int i = 0;

    int numeroMaximo = 100;
    int numeroMinimo = 0;
    int intento = 5;

    boolean elOrdenadorHaAcertado = false;

    do {
      pruebaNumero = (int) (Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo);
      System.out.println("Creo que es el número: " + pruebaNumero);
      System.out.println("A) He acertado");
      System.out.println("B) El número que tengo que adivinar es mayor");
      System.out.println("C) El número que tengo que adivinar es menor");
      System.out.print("Introduzca una opción: ");
      String respuesta = s.nextLine();

      if (respuesta.equals("A")) {
        System.out.println("He acertado. Soy una inteligencia superior");
        elOrdenadorHaAcertado = true;

      } else if (respuesta.equals("B")) {
        numeroMinimo = pruebaNumero + 1;
        System.out.println("Quedan " + intento + " intentos");

      } else if (respuesta.equals("C")) {
        numeroMaximo = pruebaNumero - 1;
        System.out.println("Te quedan " + intento + " intentos");
      }
      intento--;
    } while (!elOrdenadorHaAcertado && (intento >= 0));

  }
}
