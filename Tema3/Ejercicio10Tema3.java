/**
 * 
 * @autor Jesús Gutiérrez
 */
 
 public class Ejercicio10Tema3{
  public static void main(String[]args){
    System.out.print("Inserte la cantidad de Mb que quiere convertir: ");
    String linea;
    linea= System.console().readLine();
    int Mb;
    Mb=Integer.parseInt(linea);
    int Kb;
    Kb=Mb*1000;
    System.out.print("Son: "+Kb+" Kilobytes");
  }
}

