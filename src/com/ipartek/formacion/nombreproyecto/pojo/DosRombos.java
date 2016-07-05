package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * al ser una clase <b>final</b> no puede tener hijos
 * 
 */
public final class DosRombos extends Rombo {

	private static final long serialVersionUID = 9002021145870020803L;

	@Override
	public String dibujar() {		
		return "dibujado DosRombos";
	}

	
}
