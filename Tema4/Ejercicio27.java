package tema4;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio27 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double precioTarta = 0;
    boolean  esCorrecto = false;
    String sabor = "";
    do{
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
     sabor = s.nextLine();
    switch (sabor) {
      case "manzana":
        precioTarta = 18;
        esCorrecto = true;
        break;
      case "fresa":
        precioTarta = 16;
        esCorrecto = true;
        break;
      case "chocolate":
        System.out.println("Que tipo de chocolate quiere, blanco o negro: ");
        esCorrecto = true;
        break;
      default:
        System.out.println("No disponemos de ese sabor, lo siento.");
        System.out.println("Vuelva a intentarlo");
        esCorrecto = false;
    }
    }while(!esCorrecto);
    String tipoChocolate = "";
    if (sabor.equals("chocolate")) {
      tipoChocolate = s.nextLine();
    }
    switch (tipoChocolate) {
      case "blanco":
        precioTarta = 15;
        break;
      case "negro":
        precioTarta = 14;
        break;
      default:
    }
    System.out.print("Quiere ponerle un nombre?(si o no): ");
    String nombre = s.nextLine();
    double precioNombre = 0;
    if (nombre.equals("si")) {
      precioNombre = 2.75;
    }
    System.out.print("Quiere nata?(si o no): ");
    String nata = s.nextLine();
    double precioNata = 0;
    if (nata.equals("si")) {
      precioNata = 2.50;
    }
    if (sabor.equals("chocolate")) {
      System.out.print("Tarta de " + sabor + " " + tipoChocolate + ": ");
      System.out.printf("%4.2f", precioTarta);
      System.out.println("");
    } else {
      System.out.print("Tarta de " + sabor + ": ");
      System.out.printf("           %4.2f", precioTarta);
      System.out.println("");
    }
    if (nombre.equals("si")) {
      System.out.printf("Con nombre:                 %4.2f ", precioNombre);
      System.out.println("");
    }

    if (nata.equals("si")) {
      System.out.printf("Con nata:                   %4.2f", precioNata);
      System.out.println("");
    }
    double total = precioTarta + precioNata + precioNombre;
    System.out.printf("Total:                     %4.2f ", total);
    System.out.println("");
  }

}
