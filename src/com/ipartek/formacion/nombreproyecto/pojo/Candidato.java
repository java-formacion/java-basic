package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

/**
 * Clase de tipo POJO para instanciar objetos que representan un Candidato
 * <br/>Los atributos de un Candidato:
 * <ol>
 * 	<li>nombre</li>
 *  <li>apellido1</li>
 *  <li>apellido2</li>
 *  <li>dni</li>
 * </ol>
 * @author Borja Manso
 *
 */

public class Candidato {

	//Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	
	//Constructor por defecto
	public Candidato(){
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";
	}

	//Constructor con parametros
	public Candidato(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Utilidades.capitalizar(nombre);		
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		Utilidades.capitalizar(apellido1);
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		Utilidades.capitalizar(apellido2);
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
