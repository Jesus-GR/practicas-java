/**
 *  Convensor de pesetas  a euros
 *  @autor Jesús Guiérrez
 */
  public class Ejercicio4Tema3{
    public static void main(String[]args){
    System.out.print("Introduce un número: ");
    double numeroPrimero;
    numeroPrimero= Double.parseDouble(System.console().readLine());
    System.out.print("Introdue otro número: ");
    double numeroSegundo;
    numeroSegundo= Double.parseDouble(System.console().readLine());
    double suma;
    suma=numeroPrimero+numeroSegundo;
    System.out.print("EL resultado de la suma es: "+suma+"\n");
    double resta;
    resta = numeroPrimero-numeroSegundo;
    System.out.print("El resultado de la resta es: "+resta+"\n");
    double multiplicacion;
    multiplicacion= numeroPrimero*numeroSegundo;
    System.out.print("El resultado de la multiplicacion es: "+multiplicacion+"\n");
    double division;
    division = numeroPrimero/numeroSegundo;
    System.out.print("El resultado de la division es:  "+division+"\n");
    
      
  
  }
}
