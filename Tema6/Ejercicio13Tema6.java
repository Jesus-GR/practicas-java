//package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio13Tema6 {

  public static void main(String[] args) {

    int i = 0;
    while (i >= 0) {
      int dado1 = (int) (Math.random() * 6 + 1);
      int dado2 = (int) (Math.random() * 6 + 1);
      if (dado1!=dado2) {
        System.out.print(dado1+" ");
        System.out.println(dado2);
      }else{
        System.out.print(dado1+" ");
        System.out.print(dado2);
        i=-10;
      }
      
      i++;
      
    }
    System.out.println("");
  }

}
