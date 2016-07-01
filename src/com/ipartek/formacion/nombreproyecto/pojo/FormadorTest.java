package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador f;
	Curso cJava, cPhp, cVisual;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		f = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
	}

	@After
	public void tearDown() throws Exception {
		f = null;
	}

	
	@Test
	public void testConstructor() {
		
		assertEquals("Marta", f.getNombre());
		assertEquals("Lekue", f.getApellido1());
		assertEquals("Arriaga", f.getApellido2());
		assertEquals("33333333C", f.getDni());
		assertEquals("marta@gmail.com", f.getEmail());

		assertNotNull(f.getCursos());
		assertEquals(0, f.getCursos().size());
		
	}
	
	@Test
	public void testConstructorParametros() {
		
		assertNotNull(f);

		cJava = new Curso("cod1", "Java 7", 510);
		cPhp = new Curso("cod2", "PHP", 490);
		cVisual = new Curso("cod3", "Visual .net", 510);
		assertNotNull(f.getCursos());
		assertTrue(f.asignarCurso(cJava));
		assertTrue(f.asignarCurso(cPhp));
		assertTrue(f.asignarCurso(cVisual));
		assertEquals(3, f.getCursos().size());
		assertTrue(f.desAsignarCurso(cVisual));
		assertEquals(2, f.getCursos().size());
	}

}
