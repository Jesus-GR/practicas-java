/**
 * 
 */
package ejercicio4;

/**
 * @author Mugre
 *
 */
public class PruebaFraccion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraccion fraccion1 = new Fraccion(-4,2);
		Fraccion fraccion2 = new Fraccion(2,43);
		System.out.println(fraccion1);
		
		System.out.println(fraccion1+"="+fraccion1.invierte());
		System.out.println(fraccion1+" x "+fraccion2+ "= "+fraccion1.multiplica(fraccion2));
		System.out.println(fraccion1+" / "+ fraccion2+" = "+ fraccion1.divide(fraccion2));
		
	}

}
