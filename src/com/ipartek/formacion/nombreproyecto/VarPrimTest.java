package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class VarPrimTest {
		int edad;
		int edad2=18;
	@Test
	public void test() {
		
		
		assertEquals(18, edad2);
		assertEquals(0, edad);
		
		//wrapper son clases que envuelven a una variable primitiva y da funcionalidades nuevas
		
		//int -> Integer
		Integer.valueOf("22");
	
	}

}
    