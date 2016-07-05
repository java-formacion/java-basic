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
		boolean retornar = false;
		if (curso != null) {
			return this.cursos.add(curso);
		}
		return retornar;

	}

	@Override
	public boolean desAsignarCurso(Curso curso) {
		boolean retornar = false;
		
           for (int i = 0; i < cursos.size(); ) {
        	   if (curso.getCodigo().equals(cursos.get(i).getCodigo()));
        	   cursos.remove(i);
        	   retornar = true;
        	   break;
           }
			
		
		
	
		/**
		 * 
		
			// es mejor hacerlo asi porque comparas con el curso que implementas
			if (curso.getCodigo().equals(c.getCodigo())) {
				// if (this.cursos.contains(cursos)){
				this.cursos.remove(curso);
				// retornar = true;
			}
         */
		

		return retornar;

	}

}
