package com.ipartek.formacion.nombreproyecto.pojo;

public class Vehiculo implements IArrancable{

	protected String nombre;
	protected int numPlazas;
	protected float potencia;
	protected float dimensiones;
	
	public Vehiculo() {
		super();
		nombre = "";
		numPlazas = 1;
		potencia = 0f;
		dimensiones = 0f;
	}

	
	public Vehiculo(String nombre) {
		super();
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

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", numPlazas=" + numPlazas + ", potencia=" + potencia + ", dimensiones="
				+ dimensiones + "]";
	}


	@Override
	public void arrancar() {
		System.out.println("Arrancado");
		
	}


	@Override
	public void checkOutConductor() {
		
		
	}


	@Override
	public void encenderLuces() {
		
		
	}


	@Override
	public void sonarClaxon() {
		
		
	}
	
	
	
	
	
}
