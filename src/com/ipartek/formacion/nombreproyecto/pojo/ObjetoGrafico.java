package com.ipartek.formacion.nombreproyecto.pojo;

import java.io.Serializable;

public abstract class ObjetoGrafico implements Imprimible, Serializable{

	protected int x;
	protected int y;
	
	//no hacemos constructor porque no se puede instanciar
	
	/**
	 * Movemos el objeto a las nuevas coordenadas
	 * @param x nueva coordenada abcisa x
	 * @param y nueva coordenada abcisa y
	 */
	public void mover(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * Los hijos deberán implementar este método
	 */
	public abstract String dibujar();
	
	
	//getters y setters
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
