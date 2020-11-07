/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;
public class Ejercicio10Tema5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double numeros;
    numeros = 0;
    double numeroIntroducido;
    numeroIntroducido = 0;
    double suma;
    suma = 0;
    double media;
   
    while(numeroIntroducido >= 01){
      System.out.print("Introduce un número: ");
      Double.parseDouble(s.nextLine());
      numeros++;
      suma=suma+numeroIntroducido;
    }
    media = (suma-numeroIntroducido)/numeros;
    System.out.print("La media es: "+media);
    
  }
    
}
  

