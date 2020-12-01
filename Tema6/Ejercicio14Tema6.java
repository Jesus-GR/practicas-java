package tema6;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio14Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int pruebaNumero = 0;
    int numeroAleatorio =0;
    System.out.print("Introduce un número: ");
    
    int i = 0;
    int intento = 5;
    do{
     numeroAleatorio = Integer.parseInt(s.nextLine());
      pruebaNumero = (int) (Math.random()*101);
      if (pruebaNumero != numeroAleatorio) {
       
          System.out.print(pruebaNumero);
          System.out.println("¿El número que tengo que adivinar es mayor,o menor?: ");
          String pista = s.nextLine();
          if ("mayor".equals(pista)) {
            numeroAleatorio = (int) Math.random() * (numeroAleatorio - 101) + numeroAleatorio;
          } else if ("menor".equals(pista)) {
            numeroAleatorio = (int) Math.random() * (numeroAleatorio - 101);
          }
          intento--;
        } else {
        System.out.print("He acertado. Soy una inteligencia superior");
      } 
       
      }while (pruebaNumero != numeroAleatorio || intento > 0);
    }
  }


