package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoElectrico extends Vehiculo {

	
	private float capacidadBateria;

	public VehiculoElectrico() {
		super();
		this.capacidadBateria = 150f;
	}
	
	

	public VehiculoElectrico(String nombre) {
		super(nombre);
		this.capacidadBateria = 150f;
	}



	/**
	 * @return the capacidadBateria
	 */
	public float getCapacidadBateria() {
		return capacidadBateria;
	}

	/**
	 * @param capacidadBateria the capacidadBateria to set
	 */
	public void setCapacidadBateria(float capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}
	
	
	public static void main (String[] args){
		
		VehiculoElectrico ve = new VehiculoElectrico();
		ve.getNumPlazas();
	}
	
	
	
	
	
}
