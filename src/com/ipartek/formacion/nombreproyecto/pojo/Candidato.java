package com.ipartek.formacion.nombreproyecto.pojo;

public class Candidato extends Persona {

	// Constantes
	/**
	 * NOTA_MINIMA {@code int} constante que guarda la nota mínima que se puede
	 * asignar
	 */
	public static final int NOTA_MINIMA = 0;
	/**
	 * NOTA_MAXIMA {@code int} constante que guarda la nota máxima que se puede
	 * asignar
	 */
	public static final int NOTA_MAXIMA = 10;
	/**
	 * NOTA_APROBADO {@code int} constante que guarda la nota a partir de la
	 * cual se considera aprobado
	 */
	public static final int NOTA_APROBADO = 5;

	// Atributos
	/**
	 * {@code int} nota del Candidato
	 */
	private int nota;

	// Constructores
	/**
	 * Constructor de la clase Candidato.
	 * 
	 * @see Persona es la superClass
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param dni
	 * @param email
	 * @param nota
	 * @throws CandidatoException 
	 */
	public Candidato(String nombre, String apellido1, String apellido2, String dni, String email, int nota) throws CandidatoException {
		super(nombre, apellido1, apellido2, dni, email);
		// this.nota = nota;
		this.setNota(nota);
	}

	// getters y setters
	public int getNota() {
		return nota;
	}

	/**
	 * 
	 * @param nota
	 * @throws CandidatoException
	 */

	public void setNota(int nota) throws CandidatoException {

		if (nota > NOTA_MAXIMA) {
			// this.nota = NOTA_MAXIMA;
			throw new CandidatoException(CandidatoException.EXCEPTION_RANGO_NOTA_MAX);
		} else if (nota < NOTA_MINIMA) {
			// this.nota = NOTA_MINIMA;
			throw new CandidatoException(CandidatoException.EXCEPTION_RANGO_NOTA_MIN);
		} else {
			this.nota = nota;
		}
	}

	/**
	 * Método estaAceptado nos indica si un Candidato2 está aceptado Para ello,
	 * su nota debe ser igual o mayor a NOTA_APOROBADO
	 *
	 * @return aceptado {@code boolean}
	 */
	public boolean isAceptado() {

		boolean aceptado = false;

		if (this.nota >= NOTA_APROBADO) {
			aceptado = true;
		}

		return aceptado;
	}

	@Override
	public String toString() {
		return super.toString() + " Candidato [nota=" + nota + "]";
	}

}
