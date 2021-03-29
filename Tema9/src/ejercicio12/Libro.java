/**
 * 
 */
package ejercicio12;

/**
 * @author Mugre
 *
 */
public class Libro extends Publicacion implements Prestable {
	private boolean esPrestado = false;
	private String prestado = "(no prestado)";
	

	/***Constructor***/
	
	public Libro(String isbn, String titulo, int anoPubli) {
		this.setisbn(isbn);
		this.settitulo(titulo);
		this.setanoPubli(anoPubli);
	}

	
	/*****Methods****/
	public void presta() {
		if (this.esPrestado == true) {
			System.out.println("Lo siento, este libro ya esta prestado ");
		} else {
			this.esPrestado = true;
		}
		
		this.prestado = "(Presatdo)";

	}
	
	public void devuelve() {
		this.prestado = "(No prestado)";
		this.esPrestado = false;
	}
	
	public boolean estaPrestado() {
		if(esPrestado == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "ISBN:  "+this.getisbn()+", Titulo: "+this.gettitulo()+" Año de publicación:  "+this.getAnoPubli()+" "+this.prestado;
	}
}