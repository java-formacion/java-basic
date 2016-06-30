package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase Persona con atributos
 * <ol>
 * <li>nombre</li>
 * <li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * <li>email</li>
 * </ol>
 */

public class Persona {

	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String dni;
	protected String email;
	
	/**
	 * Constructor de Persona que tiene como parámetros
	 * @param nombre {@code String}
	 * @param apellido1 {@code String}
	 * @param apellido2 {@code String}
	 * @param dni {@code String}
	 * @param email {@code String}
	 */
	public Persona(String nombre, String apellido1, String apellido2, String dni, String email) {
		super();
		this.setNombre(nombre);
		this.setApellido1(apellido1);
		this.setApellido2(apellido2);
		this.dni = dni;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = Utilidades.capitalizarMio(nombre);
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = Utilidades.capitalizarMio(apellido1);
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = Utilidades.capitalizarMio(apellido2);
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", email=" + email + ", getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1()
				+ ", getApellido2()=" + getApellido2() + ", getDni()=" + getDni() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
}
