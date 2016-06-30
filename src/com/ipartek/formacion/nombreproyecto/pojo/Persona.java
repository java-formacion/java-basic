package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

public class Persona {
	
	//Atributos
	protected String nombre;
	protected String ape1;
	protected String ape2;
	protected String dni;
	protected String email;
	
	//Constructor con parametros nombre y ape1
	public Persona(String nombre, String ape1) {
		super();
		setNombre(nombre);
		setApellido1(ape1);
		this.ape2 = "";
		this.dni = "";
		this.email = "";
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = Utilidades.capitalizar(nombre);			
	}

	public String getApellido1() {
		return ape1;
	}

	public void setApellido1(String apellido1) {
		
		this.ape1 = Utilidades.capitalizar(apellido1);
	}

	public String getApellido2() {
		return ape2;
	}

	public void setApellido2(String apellido2) {
		this.ape2 = Utilidades.capitalizar(apellido2);
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
		return "Persona [nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", dni=" + dni + ", email=" + email
				+ "]";
	}

}
