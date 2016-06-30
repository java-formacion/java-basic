package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona implements ICurso {

	private ArrayList<Curso> alCursos = new ArrayList<Curso>();

	
	
	public Formador(String nom, String apell1, String apell2, String dni, String email) {
		super(nom, apell1, apell2, dni, email);
	}



	public Formador(String nom, String apell1, String apell2, String dni, String email,
			ArrayList<Curso> alCursos) {
		super(nom, apell1, apell2, dni, email);
		this.alCursos = alCursos;
	}



	/**
	 * @param alAsignaturas the alAsignaturas to set
	 */
	public void setCursos(ArrayList<Curso> alCursos) {
		this.alCursos = alCursos;
	}



	@Override
	public ArrayList<Object> getCursos() {
		
		return this.getCursos();
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
