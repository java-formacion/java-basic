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

	// Metodos añadidos al implementar "ICurso"
	@Override
	public ArrayList<Curso> getCursos() {

		for (int i = 0; i < cursos.size(); i++) {
			//System.out.println(cursos.get(i));
		}

		return this.cursos;
	}

	@Override
	public boolean asignarCurso(Curso curso) {
		
		boolean resul = false;
		if ( curso != null ){
			resul = cursos.add(curso);
		}	
		return resul;
	}

	@Override
	public boolean desAsignarCurso(Curso codigo) {
		boolean resul = false;
		if (cursos.indexOf(codigo) != -1){
		cursos.remove(codigo);
		resul = true;
		}

		return resul;
	}

}
