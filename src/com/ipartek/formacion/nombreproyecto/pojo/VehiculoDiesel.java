package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoDiesel extends Vehiculo {
	
	private float combustible;

	public VehiculoDiesel() {
		super();
		combustible = 10f;
	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}
	
	

}
