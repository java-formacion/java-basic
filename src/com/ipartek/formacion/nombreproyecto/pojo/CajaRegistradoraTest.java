package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegistradoraTest {

	@Test
	public void testCalcularVueltas() {
		assertEquals(CajaRegistradora.calcularVueltas(1000, 750), 250);
	}

}
