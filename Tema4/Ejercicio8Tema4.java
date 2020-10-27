/**
 * 
 * @author Jesús Gutiérrez
 */
public class Ejercicio8Tema4{
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
      if(media<0 || media>10){
        System.out.print("La nota obtenida no es válida");
      }else{
        System.out.println("La media de las 3 notas es: "+media);
      
        if(media<5){
          System.out.print("La nota es insuficiente");
        }
        if(media>=5 && media <6){
          System.out.print("La nota es suficiente");
        }
        if(media>=6 && media <7){
          System.out.print("La nota es notable");
        }
        if(media>=7 && media<9){
          System.out.print("La nota es notable");
        }
        if(media >=9 && media == 10){
          System.out.println("La nota es Sobresaliente");
        }
      }
      
    
  }   
    
}
 
