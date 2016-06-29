package com.ipartek.formacion.nombreproyecto.pojo;

public class Triangulo extends ObjetoGrafico {

	protected int a;
	protected int b;
	protected int c;
	
	
	public Triangulo() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		
	}


	public Triangulo(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	@Override
	public String dibujar() {
		return ("Dibujamos triángulo de características: a= "+this.a+" b= "+this.b+" c= "+this.c+".");

	}


	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}


	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}


	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}


	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}


	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}


	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	
	

}
