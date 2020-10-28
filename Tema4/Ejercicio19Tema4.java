/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio19Tema4 {
    public static void main(String[]args){
      System.out.print("Introduce un número entero por teclado: ");
      int numero;
      numero = Integer.parseInt(System.console().readLine());
      
      if(numero<=-100000 || numero >=100000){
        System.out.print("El valor introducido no es correcto");
      }else{
      
        if(numero<0 && numero>-10){
          System.out.print("1");
        } else if(numero<=-10 && numero>-100){
          System.out.print("2");
        }else if(numero<=-100 && numero>-1000){
          System.out.print("3");
        }else if(numero<=-1000 && numero >-10000){
          System.out.print("4");
        }else if(numero<=-10000 && numero >-100000){
          System.out.print("5");
        }else if(numero>=0 && numero<10){
          System.out.print("1");
        }else if(numero>=10 && numero<100){
          System.out.print("2");
        }else if(numero>=100 && numero<1000){
          System.out.print("3");
        }else if(numero>=1000 && numero <10000){
          System.out.print("4");
        }else if(numero>=10000 && numero<100000){
          System.out.print("5");
        }
          
          
        
        
        
        
      
  
        
        
      }
 
  }
}
