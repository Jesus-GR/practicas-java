/**
 * 
 */
package ejerecicio15;

/**
 * @author Mugre
 *
 */
public class PruebaFichas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FichaDomino f1 = new FichaDomino();
		FichaDomino f2 = new FichaDomino();
		FichaDomino f3 = new FichaDomino();
		FichaDomino f4 = new FichaDomino();
		FichaDomino f5 = new FichaDomino();
		FichaDomino f6 = new FichaDomino();
		FichaDomino f7 = new FichaDomino();
		FichaDomino f8 = new FichaDomino();
		
		f1.encaja(f2);
		f2.encaja(f3);
		f3.encaja(f4);
		f4.encaja(f5);
		f5.encaja(f6);
		f6.encaja(f7);
		f7.encaja(f8);
		
		System.out.print(f1);
		System.out.print(f2);
		System.out.print(f3);
		System.out.print(f4);
		System.out.print(f5);
		System.out.print(f6);
		System.out.print(f7);
		System.out.print(f8);
		
		
	}

}
