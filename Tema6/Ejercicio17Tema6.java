package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio17Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce una altura mayor o igual a 4: ");
    int alto = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el ancho mayor o igual a 4: ");
    int ancho = Integer.parseInt(s.nextLine());
    int contadorAltura=1;
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println("");
    int alturapez = (int) (Math.random() * (alto - 2) + 1);
    for (int i = 0; i < alto - 2; i++) {
       for (int j = 0; j < 1; j++) {
        System.out.print("*");
      }
       if(contadorAltura==alturapez){
         int pez = (int)(Math.random()*(ancho-2));
         for (int j = 0; j < pez; j++) {
           System.out.print(" ");
           
         }
         System.out.print("🐵");
         for (int j = 0; j < (ancho-4)-pez; j++) {
           System.out.print(" ");
         }
       }else{
         for (int j = 0; j <ancho-2; j++) {
           System.out.print(" ");
         }
       }
     
       
        for (int j = 0; j < 1; j++) {
          System.out.println("*");
        }
        contadorAltura++;
      }
      for (int i = 0; i < ancho; i++) {

        System.out.print("*");
      }

      System.out.println("");
    }

  }
