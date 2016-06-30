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

	/* (non-Javadoc)
	 * @see com.ipartek.formacion.nombreproyecto.pojo.Icurso#getCursos()
	 */
	@Override
	public ArrayList<Curso> getCursos() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ipartek.formacion.nombreproyecto.pojo.Icurso#asignarCurso(com.ipartek.formacion.nombreproyecto.pojo.Curso)
	 */
	@Override
	public boolean asignarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.ipartek.formacion.nombreproyecto.pojo.Icurso#desAsignarCurso(com.ipartek.formacion.nombreproyecto.pojo.Curso)
	 */
	@Override
	public boolean desAsignarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return false;
	}

}
