package com.ipartek.formacion.nombreproyecto.pojo;

public class CandidatoException  extends Exception{
	

	private static final long serialVersionUID = -4228805270775125239L;
	
	public static final String EXCEPTION_RANGO_NOTA_MIN = " No permitidos nota menor que" + Candidato.NOTA_MINIMA;
	public static final String EXCEPTION_RANGO_NOTA_MAX = " No permitidos nota menor que" + Candidato.NOTA_MAXIMA;
	
	
	private String mensaje;
	
	public CandidatoException ( String mensaje) {
		super();
		this.mensaje = mensaje;
		
	}
	
	
	@Override
	public String getMessage() {
		
		return this.mensaje;
	}
	
	
	}


