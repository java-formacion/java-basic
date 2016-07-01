package com.ipartek.formacion.nombreproyecto.pojo;


/**
 * Clase de tipo POJO para instanciar objetos que representan un Candidato
 * <br/>Los atributos de un Candidato:
 * <ol>
 * 	<li>nombre</li> heredado del padre Persona
 *  <li>apellido1</li> heredado del padre Persona
 *  <li>apellido2</li> heredado del padre Persona
 *  <li>dni</li> heredado del padre Persona
 *  <li>email</li> heredado
 *  <li>nota</li>
 * </ol>
 * @author Borja Manso
 *
 */
public class CandidatoNuevo extends Persona {
	
	//Atributos constantes para el rango de las notas
	public static final int	NOTA_MINIMA = 0;
	public static final int NOTA_ACEPTADO = 5;
	public static final int NOTA_MAXIMA = 10;
	
	//Atributos
	private int nota;	
	
	/**
	 * Constructor de la clase CandidatoNuevo
	 * @see Persona es la superClass
	 * @param nombre
	 * @param ape1
	 * @param nota
	 * @throws CandidatoException 
	 */
	//Constructor con parametros
	public CandidatoNuevo(String nombre, String ape1, int nota) throws CandidatoException{
		super(nombre, ape1);
		this.setNota(nota);
	}
	
	public int getNota() {
		return nota;
	}

	
	/**
	 * 
	 * @param nota
	 * @throws CandidatoException
	 */
	public void setNota(int nota) throws CandidatoException{
		if (nota < NOTA_MINIMA){
//			this.nota = NOTA_MINIMA;
			throw new CandidatoException(CandidatoException.EXCEPTION_RANGO_NOTA_MAX);
			
		}else if (nota > NOTA_MAXIMA){
//			this.nota = NOTA_MAXIMA;
			throw new CandidatoException(CandidatoException.EXCEPTION_RANGO_NOTA_MIN);
			
		}else{
			this.nota = nota;
		}		
	}

	/**
	 * Determinamos si el candidato es aceptado o no comparando su nota con la NOTA_ACEPTADO
	 * @return {@code boolean} aceptado o no
	 */
	public boolean isAceptado() {
		boolean aceptado = false;		
		
		if (this.nota>= NOTA_ACEPTADO){
			aceptado=true;
		}
		return aceptado;
	}

	@Override
	public String toString() {
		return "CandidatoNuevo [nota=" + nota + "]";
	}
	
}
