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
	
	
	/**
	 * Calcula las vueltas a devolver a partir del Precio del producto y del dinero entregado por el cliente	 *  
	 * @param fPrecio {@code float} Precio del producto o servicio 
	 * @param fEntregado {@code float} Dinero entregado por el cliente
	 * @return  {@code float} Dinero a devolver al cliente
	 */
	static public float calcularVueltas(float fPrecio, float fEntregado){
		float resul = 0;
		
		//resul = String.format("%.2f", (fEntregado - fPrecio));
		resul = (float) ((fEntregado-fPrecio)*100)/100;
		System.out.println("Vueltas de " + resul + " euros\n");
		calcularVueltasOptimas(fPrecio, fEntregado);
		return resul;
	}

	
	static int [] calcularVueltasOptimas(float fPrecio, float fEntregado){
		int [] aResul = {0,0,0,0,0,0,0,0,0,0,0,0};
		float fADevolver = fEntregado-fPrecio;
		
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			
			
			if(BILLETES_MONEDAS[i] <= fADevolver){
				aResul[i]= (int)Math.floor(fADevolver/BILLETES_MONEDAS[i]);
				fADevolver = fADevolver-(BILLETES_MONEDAS[i]*aResul[i]);
				
			}
			System.out.println("\n" + aResul[i] + " de " + BILLETES_MONEDAS[i]);
		}
		
		return aResul;
	}
	

	
}
