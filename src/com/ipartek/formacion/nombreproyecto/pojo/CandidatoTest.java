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
			
			c = new Candidato("Pepe", "gorriti", "zurrutia", "1111111H", "pepe@gorriti.org", Candidato.NOTA_MINIMA );
		
		}catch(Exception e){
		
			fail("No deberia haber fallado el setup");
		}
		
	}

	@After
	public void tearDown() throws Exception {
		
		c = null;
	}

	//@Test
	@Ignore
	public void testCandidato() {
		try{
			c.setNota(0);
			assertEquals(false, c.isAceptado());
			c.setNota(5);
			assertEquals(true, c.isAceptado());
			c.setNota(10);
			assertEquals(true, c.isAceptado());
		}catch(Exception e){
			fail("No deberia haber fallado el test de isAceptado");
		};
		
		
		
	}

	@Test
	public void testSetNota() {
		
		//probar nota que no lance exception
		assertEquals(Candidato.NOTA_MINIMA, c.getNota() );

		//probar notas que lancen CandidatoException  nota>10 y nota<0
		try{
			c.setNota(Candidato.NOTA_MAXIMA + 1);  //asigno al Candidato una nota de 11 (MAXIMA+1)
			fail("No se lanzó CandidatoException"); //ponemos esta linea porque si no funciona la ejecutara
		}catch( CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MAX, e.getMessage());
		}
		
		try{
			c.setNota(Candidato.NOTA_MINIMA - 1);  //asigno al Candidato una nota de -1 (MINIMA-1)
			fail("No se lanzó CandidatoException"); //ponemos esta linea porque si no funciona la ejecutara
		}catch( CandidatoException e){
			assertEquals(CandidatoException.EXCEPTION_RANGO_NOTA_MIN, e.getMessage());
		}
		
		//PROBAR NOTA QUE NO LANCE EXCEPTION
		try{
			c.setNota(4);
			assertEquals(4, c.getNota());
			System.out.println("ha pasado nota=4 sin lanzar excepciones");
		}catch( CandidatoException e){
			fail("No deberia haber fallado nota=4");
		}
		
		
		
	}

	//@Test
	@Ignore
	public void testIsAceptado() {
		fail("Not yet implemented");
	}

}
