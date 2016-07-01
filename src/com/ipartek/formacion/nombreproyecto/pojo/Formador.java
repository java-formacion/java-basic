package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona implements Icurso{

	private ArrayList<Curso> listaCursos;
	
	public Formador(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);		
		this.listaCursos = new ArrayList<Curso>();
	}
		

	public Formador(String nombre, String apellido1, String apellido2, String dni, String email,
			ArrayList<Curso> cursos) {
		super(nombre, apellido1, apellido2, dni, email);
		if ( cursos != null ){
			this.listaCursos = cursos;
		}else{
			this.listaCursos = new ArrayList<Curso>();
		}	
	}


	@Override
	public ArrayList<Curso> getCursos() {
		return listaCursos;
	}


	@Override
	public boolean asignarCurso(Curso curso) {
		if (listaCursos.add(curso)){
			return true;
		}else{
			return false;
		}
	}


	@Override
	public boolean desAsignarCurso(Curso curso) {
		if (listaCursos.remove(curso)==true){
			return true;
		}else{
			return false;
		}
	}
	
}
