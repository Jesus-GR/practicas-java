package tema5;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;

public class Ejercicio30Tema5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean esCorrecto = false;
    int contadorDia1 = 0;
    int contadorDia2 = 0;
    int totalHoras = 0;
    do{
    System.out.println("Por favor, introduzca la primera hora: ");
    System.out.print("Dia: ");
    String dia1 = s.nextLine();
    System.out.print("Hora: ");
    int hora1 = Integer.parseInt(s.nextLine());
    System.out.println("Por favor, Introduzca la segunda hora: ");
    System.out.print("Dia: ");
    String dia2 = s.nextLine();
    System.out.print("Hora: ");
    int hora2 = Integer.parseInt(s.nextLine());
    
    
    switch (dia1) {
      case "lunes":
        contadorDia1 = 1;
        break;
      case "martes":
        contadorDia1 = 2;
        break;
      case "miercoles":
        contadorDia1 = 3;
        break;
      case "jueves":
        contadorDia1 = 4;
        break;
      case "viernes":
        contadorDia1 = 5;
        break;
      case "sabado":
        contadorDia1 = 6;
        break;
      case "domingo":
        contadorDia1 = 7;
        break;
      default:
    }

    switch (dia2) {
      case "lunes":
        contadorDia2 = 1;
        break;
      case "martes":
        contadorDia2 = 2;
        break;
      case "miercoles":
        contadorDia2 = 3;
        break;
      case "jueves":
        contadorDia2 = 4;
        break;
      case "viernes":
        contadorDia2 = 5;
        break;
      case "sabado":
        contadorDia2 = 6;
        break;
      case "domingo":
        contadorDia2 = 7;
        break;
      default:
    }
    int contadorHoras = 0;
    int horasDia1 = 24 - hora1;

    int horasDia2 = (24 - hora2);

    if (contadorDia1 <= contadorDia2) {
      for (int i = 0; i < contadorDia2 - contadorDia1; i++) {

        contadorHoras += 24;
        totalHoras = horasDia1 + contadorHoras - horasDia2;
        System.out.print("Entre las " + hora1 + ":00 del " + dia1 + " y las " + hora2 + ":00 del " + dia2 + " hay " + (int) totalHoras + " hora/s");
        System.out.println("");
        
      }
      esCorrecto = true;
    } else {
      System.out.println("El primer dia introducido es posterior al segundo. Vuelva a intentarlo");
      esCorrecto = false;
    }
    }while(!esCorrecto);

  }

}
