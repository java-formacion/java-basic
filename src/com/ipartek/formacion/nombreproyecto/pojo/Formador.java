package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona {

	private ArrayList<Curso> cursos;
	
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);		
		this.cursos = new ArrayList<Curso>();
	}
		

	public Formador(String nombre, String apellido1, String apellido2, String dni, String email,
			ArrayList<Curso> cursos) {
		super(nombre, apellido1, apellido2, dni, email);
		if ( cursos != null ){
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
	
		
	

}
