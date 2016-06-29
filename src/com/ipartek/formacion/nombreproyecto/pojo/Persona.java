package com.ipartek.formacion.nombreproyecto.pojo;

public class Persona {

	private String nom;
	private String apell1;
	private String apell2;
	private String dni;
	private String email;
	
	public Persona(String nom, String apell1, String apell2, String dni, String email) {
		super();
		this.nom = nom;
		this.apell1 = apell1;
		this.apell2 = apell2;
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
		this.nom = nom;
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
		this.apell1 = apell1;
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
		this.apell2 = apell2;
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
	
	
	
	
	
	
	
}
