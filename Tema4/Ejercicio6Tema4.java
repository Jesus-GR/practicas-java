/**
 * 
 * @author Jesús Gutiérrez
 */
public class Ejercicio6Tema4{
  public static void main (String[]args){
      System.out.println("Este es un programa que calcula el tiempo que tarda");
      System.out.println("en caer un objeto desde una determinada altura");
      System.out.print("Introduce un valor para la altura: ");
      double altura;
      altura = Double.parseDouble(System.console().readLine());
      double g;
      g= 9.81;
      
      if(altura<0){
        System.out.print("El valor introducido no es correcto");
      }else{
        double tiempo;
        tiempo = Math.sqrt(2*altura/g);
        System.out.print("El tiempo que tarda en caer un objeto es de "+tiempo+" m/s^2");
      }
  }  
}
 
