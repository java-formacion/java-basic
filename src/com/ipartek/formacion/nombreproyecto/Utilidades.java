package com.ipartek.formacion.nombreproyecto;

public class Utilidades {

	public static final String aDiasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",
			"Domingo" };

	/**
	 * Retorna el dia de la semana en formato {@code String}}
	 * 
	 * @param iDiaSemana
	 *            {@code int} numero entero que representa dia de la semana
	 *            comprendido entre 0 - Lunes y 6- Domingo
	 * @return {@code String} cadena que representa el dia de la semana, null si
	 *         el dia sale del rango de 0 a 6.
	 */
	public static String getDiaSemana(int iDiaSemana) {
		String resultado = null;
		switch (iDiaSemana) {
		// case 0:resultado = Utilidades.aDiasSemana[iDiaSemana];break;
		// case 1:resultado = Utilidades.aDiasSemana[iDiaSemana];break;
		// case 2:resultado = Utilidades.aDiasSemana[iDiaSemana];break;
		// case 3:resultado = Utilidades.aDiasSemana[iDiaSemana];break;
		// case 4:resultado = Utilidades.aDiasSemana[iDiaSemana];break;
		// case 5:resultado = Utilidades.aDiasSemana[iDiaSemana];break;
		// case 6:resultado = Utilidades.aDiasSemana[iDiaSemana];break;

		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			resultado = Utilidades.aDiasSemana[iDiaSemana];
			break;
		default:
			resultado = null;
			break;

		}
		return resultado;
	}

	/**
	 * Capitaliza el String pasado como parametro
	 * 
	 * @param cadenaAcambiar
	 *            {@code String} almacena el texto original<br>
	 * @return String capitalizado, null en caso de fallo
	 */
	public static String capitalizar(String cadenaAcambiar) {
		String resul = null;
		if (cadenaAcambiar != null) {

			char[] cArrayCadena = cadenaAcambiar.trim().toLowerCase().toCharArray();
			StringBuffer sbCadenaFinal = new StringBuffer();
			
			for (int i = 0; i < cArrayCadena.length; i++) {
				if (cArrayCadena[i] == ' '){				
					if ( cArrayCadena[i+1] != ' '){
						sbCadenaFinal =  sbCadenaFinal.append( Character.toUpperCase(cArrayCadena[i + 1]));
					}	
				}else{					
					sbCadenaFinal =  sbCadenaFinal.append(cArrayCadena[i]);
				}	
			}

			resul = sbCadenaFinal.toString();
		}
		return resul;

	}

}
