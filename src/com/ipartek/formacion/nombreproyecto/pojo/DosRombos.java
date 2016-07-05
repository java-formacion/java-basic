package com.ipartek.formacion.nombreproyecto.pojo;
/**
 * al ser una clase <b>final</b> no puede tener hijos
 * @author Curso
 *
 */
public final class DosRombos extends Rombo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String dibujar() {
		
		return "Dibujado dos rombos";
	}

}
