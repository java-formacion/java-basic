package com.ipartek.formacion.nombreproyecto.pojo;

public class Vehiculo {
	
	protected String nombre; 
	protected int   numPlazas;
	protected float potencia;
	protected float dimensiones;
	
	public Vehiculo() {
		super();
		nombre="";
		numPlazas = 1;
		potencia = 0f;
		dimensiones = 0f;
	}
	
	public Vehiculo(String nombre) {
		this();		
		this.nombre=nombre;		
	}
	

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(float dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", numPlazas=" + numPlazas + ", potencia=" + potencia + ", dimensiones="
				+ dimensiones + "]";
	}
	

}
