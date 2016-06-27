package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetDiaSemana() {
		//Todo funciona bien
		assertEquals("lunes", Utilidades.getDiaSemana(0));
		assertEquals("martes", Utilidades.getDiaSemana(1));
		assertEquals("miercoles", Utilidades.getDiaSemana(2));
		assertEquals("jueves", Utilidades.getDiaSemana(3));
		assertEquals("viernes", Utilidades.getDiaSemana(4));
		assertEquals("sabado", Utilidades.getDiaSemana(5));
		assertEquals("domingo", Utilidades.getDiaSemana(6));
		
		//cuando funciona mal que obtengamos lo esperado
		assertNull(Utilidades.getDiaSemana(-1));
		assertNull(Utilidades.getDiaSemana(7));
		
		assertTrue(Utilidades.validarEmail("andoniluna22@hotmail.com"));
		assertFalse(Utilidades.validarEmail("andoniluna22hotmail.com"));
		assertFalse(Utilidades.validarEmail("andoniluna22@hotmail"));
		assertFalse(Utilidades.validarEmail("andoniluna22@hotmail."));
		assertFalse(Utilidades.validarEmail("@hotmail.com"));
		assertFalse(Utilidades.validarEmail("rgfgjh"));
	}

}
