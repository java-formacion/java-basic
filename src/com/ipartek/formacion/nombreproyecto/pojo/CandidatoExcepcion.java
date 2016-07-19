package com.ipartek.formacion.nombreproyecto.pojo;

public class CandidatoExcepcion extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2063777612751616409L;
	
	
	public static final String EXCEPCION_RANGO_NOTA_MIN = "No permitido nota menor que "+Candidato.NOTA_MINIMA;
	public static final String EXCEPCION_RANGO_NOTA_MAX = "No permitido nota mayor que "+Candidato.NOTA_MAXIMA;
	
	private String mensaje;
	
	public CandidatoExcepcion(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		
		return this.mensaje;
	}

}
