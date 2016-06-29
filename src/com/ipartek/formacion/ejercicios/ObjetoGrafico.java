package com.ipartek.formacion.ejercicios;

import java.io.Serializable;

import com.ipartek.formacion.nombreproyecto.pojo.Imprimible;

public abstract class ObjetoGrafico implements Imprimible, Serializable {
	//No se pueden crear objetos de la clase abstracta
	protected int x;
	protected int y;
	
	/**
	 * Movemos el objeto a las nuevas coordenadas
	 * @param x nueva coordenada en la abcisa x
	 * @param y nueva coordenada en la abcisa y
	 */
	public void mover(int x, int y){
		this.x = x;
		this.y = y;
	}
	/**
	 * Los hijos deberan implementar este metodo
	 */
	public abstract String dibujar();
	
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
