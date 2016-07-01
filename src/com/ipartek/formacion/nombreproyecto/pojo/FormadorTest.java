package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador f;
	
	Curso cJava = new Curso("jav2857", "Java", 500);
	Curso cPhP = new Curso("php534","PHP",750);
	Curso cAndroid = new Curso("andr34534", "Android", 380);
	
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
		assertTrue(f.asignarCurso(cJava));
		assertTrue(f.asignarCurso(cAndroid));
		
		assertTrue(f.desAsignarCurso(cJava));
		assertEquals(1, f.getCursos().size());
		
		assertTrue(f.asignarCurso(cPhP));
		//System.out.println( f.getCursos().toString());
		assertTrue(f.desAsignarCurso(cJava));
	
	}
	
	
	
	

}
