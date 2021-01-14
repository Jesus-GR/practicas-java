package tema7;

/**
 *
 * @author Jesus Gutierrez
 */
public class Ejercicio10Tema7 {

   public static void main(String[] args) {
    int[] numeroAleatorio = new int[20];
    int[] pares = new int[20];
    int cuentaPares = 0;
    int[] impares = new int[20];
    int cuentaImpares = 0;

    //Generacion numeros aleatorios
    System.out.println("El array normal");
    for (int i = 0; i < 20; i++) {
      numeroAleatorio[i] = (int) (Math.random() * 101);
      System.out.print(numeroAleatorio[i] + " ");
    }
    System.out.println("");
    System.out.println("El array modificado");

    //Filtrado de pares e impares
    for (int i = 0; i < 20; i++) {
      if (numeroAleatorio[i] % 2 == 0) {
        pares[cuentaPares] = numeroAleatorio[i];
        cuentaPares++;
      } else {
        impares[cuentaImpares] = numeroAleatorio[i];
        cuentaImpares++;
      }

    }
    int im =0;
      for (int i = 0; i < 20; i++) {
      if(i<cuentaPares){
        numeroAleatorio[i]= pares[i];
      }else {
        numeroAleatorio[i]=impares[im];
        im++;
      }
    }
      for (int n : numeroAleatorio) {
        System.out.print(n+" ");
    }
  }

}

