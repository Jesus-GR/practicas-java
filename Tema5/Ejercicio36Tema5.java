
package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio36Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int numero = numeroIntroducido;
 
    int digitoNumero = 0;
    int volteado = 0;
    int digitoVolteado = 0;
    int contadorDigito =0;
    for (int i = numero; i >0; i/=10) {
      volteado = (volteado*10)+ numero%10;
      numero/=10; 
      contadorDigito++;
    }
    int contadorCapicua = 0;
    numero = numeroIntroducido;
    for (int i = 0; i < contadorDigito; i++) {
      digitoNumero = numero%10;
      numero/=10;
      
      digitoVolteado = volteado%10;
      volteado/=10;
      
      if(digitoNumero == digitoVolteado){
        contadorCapicua++;
      }
    }
 
    if(contadorCapicua == contadorDigito){
      
      System.out.println("El numero "+numeroIntroducido+" es capicua");
    }else{
      System.out.println("El numero "+numeroIntroducido+" no es capicua");
    }
  }
  
}
