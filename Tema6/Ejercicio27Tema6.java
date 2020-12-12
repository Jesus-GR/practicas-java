package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio27Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean entradaCorrecta = false;

    String turnoJugador;
    do {
      System.out.print("Turno del jugador(introduzca piedra, papel o tijera): ");
      turnoJugador = (s.nextLine());

      if (turnoJugador.equals("piedra") || turnoJugador.equals("papel") || turnoJugador.equals("tijeras")) {
        entradaCorrecta = false;
      } else {
        entradaCorrecta = true;
        System.out.println("Valor introducido incorrecto. Por favor vuelva a intentar");
      }
    } while (entradaCorrecta);

    int turnoOrdenador = (int) (Math.random() * 3) + 1;
    String ordenador = "";
    System.out.print("Turno del ordenador: ");
    switch (turnoOrdenador) {
      case 1:
        ordenador = ("piedra");
        System.out.println(ordenador);
        break;
      case 2:
        ordenador = ("papel");
        System.out.println(ordenador);
        break;
      case 3:
        ordenador = ("tijeras");
        System.out.println(ordenador);
        break;

    }
    if(turnoJugador .equals (ordenador)){
      System.out.println("Empate");
    }else if(turnoJugador .equals ("piedra") && ordenador .equals ("tijeras")){
      System.out.println("Gana Jugador");
    }else if(turnoJugador .equals  ("papel") && ordenador .equals  ("piedra")){
      System.out.println("Gana Jugador");
    }else if(turnoJugador .equals  ("tijeras") && ordenador .equals  ("papel")){
      System.out.println("Gana Jugador");
    }else{
      System.out.println("Gana Ordenador");
    }
  }
}
