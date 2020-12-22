package tema4;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio28 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Turno del jugador 1: ");
    String jugador1 = s.nextLine();
    System.out.print("Turno del jugador 2: ");
    String jugador2 = s.nextLine();

    if (jugador1.equals("papel") && jugador2.equals("piedra")) {
      System.out.println("Gana jugador 1");
    } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
      System.out.println("Gana jugador 1");
    } else if (jugador1.equals("tijeras") && jugador2.equals("papel")) {
      System.out.println("Gana jugador 1");
    } else if (jugador1 .equals (jugador2)) {
      System.out.println("Empate");
    } else {
      System.out.println("Gana jugador 2");
    }
  }

}
