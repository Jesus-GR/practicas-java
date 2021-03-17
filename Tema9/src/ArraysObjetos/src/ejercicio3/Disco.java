/**
 * 
 */
package ejercicio3;

/**
 * @author Mugre
 *
 */
public class Disco {
	private String codigoDisco;
	private String autor;
	private String titulo;
	private String genero;
	private String duracion;
	
	/***Constructor***/
	
	public Disco (String codigo, String autor, String titulo, String genero, String duracion) {
		this.codigoDisco = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		
	}
	
	/****Metodos****/
	
	public String toString() {
		return "Codigo: "+this.codigoDisco+" Autor: "+this.autor+" Titulo: "+this.titulo+" Genero: "+this.genero+" Duracion: "+this.duracion;
	}

	

	public String getCodigoDisco() {
		return codigoDisco;
	}

	public void setCodigoDisco(String codigoDisco) {
		this.codigoDisco = codigoDisco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	
	
}
