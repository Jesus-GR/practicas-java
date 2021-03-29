/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public class pruebaAnimales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canario pepe = new Canario("Amarillo");
		Gato gardfield = new Gato("siames","hembra");
		Perro rocky = new Perro();
		Pinguino pingu = new Pinguino();
		System.out.println();
		System.out.println(pepe.getKilometrosRecorridos());

		pepe.canta();

		System.out.println();
		pepe.vuela(1, 10, 3);
		pingu.nada(5, 10, 25);

		System.out.println(pepe.getKilometrosRecorridos());
		System.out.println(pingu.getKilometrosRecorridos());
		pepe.vuela(1, 10, 3);
		pingu.nada(5, 10, 25);
		System.out.println(pepe.getKilometrosRecorridos());
		System.out.println(pingu.getKilometrosRecorridos());
		
		rocky.ladra();
		pingu.vuela(1, 10, 3);
	}
}
