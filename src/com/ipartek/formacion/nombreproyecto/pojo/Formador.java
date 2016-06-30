package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona {
	private ArrayList<Curso> cursos;
	public Formador() {
		super();
		this.cursos=new ArrayList<Curso>();
	}
	public ArrayList getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList cursos) {
		this.cursos = cursos;
	}
	@Override
	public String toString() {
		return "Formador [cursos=" + cursos + "]";
	}
}
