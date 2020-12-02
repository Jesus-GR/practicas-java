package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio15Tema6 {

  public static void main(String[] args) {

    int numeroCompases = (int) (Math.random() * 7) + 1;
    int nota1 = (int) (Math.random() * 7) + 1;
    switch (nota1) {
      case 1:
        System.out.print("Do ");
        break;
      case 2:
        System.out.print("Re ");
        break;
      case 3:
        System.out.print("Mi ");
        break;
      case 4:
        System.out.print("Fa ");
        break;
      case 5:
        System.out.print("Sol ");
        break;
      case 6:
        System.out.print("La ");
        break;
      case 7:
        System.out.print("Si ");
        break;
      default:

    }
    for (int i = 0; i < 3; i++) {
      switch ((int) (Math.random() * 7) + 1) {
        case 1:
          System.out.print("Do ");
          break;
        case 2:
          System.out.print("Re ");
          break;
        case 3:
          System.out.print("Mi ");
          break;
        case 4:
          System.out.print("Fa ");
          break;
        case 5:
          System.out.print("Sol ");
          break;
        case 6:
          System.out.print("La ");
          break;
        case 7:
          System.out.print("Si ");
          break;
        default:

      }

    }
    System.out.print("| ");

    for (int i = 0; i < numeroCompases - 2; i++) {
      for (int j = 0; j < 4; j++) {
        switch ((int) (Math.random() * 7) + 1) {
          case 1:
            System.out.print("Do ");
            break;
          case 2:
            System.out.print("Re ");
            break;
          case 3:
            System.out.print("Mi ");
            break;
          case 4:
            System.out.print("Fa ");
            break;
          case 5:
            System.out.print("Sol ");
            break;
          case 6:
            System.out.print("La ");
            break;
          case 7:
            System.out.print("Si ");
            break;
          default:

        }
      }
      System.out.print("| ");
    }
    for (int j = 0; j < 3; j++) {
      switch ((int) (Math.random() * 7) + 1) {
        case 1:
          System.out.print("Do ");
          break;
        case 2:
          System.out.print("Re ");
          break;
        case 3:
          System.out.print("Mi ");
          break;
        case 4:
          System.out.print("Fa ");
          break;
        case 5:
          System.out.print("Sol ");
          break;
        case 6:
          System.out.print("La ");
          break;
        case 7:
          System.out.print("Si ");
          break;
        default:

      }
    }
    switch (nota1) {
      case 1:
        System.out.print("Do ");
        break;
      case 2:
        System.out.print("Re ");
        break;
      case 3:
        System.out.print("Mi ");
        break;
      case 4:
        System.out.print("Fa ");
        break;
      case 5:
        System.out.print("Sol ");
        break;
      case 6:
        System.out.print("La ");
        break;
      case 7:
        System.out.print("Si ");
        break;
      default:

    }
    System.out.println("||");
  }
}
