package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona implements Icurso {

	private ArrayList<Curso> cursos;

	public Formador(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);
		this.cursos = new ArrayList<Curso>();
	}

	public Formador(String nombre, String apellido1, String apellido2, String dni, String email,
			ArrayList<Curso> cursos) {
		super(nombre, apellido1, apellido2, dni, email);
		if (cursos != null) {
			this.cursos = cursos;
		} else {
			this.cursos = new ArrayList<Curso>();
		}
	}

	@Override
	public ArrayList<Curso> getCursos() {
		return this.cursos;
	}

	@Override
	public boolean asignarCurso(Curso curso) {
		boolean resul = false;
		if (curso != null) {
			resul = this.cursos.add(curso);
		}
		return resul;
	}

	@Override
	public boolean desAsignarCurso(Curso curso) {
		boolean resul = false;
		
		if (cursos.indexOf(curso) != -1) {
			resul = cursos.remove(curso);			
		}

		return resul;
	}

}
