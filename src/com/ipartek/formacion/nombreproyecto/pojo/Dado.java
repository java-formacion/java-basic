package com.ipartek.formacion.nombreproyecto.pojo;

public class Dado {

	public static String aAlumnos[] = {
						"Selene",
						"Edu",
						"Andoni",
						"Borja",
						"Joseba Zaldunbide",
						"Jon",
						"Jon Ander",
						"Daniel",
						"Josu",
						"Joseba",
						"Monica",
						"Isabel",
						"Iker",
						"Ekaitz",
						"Aitor"};
	
	/**
	 * Genera numero aleatorio
	 * @return <code>int</code> numero entre 0 y longitud del array aAlumnos
	 */
	public static int generarNumAleatorio()	{
		return (int) (Math.random()*aAlumnos.length);
	}

	
	
	public static void main(String[] args) {
		
			
		int iAleatorio = generarNumAleatorio();
		
		System.out.println("El/a voluntario/a es: " + aAlumnos[ iAleatorio ] );

	}


	
}
