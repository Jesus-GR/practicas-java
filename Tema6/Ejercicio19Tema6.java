package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio19Tema6 {

  public static void main(String[] args) {
    int i = 50;
    int numeroPar = 0;
    int numeroPar2 = 0;
    int maximoPar = 0;
    int numeroImpar = 0;
    int numeroImpar2 = 0;
    int minimoImpar = 0;
    int contadorMedia = 1;
    double suma = 0;
    double media =0;
    while (i > 0) {
      int numeroAleatorio = (int) (Math.random() * 301) - 100;
      System.out.print(numeroAleatorio + " ");
      if (numeroAleatorio % 2 == 0) {
        numeroPar = numeroAleatorio;
        numeroPar2 = maximoPar;
        if (numeroPar2 > numeroPar) {
          maximoPar = numeroPar2;
        } else {
          maximoPar = numeroPar;
        }
      } else {
        numeroImpar = numeroAleatorio;
        numeroImpar2 = minimoImpar;
        if (numeroImpar2 < numeroImpar) {
          minimoImpar = numeroImpar2;
        } else {
          minimoImpar = numeroImpar;
        }
      }
      media = (suma + numeroAleatorio);
      suma =media;

      i--;
      contadorMedia++;
    }
    media = media/contadorMedia;
    System.out.println("");
    System.out.println("El maximo de los pares es: " + maximoPar);
    System.out.println("EL minimo de los impares es: " + minimoImpar);
    System.out.println("La media es: "+media);
  }

}
