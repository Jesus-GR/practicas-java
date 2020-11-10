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
public class Ejercicio13Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int i;
    i = 0;
    int contadorPositivo;
    contadorPositivo=0;
    int contadorNegativo;
    contadorNegativo = 0;
    int numero;
      do{
      
      System.out.print("Introduce un numero por teclado: ");
      numero = Integer.parseInt(s.nextLine());
      
        if(numero>=0){
          contadorPositivo++;
        }else if(numero<0){
          contadorNegativo++;
        }
        
       i++;
      }while(i<=10);
      
    System.out.print("Hay: "+contadorPositivo+" numeros positivos y "+contadorNegativo+" numeros negativos");
  }
     
}  

