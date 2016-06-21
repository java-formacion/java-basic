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
	
	
	
	/**
	 * recuperamos el nombre del objeto
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


	public String apellido2;
	public String dni;
	
	
	//constructor
	public Candidato(){
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";
	}
	
}
