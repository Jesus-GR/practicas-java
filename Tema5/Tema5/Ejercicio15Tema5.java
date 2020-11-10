package tema5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio15Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número por teclado para la base: ");
    double base;
    base = Double.parseDouble(s.nextLine());
    System.out.print("Introduce un número entero positivo para el exponente: ");
    int exponente;
    exponente = Integer.parseInt(s.nextLine());
    if(exponente<0){
      System.out.print("No es un número positivo");
    } else {
      int i;
      for(i=1;i<=exponente;i++){
        double potencia;
        potencia = Math.pow(base,(double)i);
        System.out.printf("%d ^ %d = %d",(int)base,i,(int)potencia);
        System.out.println();
      }
    }
    
    
  }
  
}
