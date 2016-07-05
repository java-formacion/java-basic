package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioExcepcion {

	public static void main(String[] args) {
		
		 try {
			metodoA();
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}
	
	public static void metodoA() throws Exception{
		metodoB();
	}
	
	public static void metodoB() throws Exception{
		System.out.println("Iniciado método B");
		metodoC();
		System.out.println("Terminado método B");
	}

	@SuppressWarnings("null")
	public static void metodoC() throws Exception{
		
		System.out.println("Iniciado método C");
		
		try {		
			Object o = null;
			o.toString();
			
			System.out.println("Terminado correctamente método C");
			
		} catch (NullPointerException e){
			System.out.println("Peta Null");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			//Escribir en fichero LOG, pej
			System.out.println("Escribir en Log " + e.getMessage());
		}finally {
			System.out.println("Esto se ejecuta siempre, haya Excepcion o no");
		}
	
	}



}
