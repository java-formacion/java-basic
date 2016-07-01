package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

/**
 * Clase que hace referencia a la persona que imparte el curso
 * 
 * @see Persona
 * 
 *      Implementa la interfaz {@code} Icurso para poder añadirle o quitarle
 *      cursos
 * 
 * @author Daniel
 *
 */
public class Formador extends Persona implements Icurso {

	private ArrayList<Curso> cursoAsg = new ArrayList<Curso>();

	@Override
	public ArrayList<Curso> getCursos() {
		return cursoAsg;
		
	}
	

	@Override
	public boolean asignarCurso(Object curso) {
		cursoAsg.add((Curso) curso);

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desasignarCurso(Object curso) {
		if (curso != null){
			if (cursoAsg.contains((Curso) curso)){
				if (((Curso) curso).getCodigo().equals(((Curso) curso).getCodigo())) {
				cursoAsg.remove(curso);
				}
			}
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	public Formador(String nombre, String dni, String ap1, String ap2) {
		super(nombre, dni, ap1, ap2);
		// TODO Auto-generated constructor stub
	}

/**
 * Pasa una lista ya definida de cursos a la variable formador 
 * @param cursoAsg
 */
	public void setCursoAsg(ArrayList<Curso> cursoAsg) {
		this.cursoAsg = cursoAsg;
	}

}
