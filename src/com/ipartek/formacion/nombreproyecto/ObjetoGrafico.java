package com.ipartek.formacion.nombreproyecto.pojo;

import java.io.Serializable;

public abstract class ObjetoGrafico implements Imprimible, Serializable {

	protected int x;
	protected int y;
		
	/**
	 * Movemos el objeto a las nuevas coordenadas
	 * @param x nueva coordenada abcisa X
	 * @param y nueva coordenada abcisa y
	 */
	public void mover (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Los hijos deberan implemtar este metodo
	 */
	public abstract String dibujar();
	
	
	/* GETTERS y SETTERS */
	
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
