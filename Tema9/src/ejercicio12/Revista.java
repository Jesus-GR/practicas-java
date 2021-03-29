/**
 * 
 */
package ejercicio12;

/**
 * @author Mugre
 *
 */
public class Revista extends Publicacion {
	private int numero;
	
	
	/***Constructor***/
	public Revista (String isbn, String titulo, int anoPubli, int num) {
		this.setisbn(isbn);
		this.settitulo(titulo);
		this.setanoPubli(anoPubli);
		this.numero =  num;
	}
	
	
	/****Metodos***/
	
	public String toString() {
		return "ISBN:  "+this.getisbn()+", Titulo: "+this.gettitulo()+" Año de publicación:  "+this.getAnoPubli();
	}
}
