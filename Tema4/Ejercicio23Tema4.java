/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio23Tema4{
  public static void main(String[]args){
    System.out.print("Introduzca la base imponible: ");
    double baseImponible;
    baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA(general, reducido o superreducido): ");
    String tipoDeIva = System.console().readLine().toLowerCase();
    int IVA;
    IVA = 0;
    switch (tipoDeIva){
      case "general":
        IVA = 21;
        break;
      case "reducido":
        
        IVA = 10;
        break;
      case "superreducido":
        tipoDeIva.equals ("4%");
        IVA =4;
        break;
      default:
        System.out.print("El valor introducido no es correcto");
    }
    double cantidadIva;
    cantidadIva = (baseImponible * IVA)/100;
    double precioConIva;
    precioConIva = baseImponible + cantidadIva;
    
    System.out.print("Introduce el código promocional(nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine().toLowerCase();
    
   
    
    double valorCodigoPromocional;
    valorCodigoPromocional = 0;
    switch (codigoPromocional){
      case "nopro":
        valorCodigoPromocional = 0;
        break;
      case "mitad":
        valorCodigoPromocional = precioConIva/2;
        break;
      case "meno5":
        valorCodigoPromocional = 5;
        break;
      case "5porc":
        valorCodigoPromocional = (precioConIva*5/100);
        break;
      default:
        System.out.print("EL valor introducido no es correcto");
    }
    double total;
    total = precioConIva - valorCodigoPromocional;
    
    System.out.printf("Base imponible             %10.2f\n ",baseImponible);
    System.out.printf("IVA(%2d)                   %10.2f\n ",IVA,cantidadIva);
    System.out.printf("Precio con IVA            %10.2f\n ",precioConIva);
    System.out.printf("Cód. promo (%s)        %10.2f\n ",codigoPromocional,valorCodigoPromocional);
    System.out.printf("TOTAL                     %10.2f\n ",total);
  
  }
}
