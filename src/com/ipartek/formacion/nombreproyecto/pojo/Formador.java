package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

/**
 * Formador de un curso, hija de Persona. Atributos:<br>
 * <ul>
 *  <li>nombre</li> heredado 
 *  <li>apellido1</li> heredado 
 *  <li>apellido2</li> heredado 
 *  <li>dni</li> heredado 
 *  <li>email</li> heredado
 *  <li>cursos</li>
 * <ul>
 * @author Curso
 *
 */
public class Formador extends Persona implements ICurso {
	
	private ArrayList<Curso> listaCursos = new ArrayList<Curso>();
		

	//	Constructor sin parametro ArrayList
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);		
		this.listaCursos = new ArrayList<Curso>();
	}
		

	//	Constructor con parametro ArrayList
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email, ArrayList<Curso> cursos) {
		super(nombre, apellido1, apellido2, dni, email);
		if (cursos != null){
			this.listaCursos = cursos;
		}else{
			this.listaCursos = new ArrayList<Curso>();
		}
		
	}


	@Override
	public ArrayList<Curso> getCursos() {
		return this.listaCursos;
	}


	@Override
	public boolean asignarCurso(Curso curso) {
		boolean resul = false;
		if (curso != null){
				resul = this.listaCursos.add(curso);
		}
		return resul;	
	}


	@Override
	public boolean desAsignarCurso(Curso curso) {
		boolean resul = false;
		if (this.listaCursos.indexOf(curso) != -1){
			resul = this.listaCursos.remove(curso);
		}
		
		return resul;	
		
	}
	



}
