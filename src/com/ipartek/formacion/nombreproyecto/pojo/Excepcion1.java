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

			// se captura una excepción por intentar acceder a una posición

			// fuera de los límites del array.

			System.out.println(".hay una excepcion por acceso incorrecto");

		}

		catch (ArithmeticException e) {

			// se captura una excepción aritmética.

			System.out.println(".hay una excepcion por error aritmetico");

		}

		finally {

			// después del try catch...

			System.out.println(".siempre se ejecuta [finally]");

		}

	}

}
