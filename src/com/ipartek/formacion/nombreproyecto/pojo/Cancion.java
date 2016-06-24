package com.ipartek.formacion.nombreproyecto.pojo;

public class Cancion {
	
	//ATRIBUTOS  (Variables)
	//---------
	
		private String titulo;
		private String autor;
		private String genero;
		private String duracion;
		private String album;
		private int anio;

		
	//CONSTRUCTOR    -- (Source-->Generate Constructor using Fields)
	//------------
		
		/**
		 * Constructor que nos pide obligatoriamente un "titulo" y "autor" de <code>Libro</code>.<br>
		 * El resto de atributos del <code>Libro</code> se inicializan vacios.
		 * <ul>
		 * 		<li> {@code album} = "" </li>
		 * 		<li> {@code genero} = "" </li>
		 * 		<li> {@code duracion} = "" </li>
		 * 		<li> {@code anio} = 0 </li>
		 * 	
		 * </ul>
		 * @param titulo <code>String</code>  corresponde al titulo del libro.
		 * @param autor <code>String</code>  corresponde al autor del libro.
		 */
		public Cancion(String titulo, String autor) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.genero = "";
			this.duracion = "";
			this.album = "";
			this.anio = 0;
		}

		
	//ENCAPSULADO  GETTERS - SETTERS      (Source-->Generate Getters and Setters)
	//------------------------------
		
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


		public String getDuracion() {
			return duracion;
		}


		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}


		public String getAlbum() {
			return album;
		}


		public void setAlbum(String album) {
			this.album = album;
		}

		public int getAnio() {
			return anio;
		}


		public void setAnio(int anio) {
			this.anio = anio;
		}

		
	//METODO   --- toString() que devuelve los datos del libro   (Source-->Generate toString()...)
	//-------
		
		@Override
		public String toString() {
			return "Cancion [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", duracion=" + duracion
					+ ", album=" + album + ", anio=" + anio + "]";
		}

	

		

		
		
}
