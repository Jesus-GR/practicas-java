/**
 * 
 */
package ejercicio1;

/**
 * @author Mugre
 *
 */
public class Gato {
	private boolean estaEnCelo;
	private String raza;
	private String sexo;
	private String nombre; 
	private static int gatosCreados = 0;
	private int codigo;
	
	
	/**Constructor**/
	public Gato (String nombre, String sexo , String raza ) {
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		Gato.gatosCreados ++;
		this.codigo =  Gato.gatosCreados;
		
	}
	public Gato() {
		
	}
	public Gato( boolean estaEnCelo) {
		super();
		this.estaEnCelo = estaEnCelo;
	}
	
	/***Metodo***/
	
	public void maulla() {
		System.out.println("Miau");
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "El "+this.codigo+"º se llama "+this.nombre+", es un "+this.sexo+" y de raza "+this.raza;
	}
}
