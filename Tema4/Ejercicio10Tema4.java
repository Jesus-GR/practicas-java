/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio10Tema4{
  public static void main(String[]args){
    System.out.println("Este programa te dice tu horóscopo dependiendo de tu cumpleaños");
    System.out.print("Introduec el mes de nacimiento: ");
    String mes;
    mes = System.console().readLine();
    System.out.print("Introduce el día de tu cumpleaños: ");
    int dia;
    dia= Integer.parseInt(System.console().readLine());
    
    switch (mes.toLowerCase()){
      case "enero":
        if(dia>= 1 && dia<=20){
            System.out.print("Capricornio");
         }else{
           if(dia>=21  && dia <=31){
             System.out.print("Acuario");
            }else{
              System.out.print("EL valor introducido no es válido");
             }
          }
        break;
      case "febrero":
        if(dia>= 1 && dia<=29){
            System.out.print("acuario");
         }else{
           if(dia>=20  && dia <=29){
             System.out.print("piscis");
            }else{
              System.out.print("EL valor introducido no es válido");
             }
          }
        break;
       case "marzo":
          if(dia>= 1 && dia<=20){
              System.out.print("piscis");
          }else{
            if(dia>=21  && dia <=31){
              System.out.print("aries");
              }else{
              System.out.print("EL valor introducido no es válido");
              }
            }  
          break;
        
        case "abril":
          if(dia>= 1 && dia<=20){
              System.out.print("aries");
          }else{
            if(dia>=21  && dia <=31){
              System.out.print("tauro");
              }else{
                System.out.print("EL valor introducido no es válido");
              }
            }
          break;
        
        case "mayo":
          if(dia>= 1 && dia<=21){
            System.out.print("tauro");
          }else{
            if(dia>=22  && dia <=31){
              System.out.print("géminis");
              }else{
                System.out.print("EL valor introducido no es válido");
              }
            } 
          break;
        
        case "junio":
          if(dia>= 1 && dia<=21){
            System.out.print("géminis");
          }else{
            if(dia>=22  && dia <=31){
              System.out.print("cáncer");
              }else{
                System.out.print("EL valor introducido no es válido");
              }
            }
          break;
        
        case "julio":
          if(dia>= 1 && dia<=23){
            System.out.print("cáncer");
          }else{
            if(dia>=24  && dia <=31){
             System.out.print("leo");
            }else{
              System.out.print("EL valor introducido no es válido");
            }
          }
          break;
        case "agosto":
        if(dia>= 1 && dia<=23){
            System.out.print("leo");
         }else{
           if(dia>=24  && dia <=31){
             System.out.print("virgo");
            }else{
              System.out.print("EL valor introducido no es válido");
             }
          }
          break;
          
        case "septiembre":
          if(dia>= 1 && dia<=23){
            System.out.print("virgo");
          }else{
            if(dia>=24  && dia <=31){
             System.out.print("libra");
            }else{
              System.out.print("EL valor introducido no es válido");
            }
          }
        break;
        
        case "octubre":
          if(dia>= 1 && dia<=23){
            System.out.print("libra");
          }else{
           if(dia>=24  && dia <=31){
             System.out.print("escorpio");
            }else{
              System.out.print("EL valor introducido no es válido");
            }
          }
          break;
          
        case "noviembre":
          if(dia>= 1 && dia<=22){
            System.out.print("escorpio");
          }else{
           if(dia>=23  && dia <=31){
             System.out.print("sagitario");
            }else{
              System.out.print("EL valor introducido no es válido");
            }
          }
        break;
        
        case "diciembre":
          if(dia>= 1 && dia<=21){
            System.out.print("sagitario");
          }else{
           if(dia>=22  && dia <=31){
             System.out.print("capricornio");
            }else{
              System.out.print("EL valor introducido no es válido");
            }
          }
          break;
    }
  }
}
