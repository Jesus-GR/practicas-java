
//package tema6;

/**
 *
 * @author Jesús Gutiérerz
 */
public class Ejercicio12Tema6 {

  public static void main(String[] args) {
    
      System.out.print("\33[32m]");
      for (int j = 1; j > 0;) {
        for (int i = 0; i < 100; i++) {
          System.out.print((char) (int)(Math.random()*94+32));
        }
        System.out.println("");
      }
      
    
 
  }
  
}
