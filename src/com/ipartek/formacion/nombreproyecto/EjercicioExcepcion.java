package com.ipartek.formacion.nombreproyecto;

public class EjercicioExcepcion {

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
		System.out.println("Iniciado metodo B");
		metodoC();
		System.out.println("Terminado metodo B");
	}

	/**
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("null")
	public static void metodoC() throws Exception {

		System.out.println("Iniciado metodo C");
		try{
			
			Object o = null;
			o.toString();
			//mas lineas...
			System.out.println("Terminado correctamente metodo C");
		
		}catch(NullPointerException e){
			System.out.println("Peta null");
			
		}catch(Exception e){		
			
			
			e.printStackTrace();
			//Escribir en fichero LOG
			System.out.println("Escribir en Log " + e.getMessage() );
			
			throw new Exception("Lanzada adrede");
			
			
		}finally {
			System.out.println("Esto se ejecuta siempre, haya Excepcion o no");
		}
				
	}

}
