package com.ipartek.formacion.nombreproyecto.pojo;

public class Linea extends ObjetoGrafico {
	
	protected int longitud;
	

	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	@Override
	public String dibujar() {
		// TODO Auto-generated method stub
		return "dibujamos linea de longitud"+this.longitud;
		
	}

}
