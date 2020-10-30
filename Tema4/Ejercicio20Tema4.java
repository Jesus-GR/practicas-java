/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio20Tema4 {
    public static void main(String[]args){
      System.out.print("Introduce un número entero: ");
      int numero;
      numero= Integer.parseInt(System.console().readLine());
      
      if(numero>=0 && numero<10 || numero>99999){
        System.out.print("EL valor introducido no es correcto");
      }else{
        if(numero>=10 && numero<100 && numero/10==numero%10){
          System.out.print("Es capicua");
        }else if(numero>=100 && numero<1000 && numero/100==numero%100){
          System.out.print("Es capicua");
        }else if(numero>=1000 && numero<10000 && numero/1000==numero%1000){
          System.out.print("Es capicua");
        }else if(numero>=10000 && numero<100000 && numero/10000==numero%1000){
          System.out.print("Es capicua");
        }else{
          System.out.print("No es capicua");
        }
      } 
        
    }
  }
