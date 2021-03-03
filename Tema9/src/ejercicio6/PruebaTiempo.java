/**
 * 
 */
package ejercicio6;

/**
 * @author Mugre
 *
 */
public class PruebaTiempo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo t1 = new Tiempo(0,30,40);
		Tiempo t2 = new Tiempo(0,35,20);
		
		t1.suma(t2);
		
		System.out.println(t1);
		t1.resta(t2);
		Tiempo t3 = new Tiempo(0,30,45);
		Tiempo t4 = new Tiempo(0,10,30);
		t3.resta(t4);
		System.out.println(t3);
	}

}
