package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public interface ICurso {

	/**
	 * retorna un listado con todos los cursos
	 * @return
	 */
	public ArrayList<Curso> getCursos();
	/**
	 * Añade a la lista un nuevo curso
	 * @param curso
	 * @return
	 */
	public boolean asignarCurso(Curso curso);
	/**
	 * Eliminar de la lista un curso
	 * @param curso
	 * @return
	 */
	public boolean desAsignarCurso(Curso curso);
}
