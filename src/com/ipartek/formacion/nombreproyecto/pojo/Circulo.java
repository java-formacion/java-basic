package com.ipartek.formacion.nombreproyecto.pojo;

public class Circulo extends ObjetoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		
	}



	
}
