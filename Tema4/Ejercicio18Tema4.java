/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio18Tema4 {
    public static void main(String[]args){
      System.out.print("Introduce un número entero por teclado: ");
      int numero = Integer.parseInt(System.console().readLine());
      int primera=0;
      
      if(numero<0 || numero>=100000){
        System.out.print("El valor introducido no es correcto:");
      } else{
          if(numero<10){
            primera=numero;
          }else if(numero >=10 && numero<100){
            primera=numero/10;
          }else if(numero>=100 && numero<1000){
            primera=numero/100;
          } else if(numero>=1000 && numero<10000){
            primera=numero/1000;
          }else if(numero>=10000 && numero<100000){
            primera=numero/10000;
          }
          
          System.out.print(primera);
        }
        
        
      
  
        
        
    }
  }
