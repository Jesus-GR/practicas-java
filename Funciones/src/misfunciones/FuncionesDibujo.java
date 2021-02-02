/**
 * 
 */
package misfunciones;

/**
 * @author Mugre
 *
 */
public class FuncionesDibujo {
	/**
	 * Pinta una Linea del Caracter que le introduzcas
	 * @param x Es la longitud de la linea
	 * @param a Es el caracter que quiere que te pinte
	 * @return
	 */
	public static String pintaLinea(int x, String a) {
		String miLinea = "";
		for (int i = 0; i < x; i++) {
			miLinea += a;
		}
		return miLinea;
	}
	/**
	 * Pinta dentro de una longitud dada, un caracter inicial,
	 *  n espacios y un caracter final
	 * @param a Es el caracter inicial
	 * @param x Es la longitud de la linea
	 * @param b Es el caracter final
	 */
	public static void pintaLineaConEspacios (String a, int x, String b) {
		for (int i = 1; i > 0; i--) {
			System.out.print(a);
			for (int j = x-2; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println(b);
		}
	}
	/**
	 * Pinta un triángulo recto pegado al borde izquiero, con la base en
	 * la parte superior
	 * @param altura Es la altura del triángulo
	 * @param a Es el caracter con el que se rellena el triángulo
	 */
	public static void trianguloRecto (int altura, String a) {
		for (int i = 0; i <altura; i++) {
			for (int j = altura; j > 0 ; j--) {
				System.out.println( FuncionesDibujo.pintaLinea(altura--, "a"));
			}
		}
	}
	/**
	 * Pinta un triángulo recto hueco pegado al borde izquiero, con la base en
	 * la parte superior
	 * @param x Es la altura del triángulo
	 * @param a Es el caracter de los bordes y la base del triángulo
	 */
	public static void trianguloRectoHueco (int x,String a) {
		int altura = x-1;
		int espacio = altura;
		System.out.println(FuncionesDibujo.pintaLinea(altura, a));
		for (int i = 0; i < altura-1; i++) {
			FuncionesDibujo.pintaLineaConEspacios(a, espacio--, a+"\n");
			
		}
		System.out.println(a);
	}
	/**
	 * Pinta un triángulo justificado a la derecha
	 * @param altura Es la altura del triánguo
	 * @param a Es el caracter que rellena
	 */
	public static void trianguloRectoDerecha (int altura, String a) {
		int espacio = 0;
		int lonLinea = altura;
		
		for (int i = 0; i < altura; i++) {
			for (int j = espacio; j > 0 ;  j--) {
				System.out.print(" ");
			}
			espacio++;
			System.out.print(FuncionesDibujo.pintaLinea(lonLinea--, "*"));
			System.out.println("");
		}
	}
	public static void trianguloHuecoDerecha(int x, String a) {
		int altura = x-1;
		int espacioInterno = altura;
		int espacio = 0;
		int contadorEspacio = 0;
		System.out.println(FuncionesDibujo.pintaLinea(altura, a));
		for (int i = 0; i < altura-1; i++) {
			for (int j = espacio; j > 0 ;  j--) {
				System.out.print(" ");
			}
			espacio++;
			contadorEspacio++;
			FuncionesDibujo.pintaLineaConEspacios(a, espacioInterno--, a+"\n");
		}
		for (int i = 0; i < contadorEspacio; i++) {
			System.out.print(" ");
		}
		System.out.println(a);
	}
}
