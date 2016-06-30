package com.ipartek.formacion.nombreproyecto.pojo;

public class Curso {

	protected String codigo;
	protected String nombre;
	protected int horas;
	
	
	public Curso() {
		super();
	}


	public Curso(String codigo, String nombre, int horas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
	}


	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
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
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}


	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
}
