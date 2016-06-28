package com.ipartek.formacion.nombreproyecto.pojo;

import sun.applet.Main;

public class VehiculoElectrico extends Vehiculo {

	private float capacidadBateria;

	public VehiculoElectrico() {
		super();
		numPlazas = 2; //Atributo del padre
		capacidadBateria = 150f;
	}

	public float getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(float capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}
	
	public static void main(String[] args){
		
		VehiculoElectrico ve = new VehiculoElectrico();
		ve.getNumPlazas();
		System.out.println(ve.getNumPlazas());
	}
	
	
	
}
