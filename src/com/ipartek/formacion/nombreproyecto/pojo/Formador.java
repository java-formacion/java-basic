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
	public boolean asignarCurso(Curso curso) {
		this.cursos.add(curso);
		return true;
	}

	@Override
	public boolean desAsignarCurso(Curso curso) {
		if (this.cursos.isEmpty() && !(curso == null)) {
			return false;
		} else {
			this.cursos.remove(curso);
		}
		return true;
	}

	@Override
	public ArrayList<Curso> getCursos() {
		return this.cursos;
	}
	
	
}
