package com.ipartek.formacion.nombreproyecto.ejercicios;

public class EjercicioExcepcion {

	public static void main(String[] args) {
		metodoA();

	}

	public static void metodoA() {
		metodoB();

	}

	public static void metodoB() throws Exception {
		System.out.println("Iniciado  metodoB");
		metodoC();
		System.out.println("Terminado corerctamente metodoB");
	}

	//throws Exception  indica que puede lanzar al metodo que llama a este la Excepcion
	//en el momento de 
	public static void metodoC() throws Exception {    
		System.out.println("Iniciado  metodoC");
		try {
			Object o=null;
			o.toString();
			
			// aqui irian mas lineas de codigo ...
			System.out.println("Terminado corerctamente metodoC");
			
		}catch(NullPointerException e){
			
		}catch (Exception e) {
			
			//escribir en pantalla
			System.out.println(" Peté :-( ");
			//En vez de escribir en pantalla Lo nomal es Escribir en fichero LOG
			//que es un fichero donde guarda toda la informacion de lo que esta pasando
			e.p
			System.out.println("Escribir en Log " + e.getMessage());
		} finally{
			System.out.println("Esto se ejecuta siempre, hay Excepcion o no");
		}
	}
}
