package com.ipartek.formacion.nombreproyecto.pojo;

import java.io.Serializable;

public abstract class ObjetoGrafico implements Imprimible, Serializable {


	private static final long serialVersionUID = -3541031124091922673L;
	protected int x;
	protected int y;
	
	
	/**
	 * Movemos el objeto a las nuevas coordenadas
	 * @param x {@code int} nueva coordenada abcisa x
	 * @param y {@code int} nueva coordenada abcisa y
	 */
	public void mover (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Los hijos deberan implementar este metodo
	 */
	public abstract String dibujar();
	
	
	//Getters y setters
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
