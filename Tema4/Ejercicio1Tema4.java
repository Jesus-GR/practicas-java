/**
 * 
 * @autor Jesús Gutiérrez
 **/
public class Ejercicio1Tema4{
  public static void main(String[]args){
   System.out.print("Introduce un dia de la semana: ");
   String dia = System.console().readLine();
   String asignatura;
   
   switch (dia.toLowerCase()){
    case "lunes":
      asignatura="EDD";
      break;
    case "martes":
      asignatura="Programación";
      break;
    case "miercoles":
      asignatura="Programación";
      break;
    case "jueves":
      asignatura="Programación";
      break;
    case "viernes":
      asignatura="Fol";
      break;
    case "sábado":
      asignatura="No hay clases";
    case "domingo":
      asignatura="No hay clases";
      break;
    default:
      asignatura = "No existe";
    
    }
    if (asignatura.equals ("No existe")){
      System.out.print(asignatural);
    }else{
      System.out.print("El día "+dia+":"+asignatura);
    }
    }
  }
    

