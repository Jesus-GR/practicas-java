/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio14Tema4 {
    public static void main(String[]argas){
      System.out.print("Introdue un numero: ");
      int numero;
      numero = Integer.parseInt(System.console().readLine());
      if(numero%2==0 && numero%5==0){
        System.out.print("Es un número par y divisible entre 5");
      }else if (numero%2==0){
        System.out.print("Es un número par");
      }else if(numero%5==0){
        System.out.print("Es un numero divisible entre 5");
      }else{
        System.out.print("No es ni divisible entre 5 ni par");
      }
    }
  }
