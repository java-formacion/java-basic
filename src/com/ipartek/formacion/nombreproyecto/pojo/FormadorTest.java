package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador fCon,fSin;
	Curso cJava, cAndroid, cPhP;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fCon = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		fSin = new Formador("Ernesto", "Pecho", "Presto", "33333333C", "marta@gmail.com");
		cJava = new Curso("jav2857", "Java", 500);
		cPhP = new Curso("php534", "PHP", 750);
		cAndroid = new Curso("andr34534", "Android", 380);
	}

	@After
	public void tearDown() throws Exception {
		fCon = null;
		fSin = null;
	}

	@Test
	public void testConConstructor() {
		assertEquals("Marta", fCon.getNombre());
		assertEquals("Lekue", fCon.getApellido1());
		assertEquals("Arriaga", fCon.getApellido2());
		assertEquals("33333333C", fCon.getDni());
		assertEquals("marta@gmail.com", fCon.getEmail());

		assertNotNull(fCon.getCursos());
		assertEquals(0, fCon.getCursos().size());
		
		// formador con cursos null
		//Formador fCursosNull = new Formador("Ernesto", "Pecho", "Presto", "33333333C", "marta@gmail.com");
		
		
	}
	
	@Test
	public void testSinConstructor() {
		assertEquals("Ernesto", fSin.getNombre());
		assertEquals("Pecho", fSin.getApellido1());
		assertEquals("Presto", fSin.getApellido2());
		assertEquals("33333333C", fSin.getDni());
		assertEquals("marta@gmail.com", fSin.getEmail());

		assertNotNull(fCon.getCursos());
		assertEquals(3, fCon.getCursos().size());
	}

	@Test
	public void testConstructorParametros() {
		assertNotNull(fCon);
		assertTrue(fCon.asignarCurso(cJava));
		assertTrue(fCon.asignarCurso(cAndroid));

		assertTrue(fCon.desAsignarCurso(cJava));
		assertEquals(1, fCon.getCursos().size());

		assertTrue(fCon.asignarCurso(cPhP));
		// System.out.println( f.getCursos().toString());
		assertTrue(fCon.desAsignarCurso(cJava));

	}

}
