package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase Curso
 * <li>codigo</li>
 * <li>nombre</li>
 * <li>horas</li>
 */

public class Curso {

	private String codigo;
	private String nombre;
	private int horas;
	
	/**
	 * Constructor de la clase Curso
	 * @param codigo {@code String}
	 * @param nombre {@code String}
	 * @param horas {@code int}
	 */
	public Curso(String codigo, String nombre, int horas) {
		this.codigo = codigo;
		this.nombre = nombre;
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
		this.nombre = nombre;
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
