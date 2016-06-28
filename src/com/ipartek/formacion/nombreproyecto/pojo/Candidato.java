package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase de tipo POJO para instanciar objetos que representan un Candidato
 * Los atributos de un Candidato:
 * <ol>
 * 	 <li>nombre</li>
 *   <li>apellido1</li>
 *   <li>apellido2</li>
 *   <li>dni</li> 
 * </ol>
 * @author Ander Uraga Real
 *
 */
public class Candidato {

	
	//atributos
	private String nombre;
	public String apellido1;
	public String apellido2;
	public String dni;
	
	
	//constructor por defecto
	
	public Candidato(){
		super();
	}
	
	public Candidato(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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




	@Override
	public String toString() {
		return "Candidato [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ "]";
	}


	

	
}
