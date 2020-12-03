package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio16Tema6 {

  public static void main(String[] args) {
    int numeroAleatorio1 = 0;
    int numeroAleatorio2 = 0;
    int numeroAleatorio3 = 0;
    for (int i = 0; i < 1; i++) {
      numeroAleatorio1 = (int) (Math.random() * 5) + 1;

      switch (numeroAleatorio1) {
        case 1:
          System.out.print("☢ ");
          break;
        case 2:
          System.out.print("☠ ");
          break;
        case 3:
          System.out.print("☣ ");
          break;
        case 4:
          System.out.print("☮ ");
          break;
        case 5:
          System.out.print("⚛ ");
          break;
        default:
      }

    }
    for (int i = 0; i < 1; i++) {
      numeroAleatorio2 = (int) (Math.random() * 5) + 1;
      switch (numeroAleatorio2) {
        case 1:
          System.out.print("☢ ");
          break;
        case 2:
          System.out.print("☠ ");
          break;
        case 3:
          System.out.print("☣ ");
          break;
        case 4:
          System.out.print("☮ ");
          break;
        case 5:
          System.out.print("⚛ ");
          break;
        default:
      }
    }
    for (int i = 0; i < 1; i++) {
      numeroAleatorio3 = (int) (Math.random() * 5) + 1;
      switch (numeroAleatorio3) {
        case 1:
          System.out.print("☢ ");
          break;
        case 2:
          System.out.print("☠ ");
          break;
        case 3:
          System.out.print("☣ ");
          break;
        case 4:
          System.out.print("☮ ");
          break;
        case 5:
          System.out.print("⚛ ");
          break;
        default:
      }
    }
    if (numeroAleatorio1 == numeroAleatorio2 && numeroAleatorio2 == numeroAleatorio3) {
      System.out.println("Enhorabuena. Has ganado 10 monedas");
    } else if (numeroAleatorio1 == numeroAleatorio2 || numeroAleatorio2 == numeroAleatorio3) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
      System.out.println("Lo siento. Ha perdido");
    }
  }

}
