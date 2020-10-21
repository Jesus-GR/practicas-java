/**
 *  Convensor de pesetas  a euros
 *  @autor Jesús Guiérrez
 */
  public class Ejercicio3Tema3{
    public static void main(String[]args){
      System.out.print("Introduce la cantidad de pesetas que quieres convertir: ");
      String linea;
      int cantidadPesetas;
      cantidadPesetas= Integer.parseInt(System.console().readLine());
      double euros;
      euros = (double)(cantidadPesetas*0.006);
      System.out.print("Son: "+euros+"euros");
    
      
  
  }
}
