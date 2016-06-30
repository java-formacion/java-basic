package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

/**
 * Curso que puede tener un formador:
 * <ul>
 * 	<li>codigo {@code String}
 * 	<li>nombre {@code String}
 * 	<li>horas {@code int}
 * </ul>
 * @author Borja
 *
 */
public class Curso {
	
	private String codigo;
	private String nombre;
	private int horas;
	
	//Constructor
	public Curso(String codigo, String nombre, int horas) {
		super();
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
	
	
}
