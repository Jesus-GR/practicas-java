/**
 * 
 */
package ejercicio1;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;
public class PruebaGatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] numGatos = new int[4];
		Gato [] gatos = new Gato[4];
		
		
		for (int i = 0; i < numGatos.length; i++) {
			System.out.print("Introduce el nombre: ");
			String nombre = s.nextLine();
			System.out.print("Introduce el sexo: ");
			String sexo = s.nextLine();
			System.out.print("Introduce la raza: ");
			String raza = s.nextLine();
			gatos[i] = new Gato (nombre,sexo, raza);
		}
		
		for (Gato gato : gatos) {
			System.out.println(gato);
		}
		
	}

}
