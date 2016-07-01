package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioException {

	public static void main(String[] args) {
		
		try {
			metodoA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void metodoA() throws Exception {
		System.out.println("Iniciado metodo a");
		metodoB();
		
	}

	public static void metodoB() throws Exception  {
		System.out.println("Iniciado metodo b");
		metodoC();
		System.out.println("Terminado correctamente metodo b");
	}

	public static void metodoC() throws Exception {
		System.out.println("Iniciado metodo c");
		try {

			Object o = null;
			o.toString();
			System.out.println("Terminado correctamente metodo c");
		}
		catch (Exception e) {
			e.printStackTrace();
			//Escribir en fichero de LOG
			System.out.println("Escribir en el LOG "+e.getMessage());
		}
		finally {
			System.out.println("Esto se ejecuta siempre, con o sin excepcion");
		}

	}
}
