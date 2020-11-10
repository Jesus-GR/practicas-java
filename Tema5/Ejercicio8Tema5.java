/**
 *
 * @author Jesús Gutiérrez
 * 
 */
 public class Ejercicio8Tema5{
    public static void main(String[]args){
    
      System.out.print("Introduce un número: ");
      int numero;
      numero = Integer.parseInt(System.console().readLine());
      
      int multiplicacion;
      int i;
      System.out.println("Tabla de multiplicar del "+numero);
      for(i=0;i<=10;i++){
        multiplicacion=numero*i;
        System.out.printf("%2d x %2d = %3d",numero,i,multiplicacion);
        System.out.println();
      }
        
    
    
    
    
    
    
    
    
    }
  }
