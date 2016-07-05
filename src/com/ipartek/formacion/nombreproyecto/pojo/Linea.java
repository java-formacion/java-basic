package com.ipartek.formacion.nombreproyecto.pojo;

public class Linea extends ObjetoGrafico {

	
	private static final long serialVersionUID = 405711605128605374L;

	public static int LONGITUD_MINIMA = 1;
	
	protected int longitud; //como va a tener hija, que lo tenga accesible
	
	
	
	public Linea() {
		super();
		longitud = LONGITUD_MINIMA;
	}

	@Override
	public String dibujar() {
		
		return "dibujamos línea longitud " + this.longitud;

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	

}
