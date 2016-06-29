package com.ipartek.formacion.ejercicios;

public class Linea extends ObjetoGrafico {

	protected int longitud;
	
	@Override
	public String dibujar() {
		return "Dibujamos la línea longitud "+this.longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
}
