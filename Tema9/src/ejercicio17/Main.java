/**
 * 
 */
package ejercicio17;

/**
 * @author Mugre
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piramide p = new Piramide(4);
		Rectangulo r1 = new Rectangulo(4, 3);
		Rectangulo r2 = new Rectangulo(6, 2);
		System.out.println(p);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
		System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());

	}

}
