/**
 * 
 */
package ejercicio1;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;

public class MainCaballo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Caballo rocinante = new Caballo();
		int cantidadKilos = 0;
		boolean estaJugando = false;
		double kilosQueCome = 0;
		String tipoComida = "";
		rocinante.setPesoEnKilos(300);
		System.out.println("Hola, soy Rocinante y peso " + (int) rocinante.getPesoEnKilos() + " kilos");
		while (!estaJugando) {
			System.out.print("Que quieres que haga?(1-correr 2-comer 3-Dormir): ");
			int eleccion = Integer.parseInt(s.nextLine());
			if (eleccion == 1) {
				System.out.print("Cuantos kms quieres que corra?: ");
				double km = Double.parseDouble(s.nextLine());
				rocinante.corre(km);
				System.out.println("Ahora mi peso es: " + rocinante.getPesoEnKilos());
			} else if (eleccion == 2) {
				System.out.print("Que cantidad de comida quieres darle?: ");
				kilosQueCome = Double.parseDouble(s.nextLine());
				System.out.print("Que tipo de comida quieres darle?: ");
				tipoComida = s.nextLine();
				rocinante.come(kilosQueCome, tipoComida);
				System.out.println("Ahora mi peso es: " + rocinante.getPesoEnKilos());
			}else if(eleccion == 3) {
				estaJugando = true;
				System.out.print("Me voy a dormir. Adios ");
			}

		}

	}

}
