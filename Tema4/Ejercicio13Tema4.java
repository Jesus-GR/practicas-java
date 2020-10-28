/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio13Tema4 {
    public static void main(String[]argas){
      System.out.print("Introdue el 1º número: ");
      int numero1;
      numero1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introdue el 2º número: ");
      int numero2;
      numero2 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el 3º número: ");
      int numero3;
      numero3= Integer.parseInt(System.console().readLine());
      
      if(numero1==numero2 && numero2==numero3){
        System.out.print("Los tres números son iguales");
        
      } else if(numero1<numero2 && numero2<numero3){
          System.out.print(numero1);
          System.out.print(numero2);
          System.out.print(numero3);
        }
      
        else if(numero2<numero1 && numero1<numero3){
          System.out.print(numero2);
          System.out.print(numero1);
          System.out.print(numero3);
        }
      
        else if (numero3<numero2 && numero2<numero1){
          System.out.print(numero3);
          System.out.print(numero2);
          System.out.print(numero1);
        }
      
        else if(numero1<numero3 && numero3<numero2){
          System.out.print(numero1);
          System.out.print(numero3);
          System.out.print(numero2);  
        }
      
        else if(numero2<numero3 && numero3<numero1){
          System.out.print(numero2);
          System.out.print(numero3);
          System.out.print(numero1);
        }
      
        else if(numero1<numero2 && numero3<numero1){
          System.out.print(numero3);
          System.out.print(numero1);
          System.out.print(numero2);
        }
      
    

    }
  }
