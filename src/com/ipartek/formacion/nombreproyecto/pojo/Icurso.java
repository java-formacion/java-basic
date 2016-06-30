package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public interface Icurso {

	/**
	 * Nos devuelve un listado de cursos
	 * @return
	 */
	public ArrayList<Curso> getCursos();
	
	/**
	 * Añade a la lista un nuevo Curso
	 * @param curso
	 * @return
	 */
	public boolean asignarCurso(Curso curso);
	
	/**
	 * Elimina de la lista un Curso
	 * @param curso
	 * @return
	 */
	public boolean desasignarCurso(Curso curso);
	

	
	
}
