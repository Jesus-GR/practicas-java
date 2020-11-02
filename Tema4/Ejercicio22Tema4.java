/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio22Tema4 {
    public static void main(String[]args){
      System.out.print("Introduce un día de la semana: ");
      String dia=System.console().readLine().toLowerCase();
      int minutosLunes;
      minutosLunes = 1440;
      int minutosMartes;
      minutosMartes = 1440;
      int minutosMiercoles;
      minutosMiercoles = 1440;
      int minutosJueves;
      minutosJueves = 1440;
      int minutosViernes;
      minutosViernes = 900;
      int minutosFinDeSemana;
      
      System.out.print("Introduce una hora (en formato 24h): ");
      int hora;
      hora = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce los minutos: ");
      int minutos;
      minutos = Integer.parseInt(System.console().readLine());
      
      switch (dia){
        case "lunes":
          if(hora<24 && minutos<=60){
            minutosFinDeSemana = minutosLunes-(hora*60)-minutos+minutosMartes+minutosMiercoles+minutosJueves+minutosViernes;
            System.out.print("Faltan "+minutosFinDeSemana+" minutos para el fin de semana");
          }else{
            System.out.print("El valor introducido no es correcto");
          }
          break;
        case "martes":
          if(hora<24 && minutos<=60){
            minutosFinDeSemana = minutosMartes-(hora*60)-minutos+minutosMiercoles+minutosJueves+minutosViernes;
            System.out.print("Faltan "+minutosFinDeSemana+" minutos para el fin de semana");
          }else{
            System.out.print("El valor introducido no es correcto");
          }
          break;
        case "miercoles":
          minutosFinDeSemana = minutosMiercoles-(hora*60)-minutos+minutosJueves+minutosViernes;
          System.out.print("Faltan" +minutosFinDeSemana+" minutos para el fin de semana");
          break;
        case "jueves":
        if(hora<24 && minutos<=60){
          minutosFinDeSemana = minutosJueves-(hora*60)-minutos+minutosViernes;
          System.out.print("Faltan "+minutosFinDeSemana+" minutos para el fin de semana");
        }else{
          System.out.print("El valor introducido no es correcto");
        }
          break;
        case "viernes":
          if(hora<=15 && minutos<=60){
            minutosFinDeSemana = minutosViernes-(hora*60)-minutos;
            System.out.print("Faltan "+minutosFinDeSemana+" minutos para el fin de semana");
          }else{
            System.out.print("El valor introducido no es correcto");
          }
          break;
        default:
          System.out.print("El valor introducido no es correcto");
      }
      
        
    }
  }
