
package tema5;

/**
 *
 * @author Jesus Gutierrez
 */import java.util.Scanner;
public class Ejercicio32 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    long volteado = 0;
    
    for (long i = numeroIntroducido; i > 0; i/=10) {
      volteado = (volteado*10) + numeroIntroducido%10;
      numeroIntroducido /=10;
    }
    long digito = 0;
    long sumaPar =0;
    long totalPar=0;
    long numeroPar=0;
    
    for (long  i = volteado;  i >0; i /=10) {
     digito = volteado%10;
     volteado/=10;
     
     if(digito%2 == 0){
       numeroPar = (numeroPar*10)+ digito;
       totalPar = sumaPar + digito;
       sumaPar = totalPar;
     }
      
    }
    if(numeroPar>0){
      System.out.println("Digitos pares: "+numeroPar);
    }else{
      System.out.println("Digitos pares: ");
    }
    
    System.out.println("Suma de los digitos pares: "+totalPar);
  }
  
}
