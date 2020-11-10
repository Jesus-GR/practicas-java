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

    System.out.print("Introduzca cuantos terminos quiere mostrar: ");
    int numero;
    numero = Integer.parseInt(s.nextLine());
    int numeroPrimero = 0;
    int numeroSegundo = 1;
    int siguienteNumero = 1;
    int i;
    if (numero < 0) {
      System.out.print("El número introducido no es correcto");
    } else if (numero == 1) {
      System.out.print("0");
    } else if (numero == 2) {
      System.out.print("0  1  ");
    } else {
      System.out.print("0  1");
      for (i = 3; i <= numero; i++) {
        numeroPrimero = numeroSegundo;
        numeroSegundo = siguienteNumero;
        siguienteNumero = numeroPrimero + numeroSegundo;
        System.out.print("  "+siguienteNumero+"  ");
      }
    }

  }

}
