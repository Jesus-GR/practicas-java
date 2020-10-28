/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio15Tema4 {
    public static void main(String[]argas){
      System.out.print("Introdue símbolo: ");
      String c= System.console().readLine();
      System.out.print("Introdue a que lado quires el vértice del la pirámide: ");
      String direccion;
      direccion = System.console().readLine();
      direccion= direccion.toLowerCase();
      switch(direccion){
        case "arriba":
          System.out.printf("\033[31m%10s",c);
          System.out.println();
          System.out.printf("\033[39;49m%8s %3s",c,c);
          System.out.println();
          System.out.printf("%6s %3s %3s",c,c,c);
          System.out.println();
          System.out.printf("%4s %2s %2s %2s %2s",c,c,c,c,c);
          System.out.println();
          System.out.printf("%2s %2s %2s %2s %2s %3s ",c,c,c,c,c,c);
          System.out.println();
          break;
        case"abajo":
          System.out.printf("%2s %2s %2s %2s %2s %3s ",c,c,c,c,c,c);
          System.out.println();
          System.out.printf("%4s %2s %2s %2s %2s",c,c,c,c,c);
          System.out.println();
          System.out.printf("%6s %3s %3s",c,c,c);
          System.out.println();
          System.out.printf("\033[39;49m%8s %3s",c,c);
          System.out.println();
          System.out.printf("\033[31m%10s",c);
          System.out.print("\033[39;49m");
          break;
            
        case "izquierda":
          System.out.printf("%10s",c);
          System.out.println();
          System.out.printf("%10s %3s",c,c);
          System.out.println();
          System.out.printf("%10s %3s %3s",c,c,c);
          System.out.println();
          System.out.printf("%10s %3s %3s \033[31m%2s",c,c,c,c);
          System.out.println();
          System.out.printf("\033[39;49m%10s %3s %3s",c,c,c);
          System.out.println();
          System.out.printf("%10s %3s",c,c);
          System.out.println();
          System.out.printf("%10s",c);
          break;
            
        case "derecha":
          System.out.printf("%10s",c);
          System.out.println();
          System.out.printf("%7s %2s",c,c);
          System.out.println();
          System.out.printf("%4s %2s %2s",c,c,c);
          System.out.println();
          System.out.printf("\033[31m%1s\033[39;49m%3s %2s %2s",c,c,c,c);
          System.out.println();
          System.out.printf("%4s %2s %2s",c,c,c);
          System.out.println();
          System.out.printf("%7s %2s",c,c);
          System.out.println();
          System.out.printf("%10s",c);
          break;
          
          
          
          
          
          
          
          
          
          
        } 
        
    }
  }
