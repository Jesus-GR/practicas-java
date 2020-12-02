//package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio2Tema6 {

  public static void main(String[] args) {

    int carta = ((int) (Math.random() * 13) + 1);
    switch (carta) {
      case 1:
        System.out.print("A");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        System.out.print(carta);
        break;
      case 11:
        System.out.print("J");
        break;
      case 12:
        System.out.print("Q");
        break;
      case 13:
        System.out.print("K");
        break;
    }
    System.out.print(" de ");
    int palo = (int) (Math.random() * 4) + 1;
    switch (palo) {
      case 1:
        System.out.println("Picas");
        break;
      case 2:
        System.out.println("Corazones");
        break;
      case 3:
        System.out.println("Diamantes");
        break;
      case 4:
        System.out.println("Trébol");
      default:
    }
  }

}
