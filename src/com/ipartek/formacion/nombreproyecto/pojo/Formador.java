package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public class Formador extends Persona {
	private ArrayList cursos= new ArrayList();
	public Formador() {
		super();
		this.cursos=cursos;
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
