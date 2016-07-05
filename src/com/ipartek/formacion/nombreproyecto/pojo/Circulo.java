package com.ipartek.formacion.nombreproyecto.pojo;

public class Circulo extends ObjetoGrafico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int radio;
		
	
	public Circulo() {
		this.radio = 0;
	
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
