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
	
	private int nota;
	
	static final int NOTA_MINIMA = 0;
	static final int NOTA_MAXIMA = 10;
	static final int NOTA_ACEPTADO = 5;
	
	
	
	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Candidato(String nom, String apell1, String apell2, String dni, String email) {
		super(nom, apell1, apell2, dni, email);
		// TODO Auto-generated constructor stub
	}



	public Candidato(String nom, String apell1, String apell2, String dni, String email, int nota) {
		super(nom, apell1, apell2, dni, email);
		this.setNota(nota);
	}


	

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
	

}