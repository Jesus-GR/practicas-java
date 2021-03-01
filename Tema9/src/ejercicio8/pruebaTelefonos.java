/**
 * 
 */
package ejercicio8;

/**
 * @author Mugre
 *
 */
public class pruebaTelefonos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Terminal t1 = new Terminal ("617 716 528");
		Terminal t2 = new Terminal ("643 321 324");
		Terminal t3 = new Terminal ("611 716 576");
		Terminal t4 = new Terminal ("673 356 324");
		
		System.out.println(t1);
		System.out.println(t2);
		t1.llama(t2, 320);
		t1.llama(t3, 200);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

	}

}
