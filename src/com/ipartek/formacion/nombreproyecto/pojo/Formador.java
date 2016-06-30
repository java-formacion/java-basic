package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona implements ICurso {

	private ArrayList<Curso> alCursos = new ArrayList<Curso>();

	
	
	public Formador(String nom, String apell1, String apell2, String dni, String email) {
		super(nom, apell1, apell2, dni, email);
		this.alCursos = new ArrayList<Curso>();
	}



	public Formador(String nom, String apell1, String apell2, String dni, String email,
			ArrayList<Curso> alCursos) {
		super(nom, apell1, apell2, dni, email);
		if (alCursos != null){
			this.alCursos = alCursos;
		}else{
		this.alCursos = new ArrayList<Curso>();
		}
	}



	



	@Override
	public ArrayList<Curso> getCursos() {
		
		return this.alCursos;
	}



	@Override
	public boolean asignarCurso(ArrayList<Curso> curso) {
		
		boolean asignado = false;
		if (curso != null){
			for (int i=0; i<curso.size(); i++){
				
				
				
			}
		}
		
		
		return false;
	}



	@Override
	public boolean desAsignarCurso(ArrayList<Curso> curso) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
