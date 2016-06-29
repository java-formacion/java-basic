package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

public class CajaRegistradora {

	
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
	public static final float [] BILLETES_MONEDAS = {50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
	/**
	 * 
	 * @param dinero variable float del dinero con el que se paga
	 * @param precio variable float del precio
	 * @return devuelve un float con la diferencia entre lo que hemos pagado y lo que nos ha costado. Devuelve -1 si no nos llega el dinero.
	 */
	public static float calcularVueltas(float dinero, float precio){
		
		float vueltas = -1f;
		if (dinero >= precio){
			vueltas =  (dinero - precio);
		}
		return vueltas;
		
	}
	/**
	 * 
	 * @param vueltas float con el total de las vueltas a recibir
	 * @return array de int con el número de billetes y monedas a devolver. El orden de las cantidades es el de la variable BILLETES_MONEDASs
	 */
	public static int[] calcularVueltasPapelMoneda(float vueltas){
		
		int[] aDinero = new int[BILLETES_MONEDAS.length];		//array de enteros a devolver
		float devolver = vueltas;							//recogemos el parametro de entrada porque vamos a cambiar su valor
		int i = 0;											//variable para las posiciones de los arrays
		int resto = 0;
		while (devolver > 0.00f && i < BILLETES_MONEDAS.length){			//condicion para que cuando llegue a 0 pare de calcular las vueltas en papel moneda
		
				resto = (int) (devolver / BILLETES_MONEDAS[i]);
				aDinero[i] = resto;
				devolver %= BILLETES_MONEDAS[i];							//devolver = devolver - (resto * BILLETES_MONEDAS[i]);				
				//devolver = Utilidades.round(devolver,2).floatValue();
				i++;
		}
		
		return aDinero;
	}
	
	public static int[] limpiarValores(int[] valores){
		
		int[] aValores = new int[valores.length];
		
		for (int i=0; i<valores.length; i++){
			
			aValores[i] = 0;
		}
		
		return aValores;
	}
	
	
}



