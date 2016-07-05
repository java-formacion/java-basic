package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase que hace referencia a los alumnos
 * 
 * @see Persona
 * 
 * @param nota es la nota media del alumno
 * @param email es el email del alumno
 * 
 * @author Curso
 *
 */
public class Candidato extends Persona {

	public static final int NOTA_MIN = 0, NOTA_MAX = 10, NOTA_ACP = 5;
	private int nota;
	private String email;

	public Candidato(String nombre, String dni, String ap1, String ap2, String email) {
		super(nombre, dni, ap1, ap2);
		this.email=email;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) throws CandidatoException {
		if (nota>NOTA_MAX){
			throw new CandidatoException(CandidatoException.EXCP_RANGO_NMAX);
		} else if (nota<NOTA_MIN){
			throw new CandidatoException(CandidatoException.EXCP_RANGO_NMIN);
		}
		this.nota = nota;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método que determina si el alumno ha aprobado o no
	 * @param nota
	 * @return "aprobado" si tiene más de un 5 o sino "suspendido"
	 */
	public String aceptado(int nota) {
		if (nota >= NOTA_ACP) {
			return "Aprobado";
		} else {
			return "Suspendido";
		}
	}
}


