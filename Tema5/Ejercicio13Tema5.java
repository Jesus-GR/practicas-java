
public class Ejercicio13Tema5 {

  public static void main(String[] args) {
    
    
    int i;
    i = 1;
    int contadorPositivo;
    contadorPositivo=0;
    int contadorNegativo;
    contadorNegativo = 0;
    int numero;
      do{
      
      System.out.print("Introduce un numero por teclado: ");
      numero = Integer.parseInt(System.console().readLine());
      
        if(numero>=0){
          contadorPositivo++;
        }else if(numero<0){
          contadorNegativo++;
        }
        
       i++;
      }while(i<=10);
      
    System.out.print("Hay: "+contadorPositivo+" numeros positivos y "+contadorNegativo+" numeros negativos");
  }
}
