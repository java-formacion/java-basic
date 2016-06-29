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
	
	public boolean aceptado(){
		
		if (this.nota < 0){
			
		}
		
		
		return true;
	}
	

}