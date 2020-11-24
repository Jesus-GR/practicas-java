package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio3Tema6 {

  public static void main(String[] args) {
    int carta = ((int) (Math.random() * 10) + 1);
    switch (carta) {
      case 1:
        System.out.println("As");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        System.out.print(carta);
        break;
      case 8:
        System.out.print("Sota");
        break;
      case 9:
        System.out.print("Caballo");
        break;
      case 10:
        System.out.print("Rey");
        break;
      default:
    }
    System.out.print(" de ");
    int palo = ((int) (Math.random() * 4) + 1);
    switch(palo){
      case 1:
        System.out.println("Bastos");
        break;
      case 2:
        System.out.println("Esapadas");
        break;
      case 3:
        System.out.println("Copas");
        break;
      case 4:
        System.out.println("Oro");
        break;
      default:
    }
  }

}
