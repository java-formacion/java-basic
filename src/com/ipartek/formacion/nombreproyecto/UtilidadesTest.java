package com.ipartek.formacion.nombreproyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	//test Dia Semana
	@Test
	public void testGetDiaSemana() {
		
		//Todo funciona bien
		assertEquals("Lunes", Utilidades.getDiaSemana(0));
		assertEquals("Martes", Utilidades.getDiaSemana(1));
		assertEquals("Miercoles", Utilidades.getDiaSemana(2));
		assertEquals("Jueves", Utilidades.getDiaSemana(3));
		assertEquals("Viernes", Utilidades.getDiaSemana(4));
		assertEquals("Sabado", Utilidades.getDiaSemana(5));
		assertEquals("Domingo", Utilidades.getDiaSemana(6));
				
		//Cuando funciona mal que obtengamos lo esperado		
		assertNull( Utilidades.getDiaSemana(-1));
		assertNull( Utilidades.getDiaSemana(7));
		
	}
	
	//test validar email
	@Test
	public void testValidarEmail() {
		
		//Todo funciona bien
		assertTrue(Utilidades.validarEmail("a@a.com"));
		assertFalse(Utilidades.validarEmail("a@a."));
		assertFalse(Utilidades.validarEmail("@a.com"));
		assertFalse(Utilidades.validarEmail("aa.com"));
		assertFalse(Utilidades.validarEmail("a@acom"));
		assertFalse(Utilidades.validarEmail("aacom"));
		
	}
	
	//test capitalizar string
	@Test
	public void testCapitalizar() {

		assertEquals(null, Utilidades.capitalizar(null));
		assertEquals("Borja-Manso", Utilidades.capitalizar("borja-manso"));
		assertEquals("Borja Manso", Utilidades.capitalizar("Borja Manso"));
		
		assertEquals("Borja Manso", Utilidades.capitalizar("Borja Manso"));
		assertEquals("Borja Manso", Utilidades.capitalizar("borja manso"));
		assertEquals("Borja Manso", Utilidades.capitalizar("BORJA MANSO"));
		assertEquals("Borja Manso", Utilidades.capitalizar("borja mAnso"));
		assertEquals("Borja Manso", Utilidades.capitalizar("Borja manso"));
		assertEquals("Borja Manso", Utilidades.capitalizar("   borja  Manso   "));
		
	}

}
