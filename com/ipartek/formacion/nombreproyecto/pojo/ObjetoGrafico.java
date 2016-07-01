package com.ipartek.formacion.nombreproyecto.pojo;

import java.io.Serializable;

public abstract class ObjetoGrafico implements Imprimible, Serializable {

	protected int x, y;

	/**
	 * movemos el objeto a las nuevas coordenadas
	 * @param x nueva coordenada abscisa x
	 * @param y nueva coordenada ordenada y
	 */
	public void mover (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	abstract String dibujar();
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
