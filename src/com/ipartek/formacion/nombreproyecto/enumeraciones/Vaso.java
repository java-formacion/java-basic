package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.Scanner;

public enum Vaso {

	CHUPITO(100), TUBO(250), KATXI(999), ZURITO(200), KUBATA(400), COPA(120), TXIKITO(200);
	
	private int miliLitros;
	
	/**
	 * Centimos
	 */
	private static final float PRECIO_MILILITRO = 1.5f;

	private Vaso(int milis) {
		this.miliLitros = milis;
	}
	
	
	
	public float calcularPrecio(){
		return PRECIO_MILILITRO * miliLitros;
	}
	

	public String servir(){
		
		return "Esta es su bebida ";
	}
	
	public static void mostrarListado(){
		
		for (int i=0; i < Vaso.values().length; i++){
			System.out.println( i + ". " + Vaso.values()[i] );
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		mostrarListado();
		
		System.out.println("Seleccione su recipiente");		
		int op = scanner.nextInt();
		
		System.out.println("Ha seleccionado " + op);
		Vaso vasoSeleccionado = Vaso.values()[op]; 
		
		System.out.println("Precio de su consumicion ");
		System.out.println( vasoSeleccionado.calcularPrecio()/100 + " €" );
		
	}
	
}

