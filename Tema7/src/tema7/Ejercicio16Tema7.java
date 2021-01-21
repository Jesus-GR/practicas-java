/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;
public class Ejercicio16Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);
    
    int [] numeros = new int [20];
    for (int i = 0; i < 20; i++) {
      numeros[i] = (int)(Math.random()*401);
      
    }
    for(int n : numeros){
      System.out.print(n+" ");
    }
    System.out.println("");
    System.out.print("Que numeros quieres resaltar? (1-los multiplos de 5 o 2-multiplos de 7): ");
    int eleccion = Integer.parseInt(s.nextLine());
    if( eleccion == 1){
      for (int i = 0; i < 20 ; i++) {
        if(numeros[i]%5==0){
          System.out.print("["+numeros[i]+"] ");
        }else{
          System.out.print(numeros[i]+" ");
        }
      }
    }else if (eleccion==2){
      for (int i = 0; i < 20; i++) {
        if(numeros[i]%7==0){
          System.out.print("["+numeros[i]+"] ");
        }else{
          System.out.print(numeros[i]+" ");
        }
      }
    }
  }
  
}
