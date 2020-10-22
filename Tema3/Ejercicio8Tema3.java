/**
 * 
 * @autor Jesús Gutiérrez
 */
 
 public class Ejercicio8Tema3{
  public static void main(String[]args){
    System.out.print("Introdue las horas trabajadas: ");
    String linea;
    linea=System.console().readLine();
    float horas;
    horas= Float.parseFloat(linea);
    float salario;
    salario=horas*12;
    System.out.print("El salario semanal es de: "+salario+"euros");
 
  }
}

