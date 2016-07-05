package com.ipartek.formacion.nombreproyecto.pojo;


//imports

/**
 * Clase para crear objetos de tipo Libro
 * @author Ander Uraga
 *
 */
public class Libro {

	private String titulo; 
	private String autor;
	private String isbn; // Identificador o dni del Libro
	private int paginas;
	
	/**
	 * Constructor que nos pide obligatoriamente un "titulo" de <code>Libro</code>.<br>
	 * Resto de atributos del <code>Libro</code> se inicializan:
	 * <ul>
	 * 	  <li><code>String</code> autor = "anonimo"</li>
	 *    <li><code>String</code> isbn = ""</li>
	 *    <li><code>int</code> paginas = 0</li>
	 * </ul>
	 * 
	 * @param titulo <code>String</code> 
	 */
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.autor = "anonimo";
		this.isbn = "";
		this.paginas = 0;
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


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", paginas=" + paginas + "]";
	}
	
	
	
	
	
	
}
