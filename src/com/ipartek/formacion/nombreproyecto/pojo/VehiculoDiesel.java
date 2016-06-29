package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoDiesel extends Vehiculo {

	/**
	 * Litros minimos (int){@code deposito}
	 */
	public final static int DEPOSITO_MINIMO = 50;
	
	/**
	 * Capacidad en Litros del deposito del combustible
	 */
	private int deposito;

	
	/**
	 * Lo mismo que el Padre, pero con deposito = DEPOSITO_MINIMO en litros
	 */
	public VehiculoDiesel() {
		super();
		this.deposito = DEPOSITO_MINIMO;
	}


	public int getDeposito() {
		return deposito;
	}


	public void setDeposito(int deposito) {
		this.deposito = deposito;
	} 
	
	
	
}
