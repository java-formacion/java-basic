package com.ipartek.formacion.nombreproyecto.pojo;



public class CajaRegistradora {

	/** BILLETES_MONEDAS
	* Array con tipos de Monedas y Billetes 
	* <ul>
	* <li>billete 50€</li>
	* <li>billete 20€</li>
	* <li>billete 10€</li>
	* <li>billete 5€</li>
	* <li>moneda 2€</li>
	* <li>moneda 1€</li>
	* <li>moneda 0.50€</li>
	* <li>moneda 0.20€</li>
	* <li>moneda 0.10€</li>
	* <li>moneda 0.05€</li>
	* <li>moneda 0.02€</li>
	* <li>moneda 0.01€</li>
	* </ul>
	*/
		
	public static final float [] BILLETES_MONEDAS = {50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f};
	
	/**
	 * Función calcularVueltas devuelve un {@code float} que son las vueltas de una compra
	 * @param dinero {@code float}
	 * @param precio {@code float}
	 * @return  {@code float}
	 */
	public static float calcularVueltas(float dinero, float precio){
		
		float resul = 0.00f;
		if (Utilidades.round(dinero - precio, 2) >= 0){
			resul = Utilidades.round(dinero - precio, 2);
		}
		return resul;
	}
	
	/**
	 * Función calcularVueltasOptimas devuelve un array con la cantidad de billetes y de monedas para dar las vueltas mínimas.
	 * Considero el mismo tipo de billetes y monedas presentes en BILLETES_MONEDAS
	 * @param dinero {@code float}
	 * @param precio {@code float}
	 * @return {@code array enteros}
	 */
	public static int[] calcularVueltasOptimas(float dinero, float precio){
		
		//inicializo a cero el array y el montante
		int[] aResul= {0,0,0,0,0,0,0,0,0,0,0,0}; 
		float montante = 0.00f;
		
		
		montante = calcularVueltas(dinero,precio);
		
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				
				while (montante >= BILLETES_MONEDAS[i]){
					
					montante = Utilidades.round(montante - BILLETES_MONEDAS[i], 2);
					aResul[i] = aResul[i] + 1;
				}
			}
		
		return aResul;
	}
	
	/**
	 * Función que devuelve un String indicando las vueltas óptimas a devolver de cada billete y moneda
	 * @param aVueltas {@code array enteros}
	 * @return {@code String}
	 */
	public static String imprimirVueltasOptimas(int[] aVueltas){
		
		String resul = "";
		
		if (aVueltas != null){
			for (int i = 0; i < aVueltas.length; i++) {
				
				resul = resul + "Devolver " + aVueltas[i] + " de " + BILLETES_MONEDAS[i] + " . ";
			}
		} else {
			resul = "No hay vueltas que devolver.";
		}
		
		
		return resul;
	}
	
	

	
}
