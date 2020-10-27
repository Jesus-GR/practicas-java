/**
 * 
 * @author Jesús Gutiérrez
 */
public class Ejercicio7Tema4{
  public static void main (String[]args){
      System.out.println("Este es un programa que calcula la media de 3 notas");
      System.out.print("Introduce el valor de la 1ºa nota: ");
      double nota1;
      nota1 = Double.parseDouble(System.console().readLine());
      System.out.print("Introduce el valor de la 2a nota: ");
      double nota2;
      nota2 = Double.parseDouble(System.console().readLine());
      System.out.print("Introduce el valor de la 3ºa nota: ");
      double nota3;
      nota3 = Double.parseDouble(System.console().readLine());
      
      double media;
      media = (nota1+nota2+nota3)/3;
      System.out.print("La media de las 3 notas es: "+media);
  }  
}
 
