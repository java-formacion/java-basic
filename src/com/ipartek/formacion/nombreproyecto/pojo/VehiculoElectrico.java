package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoElectrico extends Vehiculo {
	
	private float capacidadBateria;

	public VehiculoElectrico() {
		super();
		capacidadBateria = 150f;
	}
	public VehiculoElectrico(String nombre) {
		super(nombre);
		capacidadBateria = 150f;
	}

	public float getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(float capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}
	public static void main(String[] args) {
		VehiculoElectrico ve = new VehiculoElectrico();
		ve.getNumPlazas();
	}
}
