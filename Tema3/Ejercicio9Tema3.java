/**
 * 
 * @autor Jesús Gutiérrez
 */
 
 public class Ejercicio9Tema3{
  public static void main(String[]args){
    System.out.print("Introdue el radio 'r': ");
    double radio;
    radio=Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la altura 'h': ");
    double altura;
    altura=Double.parseDouble(System.console().readLine());
    double volumen;
    double cuadrado;
    cuadrado=Math.pow(radio,2);
    volumen=1.0/3*Math.PI*cuadrado*altura;
    System.out.print("El volumen es = "+volumen);
 
  }
}

