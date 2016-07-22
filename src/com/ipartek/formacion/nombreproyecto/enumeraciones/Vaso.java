package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.Scanner;

public enum Vaso {
	
	CHUPITO(100), TUBO(250), CACHI(999), ZURITO(200), COPA(300), KUBATA(400), TXIKITO(50);
	
	private  int mililitros;
	
	/**
	 * Centimos
	 */
	private static final float PRECIO_MILILITRO = 1.5f;
	
	private Vaso(int milis){
		this.mililitros=milis;
	}
	
	public float calcularPrecio (){
		return PRECIO_MILILITRO * mililitros;
	}
	

	public String  servir(){
		
		return "Esta es su bebida";
	}
	
	public static void mostrarListado(){
		for ( int i=0; i< Vaso.values().length; i++){
			System.out.println(i+ "." + Vaso.values()[i]);
		};
	}
	
	public static void main(String[] args) {
		
		mostrarListado();
		System.out.println("seleccione su recipiente");
		Scanner scanner = new Scanner(System.in);
		
		int op = scanner.nextInt();
		
		System.out.println("Ha seleccionado" + op);
		Vaso vasoSeleccionado = Vaso.values()[op];
		
		System.out.println("A pagar");
		System.out.println( vasoSeleccionado.calcularPrecio()/100 + "Euros"); 
		
	}

}
