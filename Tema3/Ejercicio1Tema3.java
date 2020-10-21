/**
 *
 *  @autor Jesús Guiérrez
 */
  public class Ejercicio1Tema3{
    public static void main(String[]args){
      String linea;
      System.out.print("Introduce un valor para el primer número: ");
      linea=System.console().readLine();
      int numeroPrimero;
      numeroPrimero = Integer.parseInt(linea);
      System.out.print("Introduce un valor para el segundo número: ");
      linea=System.console().readLine();
      int numeroSegundo;
      numeroSegundo= Integer.parseInt(linea);
      int resultado;
      resultado = (numeroPrimero*numeroSegundo);
      System.out.print("El resultado de la multiplicación es: "+resultado);
      
  
  }
}
