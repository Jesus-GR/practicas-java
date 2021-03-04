/**
 * 
 */
package ejercicio11;

/**
 * @author Mugre
 *
 */
public class PruebaTarjetas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TarjetaRegalo t1 = new TarjetaRegalo(100);
		TarjetaRegalo t2 = new TarjetaRegalo(120);
		System.out.println(t1);
		System.out.println(t2);
		t1.gasta(45.90);
		t2.gasta(5);
		t2.gasta(200);
		t1.gasta(3.55);
		System.out.println(t1);
		System.out.println(t2);
		TarjetaRegalo t3 = t1.fusionaCon(t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
