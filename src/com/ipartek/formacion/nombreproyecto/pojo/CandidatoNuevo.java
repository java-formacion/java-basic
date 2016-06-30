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

	private int nota;	
	
	//Atributos constantes para el rango de las notas
	public static final int	NOTA_MINIMA = 0;
	public static final int NOTA_ACEPTADO = 5;
	public static final int NOTA_MAXIMA = 10;
	
	//Constructor con parametros
	public CandidatoNuevo(String nombre, String ape1){
		super(nombre, ape1);
		this.nota=0;
	}
	
	//Constructor por defecto
	public CandidatoNuevo(){
		super();
		this.nota=0;
	}
	
	public int getNota() {
		return nota;
	}

	/**
	 * Controlamos que la nota pasada por parametro este dentro de los limites de NOTA_MINIMA y NOTA_MAXIMA.<br>
	 * Si se salen de dicho limite, se les asigna el valor minimo/maximo.
	 * @param nota {@code int} nota del candidato
	 */
	public void setNota(int nota) {
		if (nota < NOTA_MINIMA){
			this.nota = NOTA_MINIMA;
			
		}else if (nota > NOTA_MAXIMA){
			this.nota = NOTA_MAXIMA;
			
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
	
}
