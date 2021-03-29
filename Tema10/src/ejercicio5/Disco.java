/**
 * 
 */
package ejercicio5;

/**
 * @author Mugre
 *
 */
public class Disco {
	private String codigo;
	private String titulo;
	private String autor;
	private String genero;
	private int duracion;

	public Disco(String codigo ,String titulo,String autor,String genero,int duracion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.duracion = duracion;
	}
	

	public String toString() {
		return "Código : "+this.codigo+"\nTítulo :"+this.titulo+" \nAutor: "+this.autor+" \nGénero "+this.genero+" \nDuración "+this.duracion;
	}



	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
