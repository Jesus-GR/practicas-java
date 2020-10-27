/**
 * 
 * @autor Jesús Gutiérrez
 **/
public class Ejercicio2Tema4{
  public static void main(String[]args){
    System.out.print("Introduce una hora por teclado en formato 24h: ");
   int hora;
    hora=Integer.parseInt(System.console().readLine());
    if (hora>=00 && hora <=5){
     System.out.print("Buenas noches");
    } 
    if(hora>=6 && hora<=12){
     System.out.print("Buenos días");
    } 
    if(hora>=13 && hora<=20){
      System.out.print("Buenas tardes");
    } 
    if (hora>=21 && hora<=23){
      System.out.print("Buenas noches");
    }
    if(hora>=24 || hora<0){
      System.out.print("El valor introducido no es correcto");
    }
  }
    
}
