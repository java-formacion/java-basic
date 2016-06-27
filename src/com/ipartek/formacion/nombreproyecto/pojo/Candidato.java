package com.ipartek.formacion.nombreproyecto.pojo;

/**
 * Clase de tipo POJO para instanciar objetos que representan un Candidato Los
 * atributos de un Candidato:
 * <ol>
 * <li>nombre</li>
 * <li>apellido1</li>
 * <li>apellido2</li>
 * <li>dni</li>
 * </ol>
 * 
 * @author Andoni Luna
 *
 */
public class Candidato {
	// atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;

	// constructor
	public Candidato() {
		this.nombre = "anonimo";
		this.apellido1 = "anonimo";
		this.apellido2 = "anonimo";
		this.dni = "anonimo";
	}

	/**
	 * recuperamos el nombre del objeto
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambiamos el nombre pasandole un parametro
	 * 
	 * @param nombre
	 *            <String> cadena de texto con el nombre del candidato
	 */
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
