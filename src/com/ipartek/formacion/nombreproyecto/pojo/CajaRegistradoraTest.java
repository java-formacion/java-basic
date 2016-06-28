package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegistradoraTest {

	@Test
	public void testCalcularVueltas() {
		
		
		float vueltas = 0.00f;
		
		vueltas = CajaRegistradora.calcularVueltas(2000.00f, 1326.24f);
		assertTrue(vueltas == 673.76f);
			
		vueltas = CajaRegistradora.calcularVueltas(10.00f, 26.24f);
		assertTrue(vueltas == 0.00f);
	}
	
	@Test
	public void testCalcularVueltasOptimas() {
		
	
		int[] aVueltas = null;
		aVueltas = CajaRegistradora.calcularVueltasOptimas(2000.00f, 1326.24f);	
		assertNotNull(aVueltas);
		
		assertEquals(13, aVueltas[0]);
		assertEquals(1, aVueltas[1]);
		assertEquals(0, aVueltas[2]);
		assertEquals(0, aVueltas[3]);
		assertEquals(1, aVueltas[4]);
		assertEquals(1, aVueltas[5]);
		assertEquals(1, aVueltas[6]);
		assertEquals(1, aVueltas[7]);
		assertEquals(0, aVueltas[8]);
		assertEquals(1, aVueltas[9]);
		assertEquals(0, aVueltas[10]);
		assertEquals(1, aVueltas[11]);
		
		aVueltas = CajaRegistradora.calcularVueltasOptimas(1000.00f, 1326.24f);	
		assertNotNull(aVueltas);
		
		assertEquals(0, aVueltas[0]);
		assertEquals(0, aVueltas[1]);
		assertEquals(0, aVueltas[2]);
		assertEquals(0, aVueltas[3]);
		assertEquals(0, aVueltas[4]);
		assertEquals(0, aVueltas[5]);
		assertEquals(0, aVueltas[6]);
		assertEquals(0, aVueltas[7]);
		assertEquals(0, aVueltas[8]);
		assertEquals(0, aVueltas[9]);
		assertEquals(0, aVueltas[10]);
		assertEquals(0, aVueltas[11]);	
	}
	
	
	@Test
	public void testImprimirVueltasOptimas() {
		
	
		int[] aVueltas = null;
		assertEquals("No hay vueltas que devolver.", CajaRegistradora.imprimirVueltasOptimas(aVueltas));
		
		aVueltas = CajaRegistradora.calcularVueltasOptimas(2000.00f, 1326.24f);	
		assertNotEquals("", CajaRegistradora.imprimirVueltasOptimas(aVueltas));
		
		aVueltas = CajaRegistradora.calcularVueltasOptimas(200.00f, 1326.24f);	
		assertNotEquals("", CajaRegistradora.imprimirVueltasOptimas(aVueltas));	
	}

}
