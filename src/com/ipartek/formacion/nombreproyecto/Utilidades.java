package com.ipartek.formacion.nombreproyecto;



public class Utilidades {

	public static final String aDiasSemana[] = {"lunes",
												"martes",
												"miércoles",
												"jueves",
												"viernes",
												"sábado",
												"domingo"};
	
	/**
	 * Retorna eln dia de la semana en formato {@code String}. <br>
	 * El primer dia de la semana es "lunes".
	 * @param iDiaSemana {@code int} numero entero que representa dia semana comprendido entre 0 y 6
	 * @return {@code String} cadena que representa el dia de la semana, null si el dia sale del rango del 0 al 6
	 */
	public static String getDiaSemana(int iDiaSemana){
		String sResultado = null;
		switch (iDiaSemana){
			case 0:
				sResultado = aDiasSemana[iDiaSemana];
				break;
			case 1:
				sResultado = aDiasSemana[iDiaSemana];
				break;
			case 2:
				sResultado = aDiasSemana[iDiaSemana];
				break;
			case 3:
				sResultado = aDiasSemana[iDiaSemana];
				break;
			case 4:
				sResultado = aDiasSemana[iDiaSemana];
				break;
			case 5:
				sResultado = aDiasSemana[iDiaSemana];
				break;
			case 6:
				sResultado = aDiasSemana[iDiaSemana];
				break;
		}
		
		/**
		 * switch (iDiaSemana){
		 * 		case 0:
		 * 		case 1:
		 * 		case 2:
		 * 		case 3:
		 * 		case 4:
		 * 		case 5:
		 * 		case 6:
		 * 				sResultado = aDiasSemana[iDiaSemana];
		 * 				break;
		 * 
		 * }
		 */
		
		return sResultado;
		
	}
	
	public static String capitalizar (String cadena){
		
		String resul = null;
		
		char[] cCadena = cadena.trim().toCharArray();
		boolean mayus = true;
		
		for (int i=0; i<cCadena.length; i++){
			if (mayus){
				Character.toUpperCase(cCadena[i]);
				mayus = false;
			}
			if (cCadena[i]==' '){
				mayus = true;
			}else {
				Character.toLowerCase(cCadena[i]);
			}			
			
		}
		return String.valueOf(resul);
		
	}
}
