package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
			c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "pepe@gorriti.eu", Candidato.NOTA_MINIMA);

		} catch (Exception e) {

			fail("No deberia haber fallado el SetUp");
		}

	}

	@After
	public void tearDown() throws Exception {

		c = null;

	}

	@Test

	public void testCandidato() {
		assertEquals("Pepe", c.getNombre());
		assertEquals("Gorriti", c.getApellido1());
		assertEquals("Zurrutia", c.getApellido2());
		assertEquals("1111111H", c.getDni());
		assertEquals("pepe@gorriti.eu", c.getEmail());

	}

	@Test
	public void testSetNota() {

		// probar notas que no lancen CandidatoException
		assertEquals(Candidato.NOTA_MINIMA, c.getNota());

		// probar notas que lancen CandidatoException

		try {
			c.setNota(Candidato.NOTA_MAXIMA + 1);
			fail("No se lanzo CandidatoException");

		} catch (CandidatoException e) {
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MAX, e.getMessage());
		}

		try {
			c.setNota(Candidato.NOTA_MINIMA - 1);
			fail("No se lanzo CandidatoException");

		} catch (CandidatoException e) {
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MIN, e.getMessage());
		}

		try {
			c.setNota(4);
			assertEquals(4, c.getNota());

		} catch (CandidatoException e) {
			fail("Nota mal recogida");

		}

	}

	@Test(expected = CandidatoException.class)
	public void testException() throws CandidatoException {
		c.setNota(-234);
	}

	@Test

	public void testIsAceptado() throws CandidatoException {
		c.setNota(Candidato.NOTA_MINIMA);
		assertFalse(c.isAceptado());
		c.setNota(Candidato.NOTA_APROBADO);
		assertTrue(c.isAceptado());
		c.setNota(Candidato.NOTA_MAXIMA);
		assertTrue(c.isAceptado());

	}

}
