package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

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
		try{
			c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "pepe@gorriti.eu", Candidato.NOTA_MINIMA );
			
		}catch(Exception e){
			
			fail("No deberia haber fallado el SetUp");
		}	
		
		try{
		
		c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "pepe@gorriti.eu", Candidato.NOTA_MAXIMA );
		
	}catch(Exception e){
		
		fail("No deberia haber fallado el SetUp");
	}	
		
		
		try{
			
			c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "pepe@gorriti.eu", Candidato.NOTA_APROBADO );
			
		}catch(Exception e){
			
			fail("No deberia haber fallado el SetUp");
		}	
		
	
		
	}

	@After
	public void tearDown() throws Exception {
		
		c = null;
		
	}

	//@Test
	
	public void testCandidato() {
		
		
		
		
		//TODO PROBAR  TEST CONSTRUCTOR
		
		/**
		 * 
		
		assertEquals(Candidato.NOTA_MINIMA, c.getNota());
		assertEquals(Candidato.NOTA_MAXIMA, c.getNombre());
		assertEquals(Candidato.NOTA_APROBADO,c.getNota());
		
		 */
			
		
	}

	@Test
	public void testSetNota() {
		
		//probar notas que no lancen CandidatoException
		assertEquals( Candidato.NOTA_MINIMA, c.getNota() );
		assertEquals(Candidato.NOTA_MAXIMA,c.getNota() );
		assertEquals(Candidato.NOTA_APROBADO,  c.getNota());
		//TODO probar el resto vosotros
		
		
		//probar notas que lancen CandidatoException
		
		try{
			c.setNota( Candidato.NOTA_MAXIMA + 1 );
			fail("No se lanzo CandidatoException");
			
		}catch( CandidatoException e){
			
			assertEquals( CandidatoException.EXCEPTION_RANGO_NOTA_MAX ,  e.getMessage() );
			
		} 	
		
		
		try {
			c.setNota(Candidato.NOTA_MINIMA - 1);
			fail("No se lanzo CandidatoException");
			
		} catch (CandidatoException e){
			assertEquals( CandidatoException.EXCEPTION_RANGO_NOTA_MIN, e.getMessage());
		}
		
		try {
			c.setNota(4);
			fail("No deberia haber lanzado una excepcion nota= 4");
			
		} catch (CandidatoException e){
			assertEquals( 4, e.getMessage());
		}
		
		
		
		
		try {
			c.setNota(Candidato.NOTA_APROBADO);
			
			
		} catch (CandidatoException e) {
			fail("No se debera fallar Nota_Aprobado");
		}
		
		
		
	}

	//@Test
	
	public void testIsAceptado() {
		try {
			c.setNota(Candidato.NOTA_MINIMA);
			assertFalse(c.isAceptado());
			
			c.setNota(Candidato.NOTA_APROBADO);
			assertTrue(c.isAceptado());
			
			c.setNota(Candidato.NOTA_MAXIMA);
			assertTrue(c.isAceptado());
			
		} catch (Exception e) {
			fail("No deberia haber fallado el isAceptado");
		}
			
		
		
		
	}

}
