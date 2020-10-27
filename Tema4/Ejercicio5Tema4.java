/**
 * 
 * @autor Jesús Gutiérrez
 * */
public class Ejercicio5Tema4{
  public static void main(String[]args){
      System.out.print("Este programa resuelve ecuaciones de primer grado del estilo ax+b=0");
      System.out.print("Introduzca el valor de a: ");
      double a= Double.parseDouble(System.console().readLine());
      System.out.print("Introduzca el valor de b: ");
      double b= Double.parseDouble(System.console().readLine());
      if(a<=0){
        System.out.print("Ecuación no tiene solución real ");
      } else{
      double x;
      x = ((-b)/a);
      System.out.print(""+x); 
      }
        
        
    }  
  
  }
