package com.ipartek.formacion.nombreproyecto.enumeraciones;

import java.util.Scanner;

public enum Vaso {

	// VALORES CONSTANTES DE TIPO VASO
	CHUPITO(100), TUBO(250), KATXI(750), ZURITO(200), CUBATA(400), COPA(150), TXIKITO(220);

	private int miliLitros;

	/**
	 * CENTIMOS
	 */
	private static final float PRECIO_MILILITRO = 1.5f;

	private Vaso(int milis) {
		this.miliLitros = milis;
	}

	/* METODOS */
	public float calcularPrecio() {
		return PRECIO_MILILITRO * miliLitros;
	}

	// ??
	public String servir() {

		return "Esta es su bebida ";
	}

	// LISTAR POR PANTALLA
	public static void mostrarListado() {
		for (int i = 0; i < Vaso.values().length; i++) {
			System.out.println(i + ". " + Vaso.values()[i]);
		}
	}

	// MAIN
	public static void main(String[] args) {
		mostrarListado();
		System.out.println("Seleccione su VASO");

		// declarar scaner para introducir datos por consola
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();

		// imprimir el nombre de vaso seleccionado
		System.out.println("Ha selecionado " + Vaso.values()[op]);
		
		//imprimir el precio
		Vaso vasoSeleccionado = Vaso.values()[op];
		System.out.println(vasoSeleccionado.calcularPrecio()/100 + " euros");
	}
}
