package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioExcepcion {

	public static void main(String[] args){
		// 
		try {
			metodoA();
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
	}

	public static void metodoA() throws Exception {
		metodoB();
	}

	public static void metodoB() throws Exception {
		System.out.println("Iniciado metodo B");
		metodoC();
		System.out.println("Terminado metodo B");
	}

	@SuppressWarnings("null")
	public static void metodoC() throws Exception {
		
		System.out.println("Iniciado metodo C");
		
		try {
			Object o = null;
			o.toString();

			// mas lineas
			System.out.println("Terminado corectamente metodo C");
		} catch (NullPointerException e) {

			System.out.println("Peta null");

		} catch (Exception e) {

			e.printStackTrace();
			// Escribir en fichero de log
			System.out.println("Escribir en log " + e.getMessage());
			
			throw new Exception ("Lanzada a drede");
		
		} finally {
			System.out.println("Esto de ejecuta siempre, haya escepcion o no");
		}
	}

}
