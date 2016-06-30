package com.ipartek.formacion.nombreproyecto.pojo;
public abstract class Persona {
	//Atributos de la clase Persona
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String dni;
	protected String email;
	//Constructor de la clase Persona
	public Persona() {
		super();
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";
		this.email = "";
	}
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = capitalizarString(nombre);
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = capitalizarString(apellido1);
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = capitalizarString(apellido2);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", email=" + email + "]";
	}
	/**
	 * Función para capitalizar el String pasado como parametro
	 * 
	 * @param string
	 *            {code String} que almacena el texto original
	 * @return String capitalizado, null si falla
	 */
	public static String capitalizarString(String string) {
		String dev = null;
		if (string != null) {
			char[] chars = string.toLowerCase().toCharArray();
			boolean found = false;
			for (int i = 0; i < chars.length; i++) {
				if (!found && Character.isLetter(chars[i])) {
					chars[i] = Character.toUpperCase(chars[i]);
					found = true;
				} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '-' || chars[i] == '\'') {
					found = false;
				}
			}
			dev = String.valueOf(chars);
			dev= dev.replace(" ", "");
		}
		return dev;
	}
}
