2/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;
public class Ejercicio11Tema5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número por teclado: ");
    double numero;
    numero = Double.parseDouble(s.nextLine());
    int i;
    for(i=1;i<=5;i++){
    double cuadrado;
    cuadrado = (numero*numero);
    double cubo;
    cubo = (numero*numero*numero);
    
    System.out.printf("%3.2f\t %3.2f\t %3.2f\t",numero,cuadrado,cubo);
    System.out.println();
    numero++;
   }
  }
  
}
