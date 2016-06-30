package com.ipartek.formacion.nombreproyecto.pojo;

import com.ipartek.formacion.nombreproyecto.Utilidades;

public class Persona {

	/**
	 * Clase Persona con atributos
	 */
	protected String nom;
	protected String apell1;
	protected String apell2;
	protected String dni;
	protected String email;
	
	public Persona(String nom, String apell1, String apell2, String dni, String email) {
		super();
		this.setNom(nom);
		this.setApell1(apell1);
		this.setApell2(apell2);
		this.dni = dni;
		this.email = email;
	}
	
	public Persona(){
		super();
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = Utilidades.capitalizar(nom);
	}

	/**
	 * @return the apell1
	 */
	public String getApell1() {
		return apell1;
	}

	/**
	 * @param apell1 the apell1 to set
	 */
	public void setApell1(String apell1) {
		this.apell1 = Utilidades.capitalizar(apell1);
	}

	/**
	 * @return the apell2
	 */
	public String getApell2() {
		return apell2;
	}

	/**
	 * @param apell2 the apell2 to set
	 */
	public void setApell2(String apell2) {
		this.apell2 = Utilidades.capitalizar(apell2);
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", apell1=" + apell1 + ", apell2=" + apell2 + ", dni=" + dni + ", email=" + email
				+ "]";
	}
	
	
	
	
	
	
	
}
