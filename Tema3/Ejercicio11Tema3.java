/**
 * 
 * @autor Jesús Gutiérrez
 */
 
 public class Ejercicio11Tema3{
  public static void main(String[]args){
    System.out.print("Inserte la cantidad de Kb que quiere convertir: ");
    String linea;
    linea= System.console().readLine();
    int Kb;
    Kb=Integer.parseInt(linea);
    float Mb;
    Mb=(float)Kb/1000;
    System.out.print("Son: "+Mb+" Megabytes");
  }
}

