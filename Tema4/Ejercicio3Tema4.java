/**
 * 
 * @autor Jesús Gutiérrez
 **/
public class Ejercicio3Tema4{
  public static void main(String[]args){
   System.out.print("Introduce una numero del 1 al 7: ");
    int numero;
    numero=Integer.parseInt(System.console().readLine());
    
    String dia;
    switch (numero){
      case 1:
        dia="lunes";
      break;
      case 2:
        dia="martes";
      break;
      case 3:
        dia="miércoles";
      break;
      case 4:
        dia="jueves";
      break;
      case 5:
        dia="viernes";
      break;
      case 6:
        dia="sabado";
      break;
      case 7:
        dia="domingo";
      break;
      default:
        dia="No existe";
    }
      System.out.print("Es el día "+dia);
  }
}
