package com.ipartek.formacion.nombreproyecto.pojo;

public class Perro {

	//Atributos
	private String nombre;
	private int edad;
	
	/**
	 * Crea un objeto de tipo Perro con edad 0 y nombre pasado por parametro
	 * @param nombre String nombre del perro
	 */
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.edad = 0;
	}

	//getters y setter
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	

	
	
	
}
