package com.ipartek.formacion.nombreproyecto.pojo;

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
	
	/**
	 * Recuperamos el nombre del objeto
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambiamos el nombre pasandole un parametro
	 * @param nombre <String> cadena de texto con el nombre del Candidato
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Recuperamos el primer apellido del objeto
	 * @return
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Cambiamos el primer apellido pasandole un parametro
	 * @param apellido1 <String> cadena de texto con el primer apellido del Candidato
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	/**
	 *Recuperamos el segundo apellido del objeto 
	 * @return
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Cambiamos el segundo apellido pasandole un parametro
	 * @param apellido2 <String> cadena de texto del segundo apellido del Candidato
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Recuperamos el dni del objeto
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Cambiamos el dni pasandole un parametro
	 * @param dni <String> cadena de texto del dni del Candidato
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	//Constructor
	public Candidato(){
		this.nombre = "anonimo";
		this.apellido1 = "apellido";
		this.apellido2 = "apellido";
		this.dni = "11111111A";
	}
	
}
