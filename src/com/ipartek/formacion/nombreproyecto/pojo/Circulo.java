package com.ipartek.formacion.nombreproyecto.pojo;

public class Circulo extends ObjetoGrafico {

	public static int RADIO_DEFECTO = 1;
	
	private int radio;

	

	public Circulo() {
		super();
		radio = RADIO_DEFECTO;
	}



	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}



	@Override
	public String dibujar() {
		return "dibujamos círculo radio " + this.radio;		
	}


	


}
