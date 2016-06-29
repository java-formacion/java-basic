package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class VariablesPrimitivasTest {

	
	int edad;
	int edad2 = 18;
	
	@Test
	public void testInicialiazar() {
		
		
		assertEquals(0, edad);
		assertEquals(18, edad2);
		
		//Wrapper: son clases que envuelven a una variable primitiva
		//int => Integer
		//char => Character
		//boolean => Boolean
		
		int i = Integer.valueOf("22");
		assertEquals(22, i);
		
		assertEquals(22,  Integer.parseInt("22"));
		
		assertEquals(127, Byte.MAX_VALUE);
		
		@SuppressWarnings("unused")
		int x = (true)?5:9; //Operador ternario, para asignar valores. Si x es true then asignar valor de 5, else 9.
		assertEquals("Operador ternario mal usado", 5, x);
		
	}

}
