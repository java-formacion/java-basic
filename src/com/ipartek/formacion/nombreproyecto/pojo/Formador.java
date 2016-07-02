package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona implements ICurso {

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
		// TODO Auto-generated method stub
		return this.cursos;
	}

	@Override
	public boolean asignarCurso(Curso curso) {

		boolean asignado = false;
		boolean encontrado = false;

		if (curso != null) {

			for (int i = 0; i < this.cursos.size(); i++) {

				if (this.cursos.get(i).equals(curso)) {	//(curso.getCodigo().equalsthis.cursos.get(i).getCodigo()

					encontrado = true;
					break;
				
				}

			}
			
			if (!encontrado){
				
				asignado = 	this.cursos.add(curso);
			}
		}

		return asignado;

	}

	@Override
	public boolean desAsignarCurso(Curso curso) {

		boolean desasignado = false;

		if (curso!=null){
			
			if (this.cursos.contains(curso)) {		// se puede hacer con indexOf

				desasignado = this.cursos.remove(curso);

			}
		}
		

		return desasignado;
	}

}
