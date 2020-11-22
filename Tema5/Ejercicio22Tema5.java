package tema5;

/**
 *
 * @author Jesús Gutiérrez
 */
public class Ejercicio22Tema5 {

  public static void main(String[] args) {
    int numeroPrimo = 0;
    int contador = 0;
    int numero = 0;
    for (int i = 2; i <= 100; i++) {
      for (int j = 1; j <= 100; j++) {
        numero = i;
        numeroPrimo = numero % j;
        if (numeroPrimo == 0) {
          contador++;
        }
      }
      
      if (contador <= 2) {
        System.out.print(numero+",");
      }
        contador =0;
      }
    }
  }
