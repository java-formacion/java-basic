package com.ipartek.formacion.apppersona;

public class Persona {

	//Constantes para el rango de las notas
	public static final int NOTA_MIN = 0, NOTA_MAX = 10, NOTA_ACP = 5;
	
	private String nombre, apellido1, apellido2, dni, email;
	private int nota;
	
	
	public Persona(String nombre, String apellido1, String apellido2, String dni, String email, int nota) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2; 
		this.dni = dni;
		this.email = email;
		this.nota = nota;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	public boolean isAceptado() {
		boolean resul = false;
		if (this.nota >= NOTA_ACP){
			resul = true;
		}
		return resul;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", email=" + email + ", nota=" + nota + ", " + isAceptado() + "]";
	}


	
	
}
