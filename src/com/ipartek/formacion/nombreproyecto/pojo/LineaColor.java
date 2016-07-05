package com.ipartek.formacion.nombreproyecto.pojo;

public class LineaColor extends Linea {
	

	private static final long serialVersionUID = 7662548337454821111L;
	private String color;
	
	@Override
	public String dibujar() {
		return super.dibujar() + " de color " + this.color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
		
	
}
