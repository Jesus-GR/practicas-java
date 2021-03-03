/**
 * 
 */
package Ejercicio2;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Coche turismo = new Coche();
		Bicicleta orbea = new Bicicleta();
		int opcion = 0;
		while (opcion != 8) {
			System.out.println();
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.print("Elige una opcion (1-8): ");
			opcion = Integer.parseInt(s.nextLine());
			switch (opcion) {
			case 1:
				System.out.print("Distancia a recorrer: ");
				int kmBici = Integer.parseInt(s.nextLine());
				orbea.anda(kmBici);
				System.out.println("Voy a recorrer "+kmBici+" kilometros");
				System.out.println("");
				break;
			case 2:
				orbea.caballito();
				System.out.println("");
				break;
			case 3:
				System.out.print("Distancia a recorrer: ");
				int kmCoche = Integer.parseInt(s.nextLine());
				turismo.anda(kmCoche);
				System.out.println("Voy a recorrer "+kmCoche+" kilometros");
				System.out.println("");
				break;
			case 4:
				turismo.quemaRuedas();
				System.out.println("");
				break;
			case 5:
				System.out.println("Llevo recorridos "+orbea.getKilometrosRecorridos()+" kilometros");
				System.out.println("");
				break;
			case 6:
				System.out.println("Llevo recorridos "+turismo.getKilometrosRecorridos()+" kilometros");
				System.out.println("");
				break;
			case 7:
				System.out.println("El total de los kms son: "+Vehiculo.getKilometrosTotales()+" kms");
				System.out.println("");
				break;
				default:
			}
		}

	}

}
