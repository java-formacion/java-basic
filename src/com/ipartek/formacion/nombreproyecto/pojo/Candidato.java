package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase de tipo POJO para instanciar objetos que representan un Candidato Los
 * atributos de un Candidato:
 * <ol>
 * <li>nombre</li>
 * <li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * </ol>
 * 
 * @author Andoni Luna
 *
 */
public class Candidato extends Persona {
	
	private int nota;
	public final static int NOTA_MINIMA = 0;
	public final static int NOTA_APROBADO = 5;
	public final static int NOTA_MAXIMA = 10;
	
	// constructores
	public Candidato() {
		super();
		this.nota = NOTA_MINIMA;
	}
	public Candidato(String nombre, String dni) {
		super();
	}

	/**
	 * recuperamos el nombre del objeto
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambiamos el nombre pasandole un parametro
	 * 
	 * @param nombre
	 *            <String> cadena de texto con el nombre del candidato
	 */
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
	
	public int getNota() {
		return nota;
	}
	/**
	 * metodo set que controla que le pasemos una nota correcta y
	 * en caso de que los valores se salgan del rango los corrigue
	 * @param nota
	 */
	public void setNota(int nota) {
		if (nota>NOTA_MAXIMA){
			this.nota=NOTA_MAXIMA;
		}else if (nota<NOTA_MINIMA){
			this.nota=NOTA_MINIMA;
		}else{
			this.nota = nota;
		}
	}
	
	@Override
	public String toString() {
		return "Candidato [nota=" + nota + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", email=" + email + "]";
	}
	/**
	 * Funcion booleana que devuelve true si {@code int} nota>={@code int}NOTA_APROBADO
	 * @return boolean dev
	 */
	public boolean isAceptado() {
		boolean dev=false;
		if (this.nota>=NOTA_APROBADO){
			dev=true;
		}
		return dev;
	}
}
