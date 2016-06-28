package com.ipartek.formacion.nombreproyecto.pojo;

public class Vehiculo {

	//atributos protected para que la clase hija las herede
	protected int numPlazas;
	protected float potencia;
	protected float dimensiones;
	
	public Vehiculo() {
		super();
		numPlazas = 1;
		potencia = 0f;
		dimensiones = 0f;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
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
		return "Vehiculo [numPlazas=" + numPlazas + ", potencia=" + potencia + ", dimensiones=" + dimensiones + "]";
	}
	
	
	
	
	
}
