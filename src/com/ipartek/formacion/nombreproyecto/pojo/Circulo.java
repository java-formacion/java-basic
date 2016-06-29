package com.ipartek.formacion.nombreproyecto.pojo;

public class Circulo extends ObjetoGrafico {

	protected int radio;
		
	
	public Circulo() {
		this.radio = 0;
		// TODO Auto-generated constructor stub
	}

	
	
	public Circulo(int radio) {
		this.radio = radio;
	}



	@Override
	public String dibujar() {
		return("Dibujamos circulo de radio "+this.radio);

	}

	/**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	

}
