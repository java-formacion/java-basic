package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona implements Icurso {

	private ArrayList<Curso> cursos;

	//Constructor para Formador sin cursos
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);
		this.cursos = new ArrayList<Curso>();
	}
	
	//Constructor para Formador con cursos
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email,
			ArrayList<Curso> cursos) {
		super(nombre, apellido1, apellido2, dni, email);
		if (cursos != null) {
			this.cursos = cursos;
		} else {
			this.cursos = new ArrayList<Curso>();
		}
	}

	//Metodos que implementa el interface Icurso.java
			//   -  getCursos()
			//   -  asignarCurso(Curso curso)
			//   -  desAsignarCurso(Curso curso)
	@Override
	public ArrayList<Curso> getCursos() {
		return this.cursos;
	}

	@Override
	public boolean asignarCurso(Curso curso) {
		boolean resul = false;
		boolean existe = false;
		if (curso != null) {
			for (Curso c : cursos) {
				if( curso.equals(c)){
					existe=true;
					break;
				}
					
			}		
			
			if (!existe){
				resul = this.cursos.add(curso);
			}
		}
		return resul;
	}

	@Override
	public boolean desAsignarCurso(Curso curso) {
		boolean resul = false;
		if (curso != null) {
			for (int i = 0; i < cursos.size(); i++) {
				if (curso.getCodigo().equals(cursos.get(i).getCodigo())) {
					cursos.remove(i);
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

}
	
		

		