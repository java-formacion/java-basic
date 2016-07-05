package com.ipartek.formacion.nombreproyecto.pojo;

public class Circulo extends ObjetoGrafico {

	
	private static final long serialVersionUID = 331657781553077660L;

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
