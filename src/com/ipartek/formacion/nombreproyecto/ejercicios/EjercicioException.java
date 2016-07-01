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
		metodoB();
	}

	public static void metodoB() throws Exception {
		System.out.println("Iniciado metodo B");
		metodoC();
		System.out.println("Terminado metodo B");
	}
	/**
	 * 
	 * @throws Exception
	 */
	public static void metodoC() throws Exception{
		System.out.println("Iniciado metodo C");
		try{
			Object o = null;
			o.toString();
			
			System.out.println("Terminado correctamente metodo C");
			
		}catch(NullPointerException e){
			System.out.println("Peta null");
		}catch(Exception e){
			e.printStackTrace();
			//Escribir en Fichero de LOG
			System.out.println("Escribir en log "+e.getMessage());
			
			throw new Exception("Lanzada adrede");
		}finally{
			System.out.println("Esto se ejecuta siempre haya excepción o no");
		}
	}
}
