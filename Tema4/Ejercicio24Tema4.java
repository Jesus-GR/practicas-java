package examensimulacro;

/**
 *
 * @author Jesús Gutiérrez
 */
import java.util.Scanner;

public class Ejercicio24Tema4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("1) Programador Junior");
    System.out.println("2)Prog. Senior");
    System.out.println("3) Jefe de proyecto");
    System.out.print("Introduce el cargo del empleado (1-3): ");
    int empleado = Integer.parseInt(s.nextLine());
    double sueldoBase;
    if (empleado == 1) {
      sueldoBase = 950;
    } else if (empleado == 2) {
      sueldoBase = 1200;
    } else {
      sueldoBase = 1600;
    }
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    int diaViaje = Integer.parseInt(s.nextLine());
    double totalDias = diaViaje * 30;
    System.out.print("Introduzca estado civil( 1-Soltero 2-Casado): ");
    int estadoCivil = Integer.parseInt(s.nextLine());
    double sueldoNeto = 0;
    int irpf=0;
    double retencion;
    if (estadoCivil == 1) {
      irpf = 25;
      retencion = sueldoBase*0.25;
      sueldoNeto = (sueldoBase - retencion);
    } else {
      irpf = 20;
      retencion = (sueldoBase+totalDias)* 0.20;
      sueldoNeto = (sueldoBase+totalDias - retencion);
    }
    System.out.println(" |----------------------------------------------------|");
    System.out.printf(" |Sueldo base                                 %7.2f |\n", sueldoBase);
    System.out.println(" |                                                    |");
    System.out.printf(" |Dietas(" + diaViaje + " viajes)                            %7.2f |\n", totalDias);
    System.out.println(" |                                                    |");
    System.out.println(" |----------------------------------------------------|");
    System.out.printf(" |Sueldo bruto                                %7.2f |\n", sueldoBase + totalDias);
    System.out.println(" |                                                    |");
    System.out.printf(" |Retención IRPF (" + irpf + ")                         %7.2f |\n", retencion);
    System.out.println(" |                                                    |");
    System.out.println(" |----------------------------------------------------|");
    System.out.printf(" |Sueldo neto                                 %7.2f |\n", sueldoNeto);
    System.out.println(" |                                                    |");
    System.out.println(" |----------------------------------------------------|");
  }

}
