/**
 *  Convensor de euros  a pesetas
 *  @autor Jesús Guiérrez
 */
  public class Ejercicio2Tema3{
    public static void main(String[]args){
     System.out.print("Introduce la cantidad de euros a convertir: ");
     String linea;
     linea = System.console().readLine();
     double cantidadEuros;
     cantidadEuros=Double.parseDouble(linea);
     int pesetas;
     pesetas = (int)(cantidadEuros*166.386);
     System.out.print("Son: "+pesetas+"pesetas");
    
      
  
  }
}
