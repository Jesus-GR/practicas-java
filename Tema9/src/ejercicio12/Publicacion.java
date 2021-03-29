/**
 * 
 */
package ejercicio12;

/**
 * @author Mugre
 *
 */
public abstract class Publicacion  {
	private  String isbn;
	private  String titulo;
	private int anoPubli;
	
	
	/***Metodos getter y setter**/
	
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPubli() {
		return anoPubli;
	}
	public void setanoPubli(int anoPubli) {
		 this.anoPubli =  anoPubli;
	}
	
	
	
}
