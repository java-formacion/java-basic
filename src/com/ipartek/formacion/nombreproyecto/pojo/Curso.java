package com.ipartek.formacion.nombreproyecto.pojo;

public class Curso {
	private String nombre;
	private int codigo;
	private String horas;
	public Curso() {
		super();
		this.nombre = "";
		this.codigo = 0;
		this.horas = "";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getHoras() {
		return horas;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + "]";
	}
	
}
