
package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio21Tema6 {

  public static void main(String[] args) {
   
    for (int i = 0; i < 5; i++) {
       int moneda = (int)(Math.random()*5)+1;
       switch(moneda){
         case 1:
           System.out.print("2 centimos -");
           break;
         case 2:
           System.out.print("20 centimos -");
           break;
         case 3:
           System.out.print("50 centimos -");
           break;
         case 4:
           System.out.print("1 euro -");
           break;
         case 5:
           System.out.print("2 euros -");
           break;
         default:
       }
       for (int j = 0; j <1; j++) {
        int cara = (int)(Math.random()*2)+1;
        switch(cara){
          case 1:
            System.out.print("cara");
            break;
          case 2:
            System.out.print("cruz");
            break;
          default:
        }
         System.out.println("");
      }
    }
  }
  
}
