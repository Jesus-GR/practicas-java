package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio18Tema6 {

  public static void main(String[] args) {
    int colorNoRepetido1 = 0;
    int colorNoRepetido2 =0;
    int contadorColor = 0;
    for (int i = 0; i < 10; i++) {

      while (contadorColor < 3) {
        int colorAleatorio = (int) (Math.random() * 6) + 1;
        if (colorAleatorio != colorNoRepetido1 && colorAleatorio!=colorNoRepetido2) {
          switch (colorAleatorio) {
            case 1:
              System.out.print("\033[31m Rojo \033[39;49m, ");
              break;
            case 2:
              System.out.print("\033[36m Azul \033[39;49m, ");
              break;
            case 3:
              System.out.print("\033[32m Verde \033[39;49m, ");
              break;
            case 4:
              System.out.print("\033[37m Amarillo \033[39;49m, ");
              break;
            case 5:
              System.out.print("\033[35m Violeta \033[39;49m, ");
              break;
            case 6:
              System.out.print("\033[33m Naranja \033[39;49m, ");
              break;
            default:
          }
          colorNoRepetido1 = colorAleatorio;
          colorNoRepetido2 =colorNoRepetido1;
          contadorColor++;
        }
      }
      System.out.println("");
      contadorColor =0;

    }

  }
}
