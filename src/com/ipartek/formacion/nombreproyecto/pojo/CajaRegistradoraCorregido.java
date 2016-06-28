package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

public class CajaRegistradoraCorregido {

	/**
	 * precio de la compra
	 */
	private float precio;

	/**
	 * pago realizado o dinero entregado
	 */
	private float pago;

	/**
	 * Array con las vueltas
	 */
	private int[] aVueltas;

	/**
	 * Array con tipos de Monedas y Billetes
	 * <ul>
	 * <li>billete 50€</li>
	 * <li>billete 20€</li>
	 * <li>billete 10€</li>
	 * <li>billete 5€</li>
	 * <li>moneda 50€</li>
	 * <li>etc...</li>
	 * </ul>
	 */
	public static final float[] BILLETES_MONEDAS = { 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f,
			0.01f };

	/**
	 * valor en euros del billete de menor tamaño
	 */
	static final int BILLETE_MINIMO = 5;

	public CajaRegistradoraCorregido() {
		super();
		this.pago = 0;
		this.precio = 0;
		this.aVueltas = new int[BILLETES_MONEDAS.length];
	}

	
	/**
	 * Calcula las vueltas de forma optima para retornar los minimos billetes y
	 * monedas posibles
	 * @return 
	 */
	private void calcular() {		
			
			float resto = this.pago - this.precio;
			resto = Utilidades.round(resto, 2).floatValue();
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
				resto %= BILLETES_MONEDAS[i];
				resto = Utilidades.round(resto,2).floatValue();
			}		
			
	}

	/**
	 * Imprimir por pantalla las vueltas del cobro
	 */
	void imprimirVueltas() {
		System.out.println("Nos devuelven " + (this.pago - this.precio) + " Euros");
		String imprimir = "";
		for (int i = 0; i < aVueltas.length; i++) {

			imprimir = aVueltas[i] + " ";
			if (BILLETE_MINIMO <= BILLETES_MONEDAS[i]) {
				imprimir += "Billetes " + (int) BILLETES_MONEDAS[i] + " €";
			} else {
				imprimir += "Monedas " + BILLETES_MONEDAS[i] + " €";
			}

			System.out.println(imprimir);
		}
	}

	
	
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPago() {
		return pago;
	}

	public void setPago(float pago) {
		this.pago = pago;
	}


	/**
	 * Obtener las vueltas calculadas, para saber el valor de cada posicion del
	 * array podemos usar la variable: public static final int[]
	 * BILLETES_MONEDAS
	 * 
	 * @return {@code array} de {@code int} con las vueltas
	 */
	public int[] getaVueltas() {
		calcular();
		return aVueltas;
	}
	
	public static void main(String[] args) {
		
		CajaRegistradoraCorregido caja = new CajaRegistradoraCorregido();
		caja.setPago(2000f);
		caja.setPrecio(1326.24f);
		caja.getaVueltas();
		caja.imprimirVueltas();
	}

}