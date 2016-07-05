package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioException {

	public static void main(String[] args) {
		try {
			metodoA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void metodoA() throws Exception {
		metodoB();
	}

	public static void metodoB() throws Exception {
		System.out.println("Iniciado metodoB");
		metodoC();
		System.out.println("Terminado metodoB");
	}

	/**
	 * 
	 * @throws Exception
	 */
	public static void metodoC() throws Exception {

		System.out.println(" Iniciado metodoC");
		try{
			Object o = null;
			o.toString();	
			
			System.out.println(" Terminado correctamente metodoC");
		}catch(NullPointerException n){
			System.out.println("Peta null");
			
		}catch(Exception e){
			
			e.printStackTrace();
			//Escribir en fichero LOG
			System.out.println(" Escribir en Log: " + e.getMessage());
			
			throw new Exception("Lanzada adrede");
		}finally{
			System.out.println("Esto se ejecuta siempre, haya Excepcion o no");
		}
		
	}

}
