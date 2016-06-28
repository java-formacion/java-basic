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
	private String apellido1;
	private String apellido2;
	private String dni;
	
	//constructor por defecto
	public Candidato(){
		super();
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";
	}
	
	//constructor con parámetros
	public Candidato(String nombre, String dni) {
		this();
		this.nombre = Utilidades.capitalizar(nombre);
		this.dni = dni;
	 
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
	
	
	

	
	
	
}
