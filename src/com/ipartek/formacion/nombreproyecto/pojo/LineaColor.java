package com.ipartek.formacion.nombreproyecto.pojo;

public class LineaColor extends Linea {

	protected String color;
	
	
	 
	public LineaColor() {
		super();
		this.color = "ninguno";
		// TODO Auto-generated constructor stub
	}
	public LineaColor(int longitud) {
		super(longitud);
		this.color = "ninguno";
		// TODO Auto-generated constructor stub
	}	
	public LineaColor(String color) {
		super();
		this.color = color;
	}
	public LineaColor (int longitud, String color) {
		super(longitud);
		this.color = color;
	}
	
	
	@Override
	public String dibujar() {
		return (super.dibujar()+" color "+this.color);

	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
