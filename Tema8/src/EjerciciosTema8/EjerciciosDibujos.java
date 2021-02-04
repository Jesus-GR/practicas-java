/**
 * 
 */
package EjerciciosTema8;

/*import misfunciones.FuncionesArrays;
import misfunciones.FuncionesComprobacion;
import misfunciones.FuncionesDibujo;*/
import java.util.Scanner;

import misfunciones.FuncionesDibujo;

/**
 * @author Mugre
 *
 */
public class EjerciciosDibujos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub

		/*
		 * FuncionesDibujo.pintaLineaConEspacios("*", 1, "*");
		 * 
		 * FuncionesDibujo.trianguloRectoHueco(8, "*");
		 * 
		 * FuncionesDibujo.trianguloRectoDerecha(100, "k");
		 * 
		 * FuncionesDibujo.trianguloHuecoDerecha(10, "*");
		 */

		/*
		 * int [] array = FuncionesArrays.generaArrayInt(9, 1, 100);
		 * 
		 * FuncionesDibujo.pintaTablaArray(array);
		 */
	
		FuncionesDibujo.pintaValleHueco(3);
		System.out.println("");
		FuncionesDibujo.pintaValle(3);
	}

}
