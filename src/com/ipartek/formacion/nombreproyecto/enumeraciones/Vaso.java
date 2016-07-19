package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.Scanner;

public enum Vaso {
	
	CHUPITO(100),TUBO(250),CATXI(999),ZURITO(175),CUBATA(500),COPA(200),TXIKITO(150);
	
	private int miliLitros;
	/**
	 *   Centimos
	 */
	private static final float PRECIO_MILILITRO = 1.5f;
	
	private Vaso(int milis) {
		this.miliLitros = milis;
	}
	
	public float calcularPrecio(){
		return PRECIO_MILILITRO * miliLitros;
	}
	
	public String servir(){
		return "Esta es su bebida";
	}
	
	public static void mostrarPantalla(){
		
		for(int i=0;i<Vaso.values().length;i++){
			System.out.println((i+1)+"."+Vaso.values()[i]);
		}
	}
	
	public static void main(String[] args) {
		mostrarPantalla();
		System.out.println("Seleccione su recipiente");
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();
		System.out.println("Ha seleccionado "+op);
		Vaso  vasoSeleccionado = Vaso.values()[op];
		System.out.println("Precio de su consumicion es igual a: "+ vasoSeleccionado.calcularPrecio()/100+"centimos");
			
		
	}

}
