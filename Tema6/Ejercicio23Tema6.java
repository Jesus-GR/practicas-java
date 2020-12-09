package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio23Tema6 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      int tirada = (int) (Math.random() * 6) + 1;
      switch (tirada) {
        case 1:
          System.out.print("🂡");
          break;
        case 2:
          System.out.print("🂾");
          break;
        case 3:
          System.out.print("🂽");
          break;
        case 4:
          System.out.print("🂻");
          break;
        case 5:
          System.out.print("🂧");
          break;
        case 6:
          System.out.print("🂨");
          break;
      }
    }
    System.out.println("");
  }

}
