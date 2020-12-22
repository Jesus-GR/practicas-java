
package tema4;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;
public class Ejercicio25 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     System.out.print("Introduzca la altura de la bandera en cm: ");
     double altura = Integer.parseInt(s.nextLine());
     System.out.print("Ahora introduzca la anchura: ");
     double anchura = Integer.parseInt(s.nextLine());
     System.out.print("Quiere escudo bordado? (s/n): ");
     String bordado = s.nextLine();
     double precioBordado = 0;
     double gastosEnvio = 3.25;
     
     double precioBandera = (altura*anchura)/100;
     System.out.println("Gracias. Aqui tienes el desglose de su compra.");
     System.out.print("Bandera de: "+(int)(altura*anchura)+" cm2: ");
     System.out.printf("  %4.2f",precioBandera);
     System.out.print("$");
     System.out.println("");
     if(bordado.equals ("s")){
       precioBordado = 2.50;
       System.out.printf("Con escudo:            %4.2f",precioBordado);
       System.out.print("$");
        System.out.println("");
     }else{
       precioBordado =0;
       System.out.printf("Sin escudo:            %4.2f",precioBordado);
       System.out.print("$");
        System.out.println("");
     }
     System.out.printf("Gastos de envio:       %4.2f",gastosEnvio);
     System.out.print("$");
      System.out.println("");
     double total = precioBandera+precioBordado+gastosEnvio;
     System.out.printf("Total:                 %4.2f",total);
     System.out.print("$");
      System.out.println("");
     
  }
  
}
