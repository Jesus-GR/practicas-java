package tema7;

import java.util.Scanner;

public class EjemploExamen {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la cantidad de examenes: ");
    int numeroExamenes = Integer.parseInt(s.nextLine());

    double[] notas = new double[numeroExamenes];
    int i = 0;
    double suma = 0;
    do {
      System.out.print("Introduce la nota del examen " + (i + 1) + ": ");
      notas[i] = Double.parseDouble(s.nextLine());
      suma = suma + notas[i];
      i++;
    } while (i < numeroExamenes);
    System.out.print("Tus notas son: ");
    for (double nota : notas) {
      System.out.print(nota+" ");
    }
    System.out.println("");
    double media = suma / numeroExamenes;
    System.out.println("La media es : "+media);

  }
}
