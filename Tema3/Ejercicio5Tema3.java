/**
 * 
 * @autor Jesús Gutiérrez
 * */
public class Ejercicio5Tema3{
  public static void main(String[]args){
   System.out.print("Introduce la base del rectángulo: ");
   double base;
   base= Double.parseDouble(System.console().readLine());
   System.out.print("Introduce la altura del rectángulo: ");
   double altura;
   altura= Double.parseDouble(System.console().readLine());
   double area;
   area=base*altura;
   System.out.print("EL valor del área es: "+area);
  }
  
}
