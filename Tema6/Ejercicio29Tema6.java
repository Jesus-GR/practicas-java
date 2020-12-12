package tema6;

/**
 *
 * @author Jesus Gutierrez
 */
import java.util.Scanner;

public class Ejercicio29Tema6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otono");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estaci'on del ano(1-4): ");
    int estacion = Integer.parseInt(s.nextLine());
    switch (estacion) {
      case 1:
        int temperatura1 = (int) (Math.random() * (30-15) + 15);
        int temperatura2 = (int) (Math.random() * (30-15) + 15);
        int temperaturaMaxima = 0;
        int temperaturaMinima = 0;
        if (temperatura1 > temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else if (temperatura1 == temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else {
          temperaturaMaxima = temperatura2;
          temperaturaMinima = temperatura1;
        }
        int probabilidad = (int) (Math.random() * 10) + 1;

        System.out.println("Prevision del tiempo para manana");
        System.out.println("--------------------------------");
        System.out.println("Temperatura minima: " + temperaturaMinima);
        System.out.println("Temperatura maxima: " + temperaturaMaxima);
        switch (probabilidad) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
            System.out.println("Soleado");
            break;
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Nublado");
          default:

        }
        break;
      case 2:
        temperatura1 = (int) (Math.random() * (45 - 25) + 25);
        temperatura2 = (int) (Math.random() * (45 - 25) + 25);
        temperaturaMaxima = 0;
        temperaturaMinima = 0;
        if (temperatura1 > temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else if (temperatura1 == temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else {
          temperaturaMaxima = temperatura2;
          temperaturaMinima = temperatura1;
        }
        probabilidad = (int) (Math.random() * 10) + 1;

        System.out.println("Prevision del tiempo para manana");
        System.out.println("--------------------------------");
        System.out.println("Temperatura minima: " + temperaturaMinima);
        System.out.println("Temperatura maxima: " + temperaturaMaxima);
        switch (probabilidad) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
            System.out.println("Soleado");
            break;

          case 9:
          case 10:
            System.out.println("Nublado");
          default:

        }
        break;
      case 3:
        temperatura1 = (int) (Math.random() * (30 - 20) + 20);
        temperatura2 = (int) (Math.random() * (30 - 20) + 20);
        temperaturaMaxima = 0;
        temperaturaMinima = 0;
        if (temperatura1 > temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else if (temperatura1 == temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else {
          temperaturaMaxima = temperatura2;
          temperaturaMinima = temperatura1;
        }
        probabilidad = (int) (Math.random() * 10) + 1;

        System.out.println("Prevision del tiempo para manana");
        System.out.println("--------------------------------");
        System.out.println("Temperatura minima: " + temperaturaMinima);
        System.out.println("Temperatura maxima: " + temperaturaMaxima);
        switch (probabilidad) {
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.println("Soleado");
            break;
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Nublado");
          default:

        }
        break;
      case 4:

        temperatura1 = (int) (Math.random() * 26);
        temperatura2 = (int) (Math.random() * 26);
        temperaturaMaxima = 0;
        temperaturaMinima = 0;
        if (temperatura1 > temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else if (temperatura1 == temperatura2) {
          temperaturaMaxima = temperatura1;
          temperaturaMinima = temperatura2;
        } else {
          temperaturaMaxima = temperatura2;
          temperaturaMinima = temperatura1;
        }
        probabilidad = (int) (Math.random() * 10) + 1;

        System.out.println("Prevision del tiempo para manana");
        System.out.println("--------------------------------");
        System.out.println("Temperatura minima: " + temperaturaMinima);
        System.out.println("Temperatura maxima: " + temperaturaMaxima);
        switch (probabilidad) {
          case 1:
          case 2:

            System.out.println("Soleado");
            break;
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("Nublado");
          default:

        }
         break;
      default:
    }
   
  


    

  }
}
