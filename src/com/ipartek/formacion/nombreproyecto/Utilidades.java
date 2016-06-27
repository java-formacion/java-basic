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
	 * Capitaliza el String pasado como parametro<br>
	 * 
	 * @param cadenaAcambiar
	 *            {@code String} almacena el texto original<br>
	 * @return String capitalizado, null en caso de fallo
	 */
	public static String capitalizar(String cadena) {

		String sCadena = null;
		if (cadena!=null){
			sCadena = "";
			char[]cCadena = cadena.trim().toLowerCase().toCharArray();
			boolean mayus = false;			
			for (int i=0; i<cCadena.length; i++){				
				if (i == 0){
					sCadena += String.valueOf(Character.toUpperCase(cCadena[i]));		
				}else if (mayus){
					sCadena += String.valueOf(Character.toUpperCase(cCadena[i]));
					mayus = false;
				}
				else if (cCadena[i] == ' ' && (cCadena[i+1]) != ' '){
					sCadena += String.valueOf(cCadena[i]);
					mayus = true;
				}				
				else if (cCadena[i] != ' '){
					sCadena += String.valueOf(cCadena[i]);
				}		
				
			}
			
		}
		return sCadena;
		

	}

}
