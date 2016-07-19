package com.ipartek.formacion.nombreproyecto.pojo;

import java.math.BigDecimal;

public class Utilidades {

	public static String aDiasSemana[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
	
	/**
	 * Retorna el día de la semana en formato {@code String}. </br>
	 * El primer día de la semana es "lunes".
	 * @param iDiaSemana {@code int} numero entero que representa el día de la semana, comprendido entre 0 y 6
	 * @return {@code String} cadena que representa el día de la semana ; null si el día sale del rango del 0 al 6
	 */
	
	public static String getDiaSemana (int iDiaSemana){
		
		String diaResultado = null;
			
		switch(iDiaSemana){
			/*case 0: diaResultado = aDiasSemana[0];
				break;
			case 1: diaResultado = aDiasSemana[1];
				break;	
			case 2: diaResultado = aDiasSemana[2];
				break;
			case 3: diaResultado = aDiasSemana[3];
				break;	
			case 4: diaResultado = aDiasSemana[4];
				break;
			case 5: diaResultado = aDiasSemana[5];
				break;
			case 6: diaResultado = aDiasSemana[6];
				break; */
		
			case 0: 
			case 1:	
			case 2: 
			case 3: 	
			case 4: 
			case 5: 
			case 6: diaResultado = aDiasSemana[iDiaSemana];
				break;
			default:					
				break;
		}
		
		return diaResultado;
	}
	
	
	
	
	 public static boolean esValidoEmail(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(email);
         return m.matches();
  }
	
	 
	// falta documentar
		/**
		 * Capitaliza el string pasado como parámetro
		 * 
		 * @param string {@code String}
		 *            
		 * @return String capitalizado
		 */
		public static String capitalizeString(String string) {
			String resul = null;
			if (string != null) {

				char[] chars = string.trim().toLowerCase().toCharArray();

				boolean found = false;
				for (int i = 0; i < chars.length; i++) {
					if (!found && Character.isLetter(chars[i])) {
						chars[i] = Character.toUpperCase(chars[i]);
						found = true;
					} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || 
							chars[i] == '\'' || chars[i] == '-' || chars[i]=='_' ) { 
						found = false;
					}
				}
				return String.valueOf(chars);
			}
			return resul;
		}
		
		
		public static String capitalizarMio(String cadenaAcambiar) {
			String resul = null;
			if (cadenaAcambiar != null) {

				char[] cArrayCadena = cadenaAcambiar.trim().toLowerCase().toCharArray();
				StringBuffer sbCadenaFinal = new StringBuffer();
				
				boolean mayuscula = true;
				
				for (int i = 0; i < cArrayCadena.length; i++) {
					if (cArrayCadena[i] == ' '){		
						mayuscula = true;
						if ( cArrayCadena.length > 1 && cArrayCadena[i-1] != ' '){
							sbCadenaFinal =  sbCadenaFinal.append( cArrayCadena[i]);
						}	
					}else{					
						if (mayuscula == true){
							sbCadenaFinal =  sbCadenaFinal.append( Character.toUpperCase(cArrayCadena[i]));
						}else{
							sbCadenaFinal =  sbCadenaFinal.append(cArrayCadena[i]);
						}
						
						mayuscula = false;
					}	
				}

				resul = sbCadenaFinal.toString();
			}
			return resul;

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
		
		/**
		 * Redondear a dos decimales 
		 * @param d
		 * @param decimalPlace
		 * @return
		 */
		 public static float round(float d, int decimalPlace) {
	         return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
	    }
		 
		 
		 public static String tiempoEmpleado(long duracion){
			 
			 String resultado = "";
			 
			 long minutos = 0;
			 long segundos = 0;
			 
			 minutos = duracion/60000;
			 segundos = (duracion%60000)/1000;
			 
			 resultado = "Tiempo empleado " + minutos + " minutos " + segundos + " segundos";
			 
			 return resultado;
		 }
}
