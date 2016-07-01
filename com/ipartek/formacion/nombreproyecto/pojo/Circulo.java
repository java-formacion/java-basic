package com.ipartek.formacion.nombreproyecto.pojo;

public class Circulo extends ObjetoGrafico {

	protected int radio;

	
	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	@Override 
	public String dibujar() {
		return"dibujamos circulo de radio"+this.radio;
		// TODO Auto-generated method stub
		
	}



	
}
