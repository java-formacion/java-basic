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
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = "";
		this.dni = "";
		this.email = "";
	}

	//Constructor sin parametros 
	public Persona() {
		super();
		this.nombre = "";
		this.ape1 = "";
		this.ape2 = "";
		this.dni = "";
		this.email = "";
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Utilidades.capitalizar(nombre);		
		this.nombre = nombre;
	}

	public String getApellido1() {
		return ape1;
	}

	public void setApellido1(String apellido1) {
		Utilidades.capitalizar(apellido1);
		this.ape1 = apellido1;
	}

	public String getApellido2() {
		return ape2;
	}

	public void setApellido2(String apellido2) {
		Utilidades.capitalizar(apellido2);
		this.ape2 = apellido2;
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
		Utilidades.validarEmail(email);
		this.email = email;
	}

}
