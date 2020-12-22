package tema4;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio26 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ventas de entrada CineCampa");
    System.out.print("Introduce el numero de entradas: ");
    int cantidadEntrada = Integer.parseInt(s.nextLine());
    System.out.print("Introduce dia de la semana: ");
    String dia = (s.nextLine());
    System.out.print("Tiene tarjeta cinecampa?: ");
    String tarjeta = s.nextLine();
    double descuento = 0;
    double precioEntrada = 8;
    double precioEntradaPareja = 11;
    double total = 0;

    System.out.println("Aqui tienes sus entradas. Gracias por su compra.");
    System.out.println("------------------------------------------------");
    if (dia.equals("miercoles")) {
      precioEntrada = 5;
      total = cantidadEntrada * precioEntrada;
      System.out.println("Entradas individuales:              " + cantidadEntrada);
      System.out.printf("Precio por entrada individual:      %4.2f ", precioEntrada);
      System.out.println("");
      System.out.printf("Total:                             %4.2f", total);
      System.out.println("");
    } else if (dia.equals("jueves")) {
      if (cantidadEntrada % 2 == 0) {
        System.out.printf("Entradas de parejas:      %d", cantidadEntrada / 2);
        System.out.println("");
        System.out.printf("Precio por entrada de pareja:      %4.2f", precioEntradaPareja);
        System.out.println("");
        total = (cantidadEntrada / 2) * precioEntradaPareja;
        System.out.printf("Total:                             %4.2f", total);
        System.out.println("");
      } else {
        System.out.printf("Entrada de parejas:                 %d", cantidadEntrada / 2);
        System.out.println("");
        System.out.printf("Precio por entrada de pareja:      %4.2f", precioEntradaPareja);
        System.out.println("");
        System.out.println("Entradas individuales:              " + 1);
        System.out.println("");
        System.out.printf("Precio por entrada individual:      %4.2f",precioEntrada);
        System.out.println("");
        total = ((cantidadEntrada / 2) * precioEntradaPareja) + precioEntrada;
        System.out.printf("Total:                             %4.2f", total);
        System.out.println("");
      }

   
    } else {

      System.out.println("Entradas individuales: " + cantidadEntrada);

      System.out.printf("Precio por entrada individual:      %4.2f", precioEntrada);
      System.out.println("");
      total = cantidadEntrada * precioEntrada;
      System.out.printf("Total:                              %4.2f", total);
      System.out.println("");
    }

    System.out.printf("");
    if (tarjeta.equals("s")) {
      descuento = total * 0.10;
    } else {
      descuento = 0;
    }
    System.out.printf("Descuento:                          %4.2f",descuento);
    System.out.println("");
    double aPagar = total - descuento;
    System.out.printf("A pagar:                           %4.2f", aPagar);
    System.out.println("");
  }

}
