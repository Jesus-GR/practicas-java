/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio11Tema4{
  public static void main(String[]args){
    System.out.print("Introduce una hora en formato 24h: ");
    int hora;
    hora = Integer.parseInt(System.console().readLine());
    if(hora>=0 && hora<24){
      System.out.print("Introduce los minutos : ");
      int minutos;
      minutos = Integer.parseInt(System.console().readLine());
      if(minutos>=0 && minutos<60){
        int segundosTotales;
        segundosTotales = (hora*3600)+(minutos*60);
        int segundosQueFaltan=86400-segundosTotales;
        System.out.print("Faltan "+segundosQueFaltan+" para medianoche");
      }else{
        System.out.print("El valor introducido para minutos es incorrecto");
      }
    }else{
      System.out.print("El valor introducido para hora es incorrecto");
    }
    
  }
}
