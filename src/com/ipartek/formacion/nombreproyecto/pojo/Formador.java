package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

/**
 * Clase Formador, es hija de Persona
 *
 */

public class Formador extends Persona {

	/**
	 * ArrayList de objetos Curso
	 */
	private ArrayList<Curso> cursos;

	/**
	 * Constructor de Formador. Asignará un {@code ArrayList} sin elementos
	 * @param nombre {@code String}
	 * @param apellido1 {@code String}
	 * @param apellido2 {@code String}
	 * @param dni {@code String}
	 * @param email {@code String}
	 */
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);
		this.cursos = new ArrayList<Curso>();
	}
	
	/**
	 * Constructor de Formador.
	 * @param nombre {@code String}
	 * @param apellido1 {@code String}
	 * @param apellido2 {@code String}
	 * @param dni {@code String}
	 * @param email {@code String}
	 * @param cursos {@code ArrayList<Curso>}
	 */

	public Formador(String nombre, String apellido1, String apellido2, String dni, String email,
			ArrayList<Curso> cursos) {
		super(nombre, apellido1, apellido2, dni, email);
		if(cursos != null){
			this.cursos = cursos;
		}else{
			this.cursos = new ArrayList<Curso>();
		}
		
	}



	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return super.toString() + " Formador [cursos=" + cursos.toString() + "]";
	}
	
	
	
}
