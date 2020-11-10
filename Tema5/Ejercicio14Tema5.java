
public class Ejercicio14Tema5 {

  public static void main(String[] args) {
    System.out.print("Introduce una base: ");
    double base;
    base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un exponente: ");
    int exponente;
    exponente = Integer.parseInt(System.console().readLine());
    double i;
    double potencia;
    potencia = 0;
    
    for(i=0;i<=exponente;i++){
      potencia = Math.pow((int)base,(int)i);
      
    }  
      System.out.println((int)potencia);
  }
}
