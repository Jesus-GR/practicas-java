package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio10Tema6 {

  public static void main(String[] args) {
    int lineas = 10;
    
    

    for (int i = 0; i < 10; i++) {
      int numero = (int) (Math.random() * 6 + 1);
      int longitudLinea = (int)(Math.random()*40+1);
      for (int j = 0; j < longitudLinea; j++) {
        switch (numero) {
          case 1:
            System.out.print("*");
            break;
          case 2:
            System.out.print("-");
            break;
          case 3:
            System.out.print("=");
            break;
          case 4:
            System.out.print(".");
            break;
          case 5:
            System.out.print("|");
            break;
          case 6:
            System.out.print("@");
            break;
          default:
        }
      }
      System.out.println("");
    }
  }
}
