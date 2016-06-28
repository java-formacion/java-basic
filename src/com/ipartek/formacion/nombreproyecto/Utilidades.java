package com.ipartek.formacion.nombreproyecto;

import java.math.BigDecimal;

public class Utilidades {

	public static final String aDiasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",
			"Domingo" };

	/**
	 * Retorna el dia de la semana en formato {@code String}.<br>
	 * El primer dia de la semana es lunes.
	 * 
	 * @param iDiaSemana
	 *            {@code int} Numero entero que representa el dia de la semana
	 *            comprendido entre 0 y 6
	 * @return {@code String} cadena que representa el dia de la semana, null si
	 *         el dia sale del rango del 0 al 6
	 */
	public static String getDiaSemana(int iDiaSemana) {
		String resul = null;
		switch (iDiaSemana) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			resul = aDiasSemana[iDiaSemana];
			break;
		default:
			break;
		}
		return resul;
	}

	/**
	 * Valida si el "email" introducido es correcto o no en base a si contiene
	 * '@' y '.', y texto antes y después de ellos
	 * 
	 * @param email
	 *            {@code String}
	 * @return resul {@code boolean} Si el email es correcto o no
	 */
	public static boolean validarEmail(String email) {
		boolean resul = false;
		boolean arroba = false;
		boolean punto = false;
		int longitud = email.length();
		char valor;

		for (int i = 0; i < longitud; i++) {
			valor = email.charAt(i);
			if ((valor == '@' || valor == '.') && i == 0) {
				resul = false;
			} else if (valor == '@') {
				arroba = true;
			} else if (valor == '.' && i != longitud - 1) {
				punto = true;
			}

		}
		if (arroba == true && punto == true) {
			resul = true;
		} else {
			resul = false;
		}
		return resul;
	}

	/**
	 * Capitaliza el String pasado como parametro
	 * 
	 * @param cadena
	 *            {@code String} almacena el texto original</br>
	 * @return String capitalizado
	 */
	// METODO CORRECTO (NO elimina espacios en medio de la cadena)

	public static String capitalizar(String cadena) {
		char[] chars = cadena.trim().toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'' || chars[i] == '-') { // You
				// can
				// add
				// other
				// chars
				// here
				found = false;
			}
		}
		return String.valueOf(chars);
	}


	
	
	//CODIGO FATALMENTE INCORRECTO
	/*
	public static String capitalizar(String cadenaAcambiar) {
		String resul = null;
		if (cadenaAcambiar != null) {

			char[] chars = cadenaAcambiar.trim().toLowerCase().toCharArray();
			StringBuffer sbCadenaFinal = new StringBuffer();
			boolean found = false;
			
			for (int i = 0; i < chars.length; i++) {
				if (!found && Character.isLetter(chars[i])) {
					chars[i] = Character.toUpperCase(chars[i]);
					found = true;
					sbCadenaFinal =  sbCadenaFinal.append(chars[i]);
				} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'' || chars[i] == '-') { // You
					// can
					// add
					// other
					// chars
					// here
					found = false;
					sbCadenaFinal =  sbCadenaFinal.append( Character.toUpperCase(chars[i + 1]));
				}
			}		
			

			resul = sbCadenaFinal.toString();
		}
		return resul;
}
*/
	
	public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(d);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);       
        return bd;
	}


	
}
