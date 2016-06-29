package com.ipartek.formacion.nombreproyecto.pojo;

public class Linea extends ObjetoGrafico {

	protected int longitud;
	
	@Override
	public String dibujar() {
		return "Dibujamos linea longitud "+ this.longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
