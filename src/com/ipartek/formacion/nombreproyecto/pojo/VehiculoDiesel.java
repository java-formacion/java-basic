package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoDiesel extends Vehiculo {

	/**
	 * litros mínimos (int) {@code deposito}
	 */
	public final static int DEPOSITO_MINIMO = 50;
	/**
	 * Capacidad en litros del depósito
	 */

	private int deposito;

	public VehiculoDiesel(String nombre, int numPlazas, float potencia, float dimensiones) {
		super(nombre, numPlazas, potencia, dimensiones);
	}


	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = DEPOSITO_MINIMO;
	}
	
	

	/**
	 * Igual que el padre con depósito igual a 50 l.
	 */

}
