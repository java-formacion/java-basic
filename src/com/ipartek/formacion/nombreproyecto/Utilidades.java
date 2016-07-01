package com.ipartek.formacion.nombreproyecto;

import java.math.BigDecimal;

public class Utilidades {
	public static final String aDiasSemana[] = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado",
			"domingo" };

	/**
	 * Da el dia de la semana formato {@code String} primer dia es lunes
	 * 
	 * @param dia
	 *            {@code int} entre 0 y 6
	 * @return null si fuera del rango
	 */
	public static String getDiaSemana(int dia) {
		String resul = null;
		switch (dia) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			resul = aDiasSemana[dia];
			break;
		default:
			break;
		}
		return resul;
	}

	public static String validarEmail(String email) {
		if (email.indexOf("@") > 0 && (email.endsWith(".com") || email.endsWith(".es"))) {
			return email;

		} else {
			throw new IllegalArgumentException("email no correcto");
		}
	}

	public static String validarNombre(String nombre, String ap1, String ap2) {

		nombre = nombre.trim();
		if (nombre.indexOf(" ") > 0) {
			nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1, nombre.indexOf(" ")).toLowerCase();
		} else {
			nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1, nombre.length()).toLowerCase();
		}
		// for (int i=1; i < nombre.length()+1; i++) {
		// if (nombre.substring(i-1, i).equals(" ")) {
		// nombre = nombre + nombre.substring(nombre.indexOf(" ")+1,
		// nombre.indexOf(" ")).toUpperCase() +
		// nombre.substring(nombre.indexOf(" ")+2,
		// nombre.length()).toLowerCase();
		// }
		// }
		ap1 = ap1.substring(0, 1).toUpperCase() + ap1.substring(1, ap1.length()).toLowerCase();
		ap2 = ap2.substring(0, 1).toUpperCase() + ap2.substring(1, ap2.length()).toLowerCase();
		return nombre + " " + ap1 + " " + ap2;

	}

	public static String Capitalizar(String nombre) {

		nombre = nombre.trim();
		nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1, nombre.length()).toLowerCase();
		return nombre;

	}

	public static float round(float d, int decimalPlace) {
		BigDecimal bd = new BigDecimal(Float.toString(d));
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
	}

	public static float round(BigDecimal bd) {
		return bd.floatValue();
	}

	/**
	 * para el test sería algo como "assertEquals("Daniel
	 * ", Utilidades.validarNombre("dAniel")) otra opcion: cambiar las cadenas a
	 * arrays de caracteres: char[] c ArrayCadena = nombre.trim().toLowerCase()
	 */

}
