package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public interface ICurso {
	/**
	 * Retorna un listado con todos los cursos
	 * @return
	 */
	public ArrayList<Object> getCursos();
	/**
	 * Añade a la lista un nuevo curso
	 * @param curso
	 * @return
	 */
	public boolean asignarCurso(Object curso);
	/**
	 * Elimina de la lista un curso
	 * @param curso
	 * @return
	 */
	public boolean desAsignarCurso(Object curso);
}
