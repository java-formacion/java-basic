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
		

	//Constructor con parametros
	public Formador(String nombre, String ape1, ArrayList<Curso> cursos) {
		super(nombre, ape1);
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
	public boolean asignarCurso(Object curso) {
		
		return false;
	}

	@Override
	public boolean desAsignarCurso(Object curso) {
		// TODO Auto-generated method stub
		return false;
	}

}
