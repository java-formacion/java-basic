package com.ipartek.formacion.nombreproyecto.pojo;

public class Linea extends ObjetoGrafico {

	protected int longitud;
	
	
	
	public Linea() {
		this.longitud = 0;
		// TODO Auto-generated constructor stub
	}

	public Linea(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public String dibujar() {
		return("Dibujamos linea longitud "+this.longitud);

	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	

}
