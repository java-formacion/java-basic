package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.Scanner;

public enum Vaso {
	CHUPITO(100), TUBO(250), KATXI(999), ZURITO(200), KUBATA(400), COPA(125), TXIKITO(100);
	
	private int miliLitros;
	
	/**
	 * centimos
	 */
	private static final float PRECIO_MILILITRO = 1.5f;
	
	private Vaso(int milis){
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
			 System.out.println(i + ". " + Vaso.values()[i]);
		 }
	 }
	 
	 public static void main(String[] args){
		 
		 System.out.println("Seleccione su recipiente");
		 mostrarListado();
		 
		 Scanner scanner = new Scanner(System.in);
		 int op =  scanner.nextInt();
		 
		 
		 
		System.out.println("Ha seleccionado " + op);
		Vaso vasoSeleccionado = Vaso.values()[op];
		
		System.out.println("Precio de su consumición ");
		System.out.println(vasoSeleccionado.calcularPrecio()/100 + "€");
		

	 }

}
