package com.ipartek.formacion.nombreproyecto.pojo;

public class LineaColor extends Linea {

	public static String COLOR_DEFECTO = "rojo";
	
	private String color;

	
	public LineaColor() {
		super();
		color = COLOR_DEFECTO;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 
	
	@Override
	public String dibujar() {
		return super.dibujar() + " de color " + this.color;
	}
	
}
