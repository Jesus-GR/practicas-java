/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio21Tema4 {
    public static void main(String[]args){
     System.out.print("Introduce la nota del primer control: ");
     int nota1;
     nota1=Integer.parseInt(System.console().readLine());
     System.out.print("Introduce la nota del segundo control: ");
     int nota2;
     nota2=Integer.parseInt(System.console().readLine());
     float media;
     media=((float)nota1+(float)nota2)/2;
     if(media>=5){
       System.out.print("Tu nota de programación es: "+media);
      }else{
        System.out.print("¿Cuál ha sido el resultado de la recuperación?: ");
        } 
        
        String recuperacion;
        recuperacion=System.console().readLine();
        
        if(recuperacion.equals("apto")){
          System.out.print("Tu nota de programación es un 5");
        } else if(recuperacion.equals("no apto")){
          System.out.print(media);
        } else{
          System.out.print("El valor introducido no es correcto");
        }
        
        
    }
  }
