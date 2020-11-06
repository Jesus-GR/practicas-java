/**
 *
 * @author Jesús Gutiérrez
 * 
 */
 public class Ejercicio9Tema5{
    public static void main(String[]args){
    
      System.out.print("Introduce un número: ");
      
      long numero;
      numero = Integer.parseInt(System.console().readLine());
      
      long i;
      long contador;
      contador = 0;
      for(i=numero; i>=1;i=i/10){
        contador=contador+1;
        
        
      }
        System.out.println("El numero "+numero+" tiene "+contador+" dígitos");
        
    
    
    
    
    
    
    
    
    }
  }
