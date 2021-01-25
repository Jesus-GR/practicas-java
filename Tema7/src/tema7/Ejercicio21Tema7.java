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

public class Ejercicio21Tema7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int [] numero = new int [15];
    for (int i = 0; i < 15; i++) {
      numero[i] = (int)(Math.random()*501);
      
    }
    System.out.println("Array original");
    for (int n : numero) {
      System.out.print(n+" ");
    }
    System.out.println("\nArray cincuerizado");
    for (int i = 0; i < 15; i++) {
      if(numero[i]%5==0){
        System.out.print(numero[i]+" ");
      }else{
        while(numero[i]%5!=0){
          numero[i]+=1;
        }
        System.out.print(numero[i]+" ");
      }
    }
    System.out.println("");
  }
  
}
