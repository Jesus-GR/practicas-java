package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio25Tema6 {

  public static void main(String[] args) {
    
    for (int i = 0; i < 100; i++) {
      int contador = 0;
      int numero = (int) (Math.random() * 201) + 10;
      for (int j = 1; j < 200; j++) {
        if (numero % j == 0) {
          contador++;
        }
      }
          if (numero % 5 == 0 ) {
            System.out.print("[" + numero + "], ");
          } else if (contador <= 2) {
            System.out.print("#" + numero + "#, ");
            contador =0;
          } else {
            System.out.print(numero + ", ");
          }
        }
        
      }
    }
