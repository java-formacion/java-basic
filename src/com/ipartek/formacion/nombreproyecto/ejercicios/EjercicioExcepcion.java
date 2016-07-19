package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioExcepcion {

	public static void main(String[] args) {
		metodoA();
	}
	
	public static void metodoA(){
		System.out.println("Iniciado A");
		metodoB();
		System.out.println("Terminado A");
	}
	
	public static void metodoB(){
		System.out.println("Iniciar B");
		metodoC();
		System.out.println("Terminado B");
	}
	
	@SuppressWarnings("null")
	public static void metodoC(){
		String ernesto = "Ernesto Pecho Presto";
		try {
			Object o = null;
			o.toString();
			System.out.println("Terminado correctamente el metodoC");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println(ernesto.toUpperCase()+" "+e.getMessage());
		}finally {
			System.out.println(ernesto + " " + "sigue vivo");
		}
		
		
		
	}

}
