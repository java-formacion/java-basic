package com.ipartek.formacion.nombreproyecto.pojo;

public class Curso extends Object {

	/**
	 * Da un objeto tipo {@code Curso}
	 * 
	 * @param codigo
	 *            es el código del curso
	 * @param horasTot
	 *            son las horas totales del curso
	 * @param nombre
	 *            es el nombre del curso
	 */
	private String codigo, nombre;
	private int horasTot;

	public String getCodigo() {
		return codigo;
	}

	public Curso() {
		super();
		this.codigo ="";
		this.nombre = "";
		this.horasTot = 0;
	}

	public Curso(String codigo, String nombre, int horasTot) {
		this();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTot = horasTot;
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

	public int getHorasTot() {
		return horasTot;
	}

	public void setHorasTot(int horasTot) {
		this.horasTot = horasTot;
	}

}
