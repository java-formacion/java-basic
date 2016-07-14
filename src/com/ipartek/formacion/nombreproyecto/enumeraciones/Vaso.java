package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.Scanner;

public enum Vaso {
	
	CHUPITO(100), TUBO(250), KATXI(999), ZURITO(200), CUBATA(400), COPA(120), TXIKITO(200);
	
	private int miliLitros;
	
	/**
	 * Centimos
	 */
	private static final float PRECIO_MILILITRO = 1.5f;
	
	private Vaso(int milis){
		this.miliLitros = milis;
	}
	
	public float getMiliLitros(){
		return miliLitros;
	}
	
	public float calcularPrecio(){
		return PRECIO_MILILITRO * getMiliLitros();
	}
	
	public String servir(){
		return "Esta es su bebida ";
	}
	
	public static void mostrarListado(){
		for (int i=0;i<Vaso.values().length;i++){
			System.out.println(i+". "+Vaso.values()[i]);
		}
	}
	
	public static void main(String[] args) {
		
		mostrarListado();
		System.out.println("Seleccione su recipiente");
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();
		
		System.out.println("Ha seleccionado "+op);
		Vaso vasoSeleccionado = Vaso.values()[op];
		
		System.out.println("Precio de su consumición: ");
		System.out.println(vasoSeleccionado.calcularPrecio()/100+" €");
	}
}
