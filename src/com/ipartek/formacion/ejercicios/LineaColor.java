package com.ipartek.formacion.ejercicios;

public class LineaColor extends Linea {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String dibujar(){
		return super.dibujar()+" color "+this.color;
	}
}
