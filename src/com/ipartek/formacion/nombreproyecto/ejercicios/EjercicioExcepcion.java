package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioExcepcion {

	public static void main(String[] args) {
		try {
			metodoA();
		} catch (Exception e) {             //capturamos e que es del tipo Exception
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

	// throws Exception indica que puede lanzar al metodo que llama a éste la Excepcion
	// en el momento de que se produzca un fallo
	public static void metodoC() throws Exception {    
		
		System.out.println("Iniciado  metodoC");
		//iniciamos  con "try" la captura de una excepcion si se produce
		try {
 			Object o = null;
			o.toString();
			// aqui irian mas lineas de codigo ...
			System.out.println("Terminado corecctamente metodoC");
			
		}catch(NullPointerException e){
			//se cierra con Catch el bloque de codigo sujeto a captura de excepcion NullPointer Exception
			System.out.println("Peta null");  
			
		}catch(Exception e){ 
			
			//escribir en pantalla
			System.out.println(" Peté :-( ");
			//En vez de escribir en pantalla Lo nomal es Escribir en fichero LOG
			//que es un fichero donde guarda toda la informacion de lo que esta pasando
			e.printStackTrace();
			System.out.println("Escribir en Log " + e.getMessage());
			
			throw new Exception("Lanzada adrede");
			
		} finally{
			System.out.println("Esto se ejecuta siempre, haya Excepcion o no");
		}
	}
}
