package com.ipartek.formacion.nombreproyecto.pojo;

//""extends Exception"" para indicarle que deriva de Exception
public class CandidatoException extends Exception{  
	
	//nos daba un warning en la clase /
	//sobre ellas elegimos la segunda opcion y no sañade la siguiente linea
	private static final long serialVersionUID = -4228805270775125239L;
	
	
	public static final String EXCEPTION_RANGO_NOTA_MIN = "No permitido nota menor que " + Candidato.NOTA_MINIMA;
	public static final String EXCEPTION_RANGO_NOTA_MAX = "No permitido nota mayor que " + Candidato.NOTA_MAXIMA;
	
	private String mensaje;
	
	public CandidatoException( String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	//escibimos get  y pulsar CTRL+SPACE
	@Override
		public String getMessage() {
			// retur super.getMessage();
			return this.mensaje;
		}

}
