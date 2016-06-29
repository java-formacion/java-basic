package com.ipartek.formacion.nombreproyecto.pojo;

public abstract class ObjetoGrafico {
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
	public abstract void dibujar();
	
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
