
package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

public class CajaReg {

	private float dinero;
	private float valor;

	public CajaReg(float dinero, float valor) {
		super();
		this.dinero = dinero;
		this.valor = valor;
	}

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

	public int[] cambio() {

		double cambio = dinero - valor;

		System.out.println("precio: " + valor);
		System.out.println("dinero: " + dinero);
		System.out.println("cambio: " + cambio);

		int[] cambios = new int[BILLETES_MONEDAS.length];
		
		float resto = this.dinero-this.valor;
		//resto= Utilidades.round(resto, 2).floatValue();
		
		for (int i = 0; i <= BILLETES_MONEDAS.length; i++) {
			if (cambio >= 1) {
				cambios[i] = (int) (cambio / BILLETES_MONEDAS[i]);
				cambio = cambio % BILLETES_MONEDAS[i];
				System.out.println("billetes de" + BILLETES_MONEDAS[i] + ": " + cambios[i]);
				System.out.println("cambio restante: " + cambio);
			} else {

				cambios[i] = (int) (cambio / BILLETES_MONEDAS[i]);
				cambio = (float) cambio - cambios[i] * BILLETES_MONEDAS[i];
				System.out.println("billetes de" + BILLETES_MONEDAS[i] + ": " + cambios[i]);
				System.out.println("cambio restante decimales: " + cambio);
			}
		}
		
		return cambios;
	}
}
