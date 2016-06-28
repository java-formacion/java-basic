package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegistradoraTest {

	@Test
	public void testVueltas(){
		float resul=CajaRegistradora.Vueltas();
		assertNotEquals(673.75, resul);
	}
	
	@Test
	public void testVueltasOptimas() {
		int [] resultado = CajaRegistradora.VueltasOptimas((float) 673.76);
		assertEquals(13, resultado[0]);
		assertEquals(1, resultado[1]);
		assertEquals(0, resultado[2]);
		assertEquals(0, resultado[3]);
		assertEquals(1, resultado[4]);
		assertEquals(1, resultado[5]);
		assertEquals(1, resultado[6]);
		assertEquals(1, resultado[7]);
		assertEquals(0, resultado[8]);
		assertEquals(1, resultado[9]);
		assertEquals(0, resultado[10]);
		assertEquals(1, resultado[11]);
	}
}
