package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * clase para crear objettos libro
 * @author Curso
 *
 */
public class Libro {

	private String titulo, autor, isbn;
	private int pags;
	
	/**
	 * constructor que pide obligatoriamente un título de <code>Libro</code>
	 * el resto de atributos se inicializan:
	 * <ul>
	 * 		<li><code>String</code> autor = "anonimo"<li>
	 * 		<li><code>String</code> isbn = ""<li>
	 * 		<li><code>int</code> paginas = 0<li>
	 * </ul>
	 * 
	 * 
	 * @param titulo <code>String</code>
	 * @param autor
	 * @param isbn
	 * @param pags
	 */
	
	public Libro(String titulo, String autor, String isbn, int pags) {
		super();
		
		if (titulo != "") {
			this.titulo = titulo;
			this.autor = "Anónimo";
			this.isbn = ""; // indetificador del libro
			this.pags = 0;}
			else{
				throw new IllegalArgumentException("hace falta un titulo");	
		
			}
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", pags=" + pags + "]";
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
	public int getPags() {
		return pags;
	}
	public void setPags(int pags) {
		this.pags = pags;
	}
	
	
	
}
