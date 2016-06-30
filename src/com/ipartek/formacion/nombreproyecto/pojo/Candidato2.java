package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase Candidato2
 *  @see Persona es la superClase
 * <ol>
 * <li>nombre</li>
 * <li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * <li>email</li>
 * <li>nota</li>
 *</ol>
 */

public class Candidato2 extends Persona {

	/**
	 * NOTA_MINIMA {@code int} constante que guarda la nota mínima que se puede asignar
	 */
	public static final int NOTA_MINIMA = 0;
	/**
	 * NOTA_MAXIMA {@code int} constante que guarda la nota máxima que se puede asignar
	 */
	public static final int NOTA_MAXIMA = 10;
	/**
	 * NOTA_APROBADO {@code int} constante que guarda la nota a partir de la cual se considera aprobado
	 */
	public static final int NOTA_APROBADO = 5;
	
	/**
	 * {@code int} nota del Candidato2
	 */
	private int nota;
	
	/**
	 * Constructor de la clase Candidato 2. Nota inicial es igual a la NOTA_MINIMA
	 * @param nombre {@code String}
	 * @param apellido1 {@code String}
	 * @param apellido2 {@code String}
	 * @param dni {@code String}
	 * @param email {@code String}
	 */
	public Candidato2(String nombre, String apellido1, String apellido2, String dni, String email) {
		super(nombre, apellido1, apellido2, dni, email);
		this.nota = NOTA_MINIMA;
	}

	public int getNota() {
		return nota;
	}

	/**
	 * Método setNota asigna una nota a un Candidato2
	 * Si nota es menor que NOTA_MINIMA asignamos NOTA_MINIMA
	 * Si nota es mayor que NOTA_MAXIMA asignamos NOTA_MAXIMA
	 * @param nota {@code int}
	 */
	public void setNota(int nota) {
		
		if (nota>NOTA_MAXIMA){
			this.nota = NOTA_MAXIMA;
		}else if(nota<NOTA_MINIMA){
			this.nota = NOTA_MINIMA;
		}else{
			this.nota = nota;
		}
		
	}

	/**
	 * Método estaAceptado nos indica si un Candidato2 está aceptado
	 * Para ello, su nota debe ser igual o mayor a NOTA_APOROBADO
	 * @return aceptado {@code boolean}
	 */
	public boolean estaAceptado(){
		
		boolean aceptado = false;
		
		if(this.nota>=NOTA_APROBADO){
			aceptado = true;
		}
		
		return aceptado;
	}

	@Override
	public String toString() {
		return super.toString() + " Candidato2 [nota=" + nota + "]";
	}
	
	
	
}
