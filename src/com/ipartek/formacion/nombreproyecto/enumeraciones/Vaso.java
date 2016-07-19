package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public enum Vaso {

	CHUPITO(100), TUBO(250), KATXI(999), ZURITO(200), CUBATA(400), COPA(120), TXIKITO(200);
	
	private int ml;
	/**
	 * Centimos
	 */
	private static final double PRECIO_MILIS = 1.5;
	private static Scanner s;
	
	private Vaso(int milis){
		this.ml = milis;
	}
	
	public int getMl() {
		return ml;
	}
	
	public String servir(){
		return "Esta es su medida";
	}	
	
	public static void mostrarListado() {
		for (Vaso v : Vaso.values()) {
			System.out.println("\t" + (v.ordinal() + 1) + ". " + v);
		}
	}
	
	public double calcularPrecio(){
		return (PRECIO_MILIS * this.getMl()) * 0.01;
	}
	
	public static void main(String[] args) {
		System.out.println("Recipientes:");
		mostrarListado();
		System.out.println("\nSeleccione su recipiente:\n");
		s = new Scanner(System.in);
		int op = s.nextInt();
		try{
			Vaso v = Vaso.values()[op - 1];
			System.out.println("\nHa seleccionado : " + op + " - " + v);
			System.out.println("\nEl precio de la bebida es : " + v.calcularPrecio() + " €");			
		}catch(ArrayIndexOutOfBoundsException aob){
			System.out.println("\nElije una opcion valida");
		}catch(InputMismatchException ime){
			System.out.println("\nElije una opcion valida");
		}
	}

	
}
