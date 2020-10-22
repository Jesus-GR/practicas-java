/**
 * 
 * @autor Jesús Gutiérrez
 */
 
 public class Ejercicio12Tema3{
  public static void main(String[]args){
    System.out.print("Introduce la nota del 1ºer examen: ");
    String linea;
    linea=System.console().readLine();
    float primerExamen;
    primerExamen=Float.parseFloat(linea);
    System.out.print("¿Qué nota quiere sacar en el trimestre?: ");
    float notaDeseada;
    notaDeseada=Float.parseFloat(System.console().readLine());
    float segundoExamen;
    segundoExamen=(100*notaDeseada-40*primerExamen)/60;
    System.out.print("Para tener un "+notaDeseada+" en el trimestre tienes que sacar un "+segundoExamen+" en el segundo examen");
  }
}

