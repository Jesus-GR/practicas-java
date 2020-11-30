package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio9Tema6 {

  public static void main(String[] args) {
    int numero = 0;

    do {
      System.out.print((int) (Math.random() * 100) + 1 + ",");
      numero++;
    } while ((int) (Math.random() * 100) + 1 != 24);
    System.out.println("");
    System.out.println("Se han sacado por pantalla " + numero + " numeros");

  }
}
