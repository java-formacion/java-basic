package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioException {

	public static void main(String[] args) {
		metodoA();

	}

	public static void metodoA() {
		metodoB();
	}

	public static void metodoB() {
		System.out.println("Iniciado metodo B");
		metodoC();
		System.out.println("Terminado  B");
	}

	@SuppressWarnings("null")
	public static void metodoC() {
		System.out.println("Iniciado metodo C");
		try {
			Object o = null;
			o.toString();

			
			System.out.println("Terminado correctamente el metodo C");
		}catch (NullPointerException e){
		
				System.out.println("Peta null C");
			
	
		} catch (Exception e) {
			e.printStackTrace();
			//Escribir en fichero de LOG
			System.out.println("Escribir en log " + e.getMessage());
			
		}finally {
			System.out.println("Esto se ejecuta siempre haya excepcion o no");
		}

	}

}
