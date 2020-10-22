/**
 * 
 * @autor Jesús Gutiérrez
 * */
public class Ejercicio6Tema3{
  public static void main(String[]args){
   System.out.print("Introduce la base del trángulo: ");
   double base;
   base= Double.parseDouble(System.console().readLine());
   System.out.print("Introduce la altura del triángulo: ");
   double altura;
   altura= Double.parseDouble(System.console().readLine());
   double area;
   area=(base*altura)/2;
   System.out.print("EL valor del área es: "+area);
  }
  
}
