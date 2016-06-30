package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

/**
 * Clase Curso
 * <ol>
 * <li>codigo</li>
 * <li>nombre</li>
 * <li>horas</li>
 * </ol>
 */

public class Curso {

	/**
	 * codigo alfanumerico usado como identificador unico del {@code Curso}
	 */
	private String codigo;
	/**
	 * Nombre del {@code Curso}
	 */
	private String nombre;
	/**
	 * Duracion en horas del {@code Curso}
	 */
	private int horas;

	/**
	 * Constructor de la clase {@code Curso}
	 * 
	 * @param codigo
	 *            {@code String}
	 * @param nombre
	 *            {@code String}
	 * @param horas
	 *            {@code int}
	 */
	public Curso(String codigo, String nombre, int horas) {
		this.codigo = codigo;		
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
		this.nombre = Utilidades.capitalizar(nombre);
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

}
