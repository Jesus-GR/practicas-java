public class Ejercicio10Tema5 {
  public static void main(String[] args) {
   
    double numeros;
    numeros = 0;
    double numeroIntroducido=0;
    double suma;
    suma = 0;
    double media;
   
    while(numeroIntroducido >= 0){
      System.out.print("Introduce un numero: ");
      numeroIntroducido=Double.parseDouble(System.console().readLine());
      numeros++;
      suma=suma+numeroIntroducido;
    }
    media = (suma-numeroIntroducido)/(numeros-1);
    System.out.print("La media es: "+media);
    
  }
    
}
