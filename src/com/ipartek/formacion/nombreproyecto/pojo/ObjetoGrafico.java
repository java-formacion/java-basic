package com.ipartek.formacion.nombreproyecto.pojo;

import java.io.Serializable;

public abstract class ObjetoGrafico implements Imprimible, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int x;
	protected int y;
	
	/**
	 * movemos el objeto a las nuevas coordenadas
	 * @param x nueva coordenada abcisa X
	 * @param y nueva coordenda abcisa Y
	 */
	public void mover (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Los hijos deberán implementar este método
	 */
	public abstract String dibujar();
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
