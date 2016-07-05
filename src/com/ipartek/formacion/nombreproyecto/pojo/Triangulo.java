package com.ipartek.formacion.nombreproyecto.pojo;

public class Triangulo extends ObjetoGrafico {

	
	private static final long serialVersionUID = 5467616236716639305L;

	public static int LONG_LADO = 1;
	
	private int longitudLado;
	
	
	public Triangulo() {
		super();
		longitudLado = LONG_LADO;
	}




	public int getLongitudLado() {
		return longitudLado;
	}




	public void setLongitudLado(int longitudLado) {
		this.longitudLado = longitudLado;
	}


	@Override
	public String dibujar() {
		return "dibujamos un triángulo con longitud de lado " + this.longitudLado;

	}

}
