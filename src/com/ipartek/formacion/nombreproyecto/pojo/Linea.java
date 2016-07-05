package com.ipartek.formacion.nombreproyecto.pojo;

public class Linea extends ObjetoGrafico {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int longitud;
	

	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	@Override
	public String dibujar() {
		return "dibujamos linea de longitud"+this.longitud;
	}

}
