package com.ipartek.formacion.nombreproyecto.pojo;

public class Excepcion1 {

	// propiedades necesarias

	static int array_corto[] = new int[5];

	public static void main(String args[]) {

		try {

			System.out.println();

			System.out.println(".antes de la excepcion");

			//array_corto[10] = 10;
			
			/*
			int num = 0;
			int res;
			res = 20/num;
			*/

			System.out.println(".no hay una excepcion");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			// se captura una excepci�n por intentar acceder a una posici�n

			// fuera de los l�mites del array.

			System.out.println(".hay una excepcion por acceso incorrecto");

		}

		catch (ArithmeticException e) {

			// se captura una excepci�n aritm�tica.

			System.out.println(".hay una excepcion por error aritmetico");

		}

		finally {

			// despu�s del try catch...

			System.out.println(".siempre se ejecuta [finally]");

		}

	}

}