
package tema4;

/**
 *
 * @author Jesus GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio29 {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    double precioComida = 0;
    String tipoPitufo = "";
    System.out.print("Que ha tomado de comer?(palmera,donut o pitufo):  ");
    String comida = s.nextLine();
    switch(comida){
      case "palmera":
        precioComida = 1.40;
        break;
      case "donut":
        precioComida = 1;
        break;
      default:
    }
    if(comida .equals("pitufo")){
      System.out.print("Con que se ha tomado el pitufo? (aceite o tortilla): ");
      tipoPitufo = s.nextLine();
    }
    if(tipoPitufo .equals ("aceite")){
      precioComida = 1.20;
    } else if(tipoPitufo .equals ("tortilla")){
      precioComida = 1.60;
    }
    System.out.print("Que ha tomado de beber? (zumo o cafe): ");
    String bebida = s.nextLine();
    double precioBebida = 0;
    switch(bebida){
      case "zumo":
        precioBebida = 1.50;
        break;
      case "cafe":
        precioBebida = 1.20;
    }
    if(comida .equals("pitufo")){
      System.out.print(comida+"con"+tipoPitufo+":");
      System.out.printf(" %4.2f",precioComida);
      System.out.println("");
    }else{
      System.out.print(comida);
    System.out.printf(": %4.2f",precioComida);
      System.out.println("");
    }
    double total = precioBebida+precioComida;
    System.out.print(bebida);
    System.out.printf(": %4.2f",precioBebida);
    System.out.println("");
    System.out.print("Total desayuno: ");
    System.out.printf(": %4.2f",total);
    System.out.println("");
  }
  
}
