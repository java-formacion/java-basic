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
	Candidato c1;
	Candidato c2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception{
		try{
			c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "Pepe@gmail.com", Candidato.NOTA_MINIMA);
			c1 = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "Pepe@gmail.com", Candidato.NOTA_MAXIMA);
			c2 = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "Pepe@gmail.com", Candidato.NOTA_APROBADO);
		}catch(Exception e){
			fail("No deberia fallar el SetUp");
		}
	}
	
	@After
	public void tearDown() throws Exception{
		c = null;
		c1 = null;
		c2 = null;
	}
	
	//@Test
	@Ignore
	public void testCandidato() {
		
	}
	@Test
	public void testSetNota(){
		//probar notas que no lancen Exception
		assertEquals(Candidato.NOTA_MINIMA, c.getNota());
		
		//TODO probar el resto vosotros
		
		//Probar notas que lancen CandidatoException
		try{
			c.setNota(Candidato.NOTA_MAXIMA+1);
			fail("No se ha lanzado CandidatoException");
		}catch (CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MAX,e.getMessage());
		}
		try{
			c.setNota(Candidato.NOTA_MINIMA-1);
			fail("No se ha lanzado CandidatoException");
		}catch (CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MIN,e.getMessage());
		}
	}
	@Test
	public void testIsAceptado(){
		assertFalse(c.isAceptado());
		assertTrue(c1.isAceptado());
		assertTrue(c2.isAceptado());
	}
}