package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegistradoraTest {

	@Test
	public void testCalcularVueltas() {
		assertTrue(673.76f == CajaRegistradora.calcularVueltas(1326.24f, 2000f));
		assertFalse(673f == CajaRegistradora.calcularVueltas(1326.24f, 2000f));
		assertFalse(674f == CajaRegistradora.calcularVueltas(1326.24f, 2000f));
		
		assertTrue(188.97f == CajaRegistradora.calcularVueltas(1.01f, 189.98f));
		assertTrue(1f == CajaRegistradora.calcularVueltas(9f, 10f));
		
	}
	
	
	@Test
	public void testCalcularVueltasOptimas() {
		int [] vueltas = {13,1,0,0,1,1,1,1,0,1,0,1};
		
		assertTrue("Biletes 50 mal calculados", 13== vueltas[0]);
		assertTrue("Biletes 20 mal calculados", 1== vueltas[1]);
		assertTrue("Biletes 10 mal calculados", 0== vueltas[2]);
		assertTrue("Biletes 5 mal calculados", 0== vueltas[3]);
		assertTrue("Monedas 2€ mal calculados", 1== vueltas[4]);
		assertTrue("Monedas 1€ mal calculados", 1== vueltas[5]);
		assertTrue("Monedas 50cents mal calculados", 1== vueltas[6]);
		assertTrue("Monedas 20cents mal calculados", 1== vueltas[7]);
		assertTrue("Monedas 10cents mal calculados", 0== vueltas[8]);
		assertTrue("Monedas 5cents mal calculados", 1== vueltas[9]);
		assertTrue("Monedas 2cents mal calculados", 0== vueltas[10]);
		assertTrue("Monedas 1cent mal calculados", 1== vueltas[11]);
		
	}
	

}
