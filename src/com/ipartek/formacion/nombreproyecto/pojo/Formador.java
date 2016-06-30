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
	
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
		

	//Constructor con parametros
	public Formador(String nombre, String ape1, ArrayList<Curso> cursos) {
		super(nombre, ape1);
		if (cursos != null){
			this.cursos = cursos;
		}else{
			this.cursos = new ArrayList<Curso>();
		}
		
	}
	
	
	//Getters y setters
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	

	@Override
	public ArrayList<Object> getCursos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean asignarCurso(Object curso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desAsignarCurso(Object curso) {
		// TODO Auto-generated method stub
		return false;
	}

}
