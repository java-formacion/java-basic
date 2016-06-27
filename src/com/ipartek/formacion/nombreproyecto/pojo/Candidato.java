package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

/**
 * CLASE TIPO POJO PARA INSTANCIAR OBJETOS QUE REPRESENTAN UN CANDIDATO
 * los atributos de un candidato:
 * <ol>
 * <li>nombre</li>
 * <li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * </ol>
 * @author Aitor
 *
 */
/**
 * recuperamos el nombre del objeto
 * 
 * @param nombre
 */
public class Candidato {
	

	// propiedad
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	
	public Candidato(String nombre, String dni) {
		super();
		this.nombre = Utilidades.capitalizar(nombre);
		this.dni = dni;
		this.apellido1 = "";
		this.apellido2 = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = Utilidades.capitalizar(nombre);
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = Utilidades.capitalizar(apellido1);
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = Utilidades.capitalizar(apellido2);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Candidato [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ "]";
	}
	

}