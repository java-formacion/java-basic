package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Candidato2Test {

	
	Candidato2 c;
	
		//antes de cada test
		@Before
		public void setUp() throws Exception {
			try {
				c = new Candidato2("Paco", "Perez", "Gomez", "22222222B", "paco@yahoo.com", Candidato2.NOTA_MINIMA);	
				
			} catch (Exception e) {
				
				fail("No debería haber fallado el setUp");
			}					 
			
		}

		//despues de cada test
		@After
		public void tearDown() throws Exception {
			c = null;
		}

		
		
	//@Ignore para que no ejecute. Se pone en vez de @Test
	@Test
	public void testCandidato(){
		
		assertEquals("Paco", c.getNombre());
		assertEquals("Perez", c.getApellido1());
		assertEquals("Gomez", c.getApellido2());
		assertEquals("22222222B", c.getDni());
		assertEquals("paco@yahoo.com", c.getEmail());
		assertEquals(Candidato2.NOTA_MINIMA, c.getNota());
		
		Candidato2 c2 = null;
		try {
			c2 = new Candidato2("", "", "","", "", Candidato2.NOTA_MINIMA - 1);
			fail("No se lanzó CandidatoException");
		} catch (CandidatoException e) {
			assertNull(c2);
		}	
		

		
	}
	
	@Test
	public void testSetNota() {
		
		//notas que no lancen CandidatoException
		assertEquals(Candidato2.NOTA_MINIMA, c.getNota());
		
		//probar el resto nosotros
		try {
			c.setNota(Candidato2.NOTA_MAXIMA);
			assertEquals(Candidato2.NOTA_MAXIMA, c.getNota());
		} catch (CandidatoException e1) {
			fail("No debería fallar al asignar NOTA_MAXIMA");
		}
		
		
		try {
			c.setNota(Candidato2.NOTA_APROBADO);
			assertEquals(Candidato2.NOTA_APROBADO, c.getNota());
		} catch (CandidatoException e1) {
			fail("No debería fallar al asignar NOTA_APROBADO");
		}
		
		
		//notas que lancen CandidatoException
		try {
			c.setNota(Candidato2.NOTA_MAXIMA + 1);
			fail("No se lanzó CandidatoException");
		} catch (CandidatoException e) {
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MAX, e.getMessage());
		}
		
		try {
			c.setNota(Candidato2.NOTA_MINIMA - 1);
			fail("No se lanzó CandidatoException");
		} catch (CandidatoException e) {
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MIN, e.getMessage());
		}
		
	}
	
	//Para probar que lanza excepciones
	@Test (expected=CandidatoException.class)
	public void textException() throws CandidatoException{
		c.setNota(-1000);
	}
	
	
	@Test
	public void testIsAceptado() {
		
		try{
			//NOTA_MINIMA
			assertFalse(c.estaAceptado());
			
			c.setNota(Candidato2.NOTA_APROBADO);
			assertTrue(c.estaAceptado());
			
			c.setNota(Candidato2.NOTA_APROBADO -1);
			assertFalse(c.estaAceptado());
			
			c.setNota(Candidato2.NOTA_MAXIMA);
			assertTrue(c.estaAceptado());
		} catch (CandidatoException e){
			fail("No debería haber fallado el test de isAceptado");
		}
		
	}
	
	/*
	 //Antes de añadir excepciones
	
	@Test
	public void test() {
		
	 	Candidato2 candidato = new Candidato2("Paco", "Perez", "Gomez", "22222222B", "paco@yahoo.com");
	 
		assertEquals("Paco", candidato.getNombre());
		assertEquals("Perez", candidato.getApellido1());
		assertEquals("Gomez", candidato.getApellido2());
		assertEquals("22222222B", candidato.getDni());
		assertEquals("paco@yahoo.com", candidato.getEmail());
		
		candidato.setNota(11);
		assertEquals(candidato.NOTA_MAXIMA, candidato.getNota());
		assertTrue(candidato.estaAceptado());
		
		candidato.setNota(-1);
		assertEquals(candidato.NOTA_MINIMA, candidato.getNota());
		assertFalse(candidato.estaAceptado());	
		
	}
	*/
}
