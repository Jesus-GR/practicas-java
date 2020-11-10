
/**
 * 
 */
public class Ejercicio7Tema5{
  public static void main(String[]args){

   int intentos;
   intentos = 3;
   boolean esCorrecto;
   esCorrecto = false;
   
      do {
     
          System.out.print("Introduce el primer número: ");
          int numeroPrimero = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el segundo número: ");
          int numeroSegundo = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el tercer número: ");
          int numeroTercero = Integer.parseInt(System.console().readLine());
          if(numeroPrimero==33 && numeroSegundo==54 && numeroTercero==65){
            esCorrecto = true;
            System.out.print("Has introducido la clave correcta.");
          } else {
            if(intentos>-1){
              System.out.println("Lo siento. NO es correcto. Vuelve a intentarlo");
              System.out.println("Te quedan "+intentos+" intentos");
            }
          
          }
        
        intentos--;
      } while (intentos>=0 && !esCorrecto);
      if(intentos==0){
        System.out.println("Lo siento. No te quedan intentos.");
      }
  
  
  
  
  }

}
 
