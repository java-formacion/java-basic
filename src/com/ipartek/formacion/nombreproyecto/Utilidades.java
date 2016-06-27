package com.ipartek.formacion.nombreproyecto;

public class Utilidades {
	public static final String aDiasSemana[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
	
	/**
	 * Retorna el día de la semana en formato {@code String}<br/>
	 * El primer día de la semana es Lunes
	 * @param iDiaSemana {@code int} numero entero que representa  el día de la semana comprendido entre el 0 y el 6
	 * @return {@code String} cadena que representa el día de la semana, null si el día se sale del rango del 0 al 6
	 */
	public static String getDiaSemana(int iDiaSemana){
		String dev=null;
		switch (iDiaSemana) {
		/*case 0:
			dev=aDiasSemana[0];
			break;
		case 1:
			dev=aDiasSemana[1];
			break;
		case 2:
			dev=aDiasSemana[2];
			break;
		case 3:
			dev=aDiasSemana[3];
			break;
		case 4:
			dev=aDiasSemana[4];
			break;
		case 5:
			dev=aDiasSemana[5];
			break;
		case 6:
			dev=aDiasSemana[6];
			break;*/
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			dev = aDiasSemana[iDiaSemana];
			break;
		default:
			break;
		}
		return dev;
	}
	public static boolean validarEmail(String email){
		boolean dev=false;
		if (email.matches("^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,4}$")){
			dev=true;
		}
		return dev;
	}
}
