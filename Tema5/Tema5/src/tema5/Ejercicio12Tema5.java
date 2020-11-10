/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;
public class Ejercicio12Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número por teclado: ");
    int numero;
    numero = Integer.parseInt(s.nextLine());
    
    switch (numero){
      case 1:
        System.out.print("0");
      break;
      case 2:
        System.out.print("0,1");
       break;
      default:
        System.out.print("0\n 1");
        int f1;
        f1=0;
        int f2;
        f2=1;
        int aux;
        while(numero>2){
          aux = f1;
          f1 = f2;
          f2 = aux + f2;
          System.out.println(f2);
          numero--;
        }
        
      
    }
   
  
  }
  
}
