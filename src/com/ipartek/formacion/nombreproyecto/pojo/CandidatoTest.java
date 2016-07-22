package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Serializable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CandidatoTest extends Object {

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
		/*
		 * 
		 */
		
		/**
		 * 
		 */
	}

	@After
	public void tearDown() throws Exception {
		
		c = null;
		
	}

	@Test	
	public void testCandidato() {
		fail("Not yet implemented");
		//TODO probar test constructor		
	}

	@Test
	public void testSetNota() {
		
		//probar notas que no lancen CandidatoException
		assertEquals( Candidato.NOTA_MINIMA, c.getNota() ) ;		
			
		
		//probar notas que lancen CandidatoException
		
		try{
			c.setNota( Candidato.NOTA_MAXIMA + 1 );
			fail("No se lanzo CandidatoException");
			
		}catch( CandidatoException e){
			
			assertEquals( CandidatoException.EXCEPTION_RANGO_NOTA_MAX ,  e.getMessage() );
			
		} 	
		
		
		try{
			c.setNota(Candidato.NOTA_MINIMA - 1);  //asigno al Candidato una nota de -1 (MINIMA-1)
			fail("No se lanz� CandidatoException"); //ponemos esta linea porque si no funciona la ejecutara
		}catch( CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MIN, e.getMessage());
		}
		
		//PROBAR NOTA QUE NO LANCE EXCEPTION
		try{
			c.setNota(4);
			assertEquals(4, c.getNota());
			
		}catch( CandidatoException e){
			fail("No deberia haber fallado nota=4");
		}
		
		
		
		
		
	}

	@Test(expected=CandidatoException.class)
	public void testException() throws CandidatoException {		
		c.setNota(-1000);
	}
	
	@Test	
	public void testIsAceptado() {
		try{
			c.setNota( Candidato.NOTA_MINIMA );
			assertFalse(c.isAceptado());
			
			c.setNota(Candidato.NOTA_APROBADO);
			assertTrue ( c.isAceptado());
			
			c.setNota(Candidato.NOTA_MAXIMA);
			assertTrue( c.isAceptado());
			
		}catch(Exception e){
			fail("No deberia haber fallado el test de isAceptado");
		};
		
	}

}
