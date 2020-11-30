
package tema6;
/**
 *
 * @author Jesús Gutiérerz
 */
public class Ejercicio11Tema6 {

  public static void main(String[] args) {
    int suspenso=0;
    int suficiente =0;
    int bien =0;
    int notable =0;
    int sobresaliente =0;
    for (int i = 0; i < 20; i++) {
      switch ((int)(Math.random()*5+1)){
        case 1:
          System.out.print("Suspenso, ");
          
          suspenso++;
          break;
        case 2:
          System.out.print("Suficiente, ");
          
          suficiente++;
          break;
        case 3:
          System.out.print("Bien, ");
          
          bien++;
          break;
        case 4:
          System.out.print("Notable, ");
          
          notable++;
          break;
        case 5:
          System.out.print("Sobresaliente, ");
          
          sobresaliente++;
          break;
        default:
      }
      System.out.println("");
    }
    System.out.println("El numero de suspensos es de: "+suspenso);
    System.out.println("El numero de suficientes es de: "+suficiente);
    System.out.println("El numero de bien es de: "+bien);
    System.out.println("El numero de notables es de: "+notable);
    System.out.println("El numero de sobresalientes es de: "+sobresaliente);
  }
  
}
