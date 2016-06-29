package com.ipartek.formacion.ejercicios;

public class Cuadrado extends ObjetoGrafico {

	protected int superficie;
	
	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	@Override
	public String dibujar() {
		return"Dibujamos el Cuadrado superficie "+this.superficie;
	}

}
