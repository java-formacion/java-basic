package com.ipartek.formacion.ejercicios;

public class Circulo extends ObjetoGrafico {

	protected int area;
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String dibujar() {
		return "Dibujamos el Circulo area "+this.area;
	}

}
