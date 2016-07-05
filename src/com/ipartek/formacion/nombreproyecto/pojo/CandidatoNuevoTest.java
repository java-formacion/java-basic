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

public class CandidatoNuevoTest {

	CandidatoNuevo c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try{
			c = new CandidatoNuevo("Borja", "Manso", CandidatoNuevo.NOTA_MINIMA);
			
		}catch(Exception e){
			fail("No deberia haber fallado el SetUp");			
		}
		
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
//	@Ignore Ignora el test
	public void testCandidatoNuevo() {
		
		try{
			c.setNombre("gOrkA");
			assertEquals("Gorka", c.getNombre());
			
			c.setApellido1("mANSO");
			assertEquals("Manso", c.getApellido1());
		}catch (Exception e){
			fail("No se lanzó exception");
		}
	}

	@Test
	public void testSetNota() {
		
//		probar notas que no lancen CandidatoException
		assertEquals(CandidatoNuevo.NOTA_MINIMA, c.getNota());
		
		try{
			c.setNota(CandidatoNuevo.NOTA_MINIMA+1);
			assertEquals(CandidatoNuevo.NOTA_MINIMA+1, c.getNota());
			
			c.setNota(CandidatoNuevo.NOTA_MAXIMA-1);
			assertEquals(CandidatoNuevo.NOTA_MAXIMA-1, c.getNota());
			
			c.setNota(CandidatoNuevo.NOTA_MAXIMA);
			assertEquals(CandidatoNuevo.NOTA_MAXIMA, c.getNota());
		}catch(Exception e){
			
			fail("No se lanzó Exception");
		}
		
		
		
//		probar notas que lancen CandidatoException
		try{
			c.setNota(CandidatoNuevo.NOTA_MAXIMA+1);
			fail("No se lanzó CandidatoException");
			
		}catch(CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MAX, e.getMessage());
		}
		
		try{
			c.setNota(CandidatoNuevo.NOTA_MINIMA-1);
			fail("No se lanzó CandidatoException");
			
		}catch(CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MIN, e.getMessage());
		}
		
	}

	@Test
//	@Ignore Ignora el test
	public void testIsAceptado() {
		
		try{
			c.setNota(CandidatoNuevo.NOTA_MINIMA);
			assertFalse(c.isAceptado());
			
			c.setNota(CandidatoNuevo.NOTA_ACEPTADO);
			assertTrue(c.isAceptado());
			
			c.setNota(CandidatoNuevo.NOTA_MAXIMA);
			assertTrue(c.isAceptado());
		}catch(Exception e){
		
			fail("No se lanzó Exception");
		}
	}
	
	
	//assert insertada directamente en la anotacion Test
	@Test(expected=CandidatoException.class)
	public void testException() throws CandidatoException {
		c.setNota(-1000);
	
	}

}
