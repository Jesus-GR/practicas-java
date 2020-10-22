/**
 * 
 * @autor Jesús Gutiérrez
 */
 
 public class Ejercicio7Tema3{
  public static void main(String[]args){
    System.out.print("Introduce el valor de la factura: ");
    float valorFactura;
    valorFactura= Float.parseFloat(System.console().readLine());
    float totalBaseImponible;
    totalBaseImponible= valorFactura/(float)(1.21);
    System.out.print("El total de la factura a partir de la base imponible es: "+totalBaseImponible+" euros");
  }
}

