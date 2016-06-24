package com.ipartek.formacion.nombreproyecto;

public class Utilidades {
	
	//funcion que pasandole un numero entero me de el nombre del dia de la semana
	
	//declaramos un Array de tipo String publico para acceder desde fuera (public) 
	//y que siempre va a tener las mismas constantes (final)
	
	public static final String  aDiasSemana[] = {"lunes", "martes", "miércoles", "jueves", "viernes", "sabado", "domingo"};
	
	/**
	 * Retorna el dia de la semana en formato {@code String}.<br>
	 * El primer dia de la semana es "lunes"
	 * @param iDiaSemana {@code int}  numero entero que representa el dia de la semana comprendido entre  0 y 6
	 * @return {@code Sting} cadena que representa el dia de la semana, null si el dia se sale del rango del 0 al 6
	 */
	public static String getDiaSemana ( int iDiaSemana) {
		String resul = null;
			
		switch (iDiaSemana){
			case 0: 
				resul = aDiasSemana[0];
				break;
			case 1:
				resul = aDiasSemana[1];
				break;
			case 2:
				resul = aDiasSemana[2];
				break;
			case 3:
				resul = aDiasSemana[3];
				break;
			case 4:
				resul = aDiasSemana[4];
				break;
			case 5:
				resul = aDiasSemana[5];
				break;
			case 6:
				resul = aDiasSemana[6];
				break;
		}
		return resul;
		
	}
}
	
	
	/*	public static String getDiaSemana ( int iDiaSemana) {
	String resul = null;
	
	switch (iDiaSemana){
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
*/
