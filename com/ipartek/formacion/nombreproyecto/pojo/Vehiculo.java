package com.ipartek.formacion.nombreproyecto.pojo;

public class Vehiculo implements IArrancable{
	
	protected String nombre;
	private int numPlazas;
	private float potencia, dimensiones;


	public Vehiculo(String nombre, int numPlazas, float potencia, float dimensiones) {
		super();
		this.nombre = nombre;
		this.numPlazas = numPlazas;
		this.potencia = potencia;
		this.dimensiones = dimensiones;
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

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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




	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void checkConductor() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void encenderLuces() {
		// TODO Auto-generated method stub
		
	}



}
