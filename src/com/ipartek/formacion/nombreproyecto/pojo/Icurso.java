package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public interface Icurso {
	/**^
	 * da un listado con los cursos
	 * @return
	 */
	public ArrayList<Curso> getCursos();	
	/**
	 * añade un curso
	 * @param curso
	 * @return
	 */
	public boolean asignarCurso (Object curso);
	
	/**
	 * lo elimina
	 * @param curso
	 * @return
	 */
	public boolean desasignarCurso(Object curso);
	
	

}
