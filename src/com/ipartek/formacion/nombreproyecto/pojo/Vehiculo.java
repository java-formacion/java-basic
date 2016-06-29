package com.ipartek.formacion.nombreproyecto.pojo;

public class Vehiculo implements IArrancable{
	protected String nombre;
	private int numPlazas;
	private float potencia;
	private float dimensiones;
	
	public Vehiculo(){
		super();
		nombre="";
		numPlazas=1;
		potencia=0f;
		dimensiones=0f;
	}
	public Vehiculo(String nombre) {
		this();
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Vehiculo [nombre=" + nombre + ", numPlazas=" + numPlazas + ", potencia=" + potencia + ", dimensiones="
				+ dimensiones + "]";
	}
	@Override
	public void arrancar() {
		System.out.println("Arrancar");
		
	}
	@Override
	public void comprobarConductor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void encenderLuces() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sonarClaxon() {
		// TODO Auto-generated method stub
		
	}
}
