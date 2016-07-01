package com.ipartek.formacion.nombreproyecto.pojo;

public class LineaColor extends Linea{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String dibujar() {
		// TODO Auto-generated method stub
		return super.dibujar() +" y color "+this.color;
	}


}
