package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

/**
 * Clase de tipo POJO para istancar onjetos que representan un Candidato
 * los atributos de un candidato
 * <ol>
 * 	<li>nombre</li>
 * 	<li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * </ol>
 * @author usuario
 *
 */

/**
 * constructor con solo nombre y dni, y nombre y apellidos siempre capitalizados
 * 
 * @author Curso
 *
 */
public class Persona {

	private String nombre;
	private String apellido1, apellido2, dni;

	// constructor con parametros
	public Persona(String nombre, String dni, String ap1, String ap2) {
		this();
		setNombre(nombre);
		setApellido1(ap1);
		setApellido2(ap2);
		setDni(dni);
	}

	// constructor por defect
	public Persona() {
		this.nombre = "anonimo";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";

	}

	public String getNombre() {
		/**
		 * @param nombre
		 *            <String> es una cadena de texto con el nombre
		 */
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = Utilidades.Capitalizar(nombre);
	}

	public String obtenerApellido1() {
		return apellido1;
	}

	public String obtenerApellido2() {
		return apellido2;
	}

	public String obtenerDNI() {
		return dni;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = Utilidades.Capitalizar(apellido1);
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = Utilidades.Capitalizar(apellido2);
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
