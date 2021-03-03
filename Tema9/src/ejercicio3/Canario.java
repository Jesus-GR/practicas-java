/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public class Canario extends Ave {
	private boolean canta;
	private String tipoCanto;
	
	public Canario (String colorPluma) {
		super(colorPluma);
		
	}
	
	public void canta() {
		System.out.print("Volare!! Oh oh. Cantare!!...");
	}

}
