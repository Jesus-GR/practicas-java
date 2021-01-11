
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
public class Ejercicio1Tema7 {

  public static void main(String[] args) {
    int [] numero = new int[12];
    numero[0] = 39; 
    numero[1] = -2;
    numero[4] = 0;
    numero[6] = 14;
    numero[8] = 5;
    numero[9] = 120;
    
    for(int i = 0; i < 12; i++){
      System.out.printf("numero [%2d]: %d",i,numero[i]);
      System.out.println("");
    }
    /*Los numeros no inicializados se pintan como 0 */
  }
}
