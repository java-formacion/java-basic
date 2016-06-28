package com.ipartek.formacion.nombreproyecto.pojo;

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
	 * Funcion que devuelve una variable {@code float} apagar<break />
	 * Esta variable contiene las vueltas
	 * @return {@code} float 
	 */
	public static float Vueltas(){
		float precio=(float) 1326.24;
		float entregado=2000;
		float apagar=entregado-precio;
		return apagar;
	}
	/**
	 * Funcion para calcular las vueltas optimas.
	 * @param {@code float} apagar
	 * @return {@code int []} cambio
	 */
	public static int[] VueltasOptimas(float apagar){
		int [] cambio = {0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i=0; i<BILLETES_MONEDAS.length; i++){
			if (BILLETES_MONEDAS[i]<=apagar){
				cambio[i]=(int) Math.floor(apagar/BILLETES_MONEDAS[i]);
				apagar=apagar%BILLETES_MONEDAS[i];
			}
		}
		return cambio;
	}
	public static void main(String args[]){
		System.out.println("Se le devolveran "+Vueltas()+" € de vueltas");
		int [] mostrar=VueltasOptimas(Vueltas());
		for (int i=0; i<mostrar.length; i++){
			System.out.println("En "+mostrar[i]+" billetes de "+BILLETES_MONEDAS[i]);
		}
	}
}
