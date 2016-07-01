package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase Curso
 * <ol>
 * 	<li>codigo</li>
 * 	<li>nombre</li>
 * 	<li>horas</li>
 * </ol>
 */

public class Curso {

	/**
	 * Código alfanumérico usado como identificador único del {@code Curso}
	 */
	private String codigo;
	/**
	 * Nombre del {@code Curso}
	 */
	private String nombre;
	
	/**
	 * Duración en horas del {@code Curso}
	 */
	private int horas;
	
	/**
	 * Constructor de la clase Curso
	 * @param codigo {@code String}
	 * @param nombre {@code String}
	 * @param horas {@code int}
	 */
	public Curso(String codigo, String nombre, int horas) {
		this.codigo = codigo;
		//this.nombre = nombre;
		setNombre(nombre);
		this.horas = horas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = Utilidades.capitalizarMio(nombre);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", horas=" + horas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}



	
	
	
	
	
}
