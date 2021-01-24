/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio20Tema7 {

  /**
   * @param args the command line arguments
   */
 
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);
   
    System.out.print("Introduzca el numero total de nombres de reyes: ");
    int numeroReyes = Integer.parseInt(s.nextLine());
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO");
    String [] nombreReyes = new String [numeroReyes];
    for (int i = 0; i < numeroReyes; i++) {
      nombreReyes[i] = s.nextLine();
    }
    System.out.println("Los reyes introdocidos son: ");
    for (String nR : nombreReyes) {
      System.out.println(nR);
    }
    
    
    for (int i = 0; i < numeroReyes; i++) {
      int orden  = 1;
      for (int j = 0; j < i; j++) {
        if(nombreReyes[i].equals (nombreReyes[j])){
          orden++;
        }
      }
      System.out.println(nombreReyes[i]+" "+orden+"º ");
    }
  }
  
}
