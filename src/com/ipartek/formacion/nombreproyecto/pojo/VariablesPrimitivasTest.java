package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class VariablesPrimitivasTest {

	int edad  ;        //variable sin inicializar.
	int edad2 = 18;  		//variable inicializada
	
	@Test
	public void testInicializar() {
		

		assertEquals( 0, edad);
		assertEquals( 18, edad2);
		
		
		/*wrapper son clases que envuelve a una variable primittiva
		por ejemplo
		
		int =>  Integer
		char => Character
		boolean => Boolean
		*/
		
		int i = Integer.valueOf("22");   //Convierte una cadena en un numero
		assertEquals( 22, i);		//comprobamos que el valor de i es 22
		
		/* otra forma de ponerlo
		 * Integer i = Integer.valueOf("22");
		 * assertEquals( 22, (int)i);
		 */
		
		assertEquals( 22, Integer.parseInt("22"));   //nos convierte la cadena "22" a int 
		 
		assertEquals (127, Byte.MAX_VALUE); //nos comprueba que el máximo valor de un Byte es 127
		
		//Capitulo5 pag.77 Operaciones con variables.
		//si x=true nos devuelve un 5 sino un 9
		int x = (true)?5:9;
		assertEquals ("Operador ternario mal usado", 5, x);
		
	
	}

}
