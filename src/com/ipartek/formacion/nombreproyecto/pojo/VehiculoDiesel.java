/**
 * 
 */
package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * @author Curso
 *
 */
public class VehiculoDiesel extends Vehiculo {
	/**
	 * Litros minimos de (int){@code deposito}
	 */
	public final static int DEPOSITO_MINIMO = 50;
	
	/**
	 * Capacidad en litros de combustible
	 */
	private int deposito;

	/**
	 * Lo mismo que el padre, pero con el deposito = {@code DEPOSITO_MINIMO}
	 */
	public VehiculoDiesel() {
		super();
		this.deposito = DEPOSITO_MINIMO;

	}
	

	public VehiculoDiesel (String nombre) {
		super(nombre);
		this.deposito = DEPOSITO_MINIMO;
		
	}


	/**
	 * @return the combustible
	 */
	public int getDeposito() {
		return deposito;
	}

	/**
	 * @param combustible the combustible to set
	 */
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	
	
}
