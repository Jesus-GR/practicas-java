/**
 * 
 */
package misfunciones;

/**
 * @author Mugre
 *
 */
public class FuncionesString {
	public static void convierteEnPalotes(int n) {

		int[] array = new int[FuncionesMatematicas.cuentaDigitos(n)];
		int numeroVolteado = FuncionesMatematicas.voltea(n);

		for (int i = 0; i < FuncionesMatematicas.cuentaDigitos(n); i++) {
			array[i] = numeroVolteado % 10;
			numeroVolteado /= 10;
			if (i != 0) {
				System.out.print("-");
			}
			switch (array[i]) {
			case 0:
				System.out.print(" ");
				break;
			case 1:
				System.out.print("|");
				break;
			case 2:
				System.out.print("||");
				break;
			case 3:
				System.out.print("|||");
				break;
			case 4:
				System.out.print("||||");
				break;
			case 5:
				System.out.print("|||||");
				break;
			case 6:
				System.out.print("||||||");
				break;
			case 7:
				System.out.print("|||||||");
				break;
			case 8:
				System.out.print("||||||||");
				break;
			case 9:
				System.out.print("|||||||||");
				break;
			default:
			}

		}

	}

	public static String convierteEnMorse(int n) {
		String morse = "";
		int digito = 0 ;
		int longitud = FuncionesMatematicas.cuentaDigitos(n);
		String [] arrayMorse = {
			 "_ _ _ _ _  ",". _ _ _ _  ",". . _ _ _  "," . . . _ _  ",". . . . _  ",
			 ". . . . .  ","_ . . . .  ","_ _ . . .  ","_ _ _ . .  ","_ _ _ _ .  "};
		
		for (int i = 0; i < longitud ; i++) {
			digito =n % 10;
			n /= 10;
			morse = arrayMorse[i] + morse;
		}
		return  morse;

	}

	public static void convierteEnPalabras(int n) {
		int[] array = new int[FuncionesMatematicas.cuentaDigitos(n)];
		int numeroVolteado = FuncionesMatematicas.voltea(n);
		int digitos = FuncionesMatematicas.cuentaDigitos(n);
		for (int i = 0; i < digitos; i++) {
			array[i] = numeroVolteado % 10;
			numeroVolteado /= 10;

			switch (array[i]) {
			case 0:
				System.out.print("Cero");
				break;
			case 1:
				System.out.print("Uno");
				break;
			case 2:
				System.out.print("Dos ");
				break;
			case 3:
				System.out.print(" Tres");
				break;
			case 4:
				System.out.print("Cuatro");
				break;
			case 5:
				System.out.print("Cinco");
				break;
			case 6:
				System.out.print("Seis");
				break;
			case 7:
				System.out.print("Siete");
				break;
			case 8:
				System.out.print("Ocho");
				break;
			case 9:
				System.out.print("Nueve");
				break;
			default:
			}

			if (i < digitos - 1) {
				System.out.print(",");
			}
		}

	}
}
