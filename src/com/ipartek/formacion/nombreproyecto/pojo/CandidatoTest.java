package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CandidatoTest {
	Candidato c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try {
			 c = new Candidato("leopoldo", "goldo", "moldo", "54621332f", "leopoldo@gmail.com", Candidato.NOTA_MINIMA);
		} catch (Exception e) {
			fail("No deberia de haber fallado el SetUp");
		}
		
	}

	@After
	public void tearDown() throws Exception {
		 c = null;
	}

	//@Test
	@Ignore
	public void testCandidato() {
	}

	@Test
	public void testSetNota() {
		assertEquals(Candidato.NOTA_MINIMA , c.getNota());
		assertEquals(Candidato.NOTA_MINIMA, c.getNota());
		
		try {
			c.setNota(Candidato.NOTA_MAXIMA+1);
			fail("No se lanzo CandidatoExcepcion");
		} catch (CandidatoExcepcion e) {
			assertEquals(CandidatoExcepcion.EXCEPCION_RANGO_NOTA_MAX, e.getMessage());
			
		}
		
		try {
			c.setNota(Candidato.NOTA_MINIMA);
			fail("No se lanzo CandidatoExcepcion");
		} catch (CandidatoExcepcion e) {
			assertEquals(CandidatoExcepcion.EXCEPCION_RANGO_NOTA_MIN, e.getMessage());
		}
	}

	//@Test
	@Ignore
	public void testIsAceptado() {
	}
	
	
	@Test(expected = CandidatoExcepcion.class)
	public void testException() throws CandidatoExcepcion{
		c.setNota(-1000);
	}

}
