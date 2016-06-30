package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

/**
 * CLASE TIPO POJO PARA INSTANCIAR OBJETOS QUE REPRESENTAN UN CANDIDATO
 * los atributos de un candidato:
 * <ol>
 * <li>nombre</li>
 * <li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * </ol>
 * @author Aitor
 *
 */
/**
 * recuperamos el nombre del objeto
 * 
 * @param nombre
 */
public class Candidato extends Persona{
	
	//Constantes
	/**
	 * 
	 */
	static final int NOTA_MINIMA = 0;
	static final int NOTA_MAXIMA = 10;
	static final int NOTA_ACEPTADO = 5;
	
	//Atributos
	/**
	 * 
	 */
	private int nota;
	
	//Constructores
	/**
	 * 
	 */
	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 * @param nom
	 * @param apell1
	 * @param apell2
	 * @param dni
	 * @param email
	 */
	public Candidato(String nom, String apell1, String apell2, String dni, String email) {
		super(nom, apell1, apell2, dni, email);
		this.nota = NOTA_MINIMA;
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 * @param nom
	 * @param apell1
	 * @param apell2
	 * @param dni
	 * @param email
	 * @param nota
	 */
	public Candidato(String nom, String apell1, String apell2, String dni, String email, int nota) {
		super(nom, apell1, apell2, dni, email);
		this.setNota(nota);
	}


	//geters y seters

	/**
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}



	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		
		if (nota < NOTA_MINIMA){
			
			this.nota = NOTA_MINIMA;
			
		}else if(nota > NOTA_MAXIMA){
			
			this.nota = NOTA_MAXIMA;
		}else {
			
			this.nota = nota;
			
		}
	}



	public boolean isAceptado(){
		
		boolean aceptado = false;
		
		if (this.nota >= NOTA_ACEPTADO){
			
			aceptado = true;
			
		}
		
		return aceptado;
	
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candidato [nota=" + nota + ", nom=" + nom + ", apell1=" + apell1 + ", apell2=" + apell2 + ", dni=" + dni
				+ ", email=" + email + "]";
	}


	
	
	
	

}