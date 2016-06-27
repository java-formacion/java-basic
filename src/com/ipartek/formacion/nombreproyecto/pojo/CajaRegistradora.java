package com.ipartek.formacion.nombreproyecto.pojo;

public class CajaRegistradora {
	
	/**
	* Array con tipos de Monedas y Billetes 
	* <ul>
	* <li>billete 50€</li>
	* <li>billete 20€</li>
	* <li>billete 10€</li>
	* <li>billete 5€</li>
	* <li>moneda 2€</li>
	* <li>etc...</li>
	* </ul>
	*/
	public static final float [] BILLETES_MONEDAS = {50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
	
	static public float  calcularVueltas(float precio, float dinero){
		float resul = 0;
		
		resul = precio - dinero;
		System.out.println("Vueltas de " + resul + " euros");
		return resul;
	}

	/*
	public int[] calcularVueltasOptimas(float aDevolver){
		int[] aResul;
		return aResul[];
	}
	*/

	
}
