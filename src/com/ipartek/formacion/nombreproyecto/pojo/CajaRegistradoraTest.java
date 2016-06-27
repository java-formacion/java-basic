package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaRegistradoraTest {

	@Test
	public void testCalcularVueltas() {
		assertTrue(20.0 == CajaRegistradora.calcularVueltas(40.0f, 20.0f));
	}

}
