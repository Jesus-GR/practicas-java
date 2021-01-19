/**
 * 
 */
package ArrayBidimensional;

/**
 * @author Jesús Gutiérrez
 *
 */
import java.util.Scanner;
public class Ejercicio1Tema7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		int [][] num = new int [3][6];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("Introduce un valor para num ["+i+"] y ["+j+"]: ");
				num [i][j] = Integer.parseInt(s.nextLine());
			}
		}
		
		System.out.println("Array num\t      Columna 0           Columna 1            Columna 2            Columna 3          Columna 4          Columna  5");
		for (int i = 0; i < 3; i++) {
			System.out.print("Fila"+i+"\t");
			for (int j = 0; j < 6; j++) {
				System.out.printf("%20d",num[i][j]);
				Thread.sleep(500);
			}
			System.out.println("");
			
		}
	}
}
