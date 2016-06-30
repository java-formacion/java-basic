package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

public class Curso {

	/**
	 * codigo alfanumerico usado como identificador unico del curso
	 */
	protected String codigo;
	/**
	 * nombre del curso
	 */
	protected String nombre;
	/**
	 * duracion de horas del curso
	 */
	protected int horas;

	/**
	 * 
	 */
	public Curso() {
		super();
	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param horas
	 */
	public Curso(String codigo, String nombre, int horas) {
		super();
		this.codigo = codigo;
		this.setNombre(nombre);
		this.horas = horas;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = Utilidades.capitalizar(nombre);
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas
	 *            the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", horas=" + horas + "]";
	}

}
