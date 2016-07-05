package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoElect extends Vehiculo {

	private float capacidBat;
	
	public VehiculoElect(String nombre, int numPlazas, float potencia, float dimensiones) {
		super(nombre, numPlazas, potencia, dimensiones);
		capacidBat=150f;
		
		
	}

	public float getCapacidBat() {
		return capacidBat;
	}

	public void setCapacidBat(float capacidBat) {
		this.capacidBat = capacidBat;
	}
	
	

}
