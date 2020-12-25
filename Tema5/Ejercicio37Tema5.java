package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio37Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int numero = numeroIntroducido;
    int volteado = 0;
    int contador = 0;
    for (int i = numero; i > 0; i /= 10) {
      volteado = (volteado * 10) + numero % 10;
      numero /= 10;
      contador++;
    }
    int digito = 0;
    for (int i = volteado; i > 0; i /= 10) {
      digito = volteado % 10;
      volteado /= 10;
      switch (digito) {
        case 0:
          System.out.print(" ");

          break;
        case 1:
          System.out.print("|");

          break;
        case 2:
          System.out.print("||");

          break;
        case 3:
          System.out.print("|||");

          break;
        case 4:
          System.out.print("||||");

          break;
        case 5:
          System.out.print("|||||");

          break;
        case 6:
          System.out.print("||||||");

          break;
        case 7:
          System.out.print("|||||||");

          break;
        case 8:
          System.out.print("||||||||");

          break;
        case 9:
          System.out.print("|||||||||");

          break;
        default:

      }
   
      if(contador>1){
        System.out.print("-");
      }
      contador--;


    }
    System.out.println("");
  }

}
