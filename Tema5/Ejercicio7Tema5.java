/**
 * 
 */
public class Ejercicio7Tema5{
  public static void main(String[]args){

   int i;
   i = 3;
   
      do{
     
          System.out.print("Introduce el primer número: ");
          int numeroPrimero = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el segundo número: ");
          int numeroSegundo = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el tercer número: ");
          int numeroTercero = Integer.parseInt(System.console().readLine());
          if(numeroPrimero==33 && numeroSegundo==54 && numeroTercero==65){
            i=-1;
            System.out.print("Has introducido la clave correcta.");
          }else{
            if(1>-1){
              System.out.println("Lo siento. NO es correcto. Vuelve a intentarlo");
              System.out.println("Te quedan "+i+" intentos");
            }
          
          }
        
        i--;
      } while (i>-1);
      if(i==-1){
        System.out.println("Lo siento. No te quedan intentos.");
      }
  
  
  
  
  }

}
 
