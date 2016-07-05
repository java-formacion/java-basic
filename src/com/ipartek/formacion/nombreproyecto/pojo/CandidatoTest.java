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
		try{
			c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "pepe@gorriti.eu", Candidato.NOTA_MINIMA );
			
		}catch(Exception e){
			
			fail("No deberia haber fallado el SetUp");
		}	
		
	}

	@After
	public void tearDown() throws Exception {
		
		c = null;
		
	}

	//@Test
	@Ignore
	public void testCandidato() {
		fail("Not yet implemented");
		
		
		
	}

	@Test
	public void testSetNota() {
		
		//probar notas que no lancen CandidatoException
		assertEquals( Candidato.NOTA_MINIMA, c.getNota() ) ;		
		//TODO probar el resto vosotros
		
		
		//probar notas que lancen CandidatoException
		
		try{
			c.setNota( Candidato.NOTA_MAXIMA + 1 );
			fail("No se lanzo CandidatoException");
			
		}catch( CandidatoException e){
			
			assertEquals( CandidatoException.EXCEPTION_RANGO_NOTA_MAX ,  e.getMessage() );
			
		} 	
		
		
		
		
	}

	//@Test
	@Ignore
	public void testIsAceptado() {
		fail("Not yet implemented");
	}

}
