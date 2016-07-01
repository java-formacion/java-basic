package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	ArrayList<Curso> cursos;

	Curso c1;
	Curso c2;
	Curso c3;
	Curso c4;
	Curso c5;
	Curso c6;

	/**
	 * formador sin cursos
	 */
	Formador f1;
	/**
	 * formador con 2 cursos
	 */
	Formador f2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c1 = new Curso("IFC01", "Java", 350);
		c2 = new Curso("IFC02", "Php", 250);
		c3 = new Curso("IFC03", "VB", 150);
		c4 = new Curso("IFC04", "KamaSutra Avanzado", 650);
		c5 = new Curso("IFC05", "Como no dar ni golpe", 0);
		c6 = new Curso("IFC06", "Vivir del cuento", 10);

		cursos = new ArrayList<Curso>();

		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);

		f1 = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		f2 = new Formador("Paco", "porras", "pepinillo", "12324555H", "pacopope@gmail.com", cursos);

	}

	@After
	public void tearDown() throws Exception {
		f1 = null;
		f2 = null;

		c1 = null;
		c2 = null;
		c3 = null;
		c4 = null;
		c5 = null;
		c6 = null;

		cursos = null;

	}

	@Test
	public void testConstructorSinCursos() {

		assertEquals("Marta", f1.getNombre());
		assertEquals("Lekue", f1.getApellido1());
		assertEquals("Arriaga", f1.getApellido2());
		assertEquals("33333333C", f1.getDni());
		assertEquals("marta@gmail.com", f1.getEmail());

		assertNotNull(f1.getCursos());
		assertNotNull(f2.getCursos());
		assertEquals(cursos.size(), f2.getCursos().size());
		assertEquals(0, f1.getCursos().size());

		assertTrue(f2.asignarCurso(c4));
		assertEquals(4, f2.getCursos().size());
		
		f2.asignarCurso(c5);
		f2.asignarCurso(c6);
		assertEquals(6, f2.getCursos().size());
		
		f2.desAsignarCurso(c5);
		assertEquals(5, f2.getCursos().size());
		assertFalse(f2.desAsignarCurso(c5));
		
		assertFalse(f2.asignarCurso(null));
		assertEquals(5, f2.getCursos().size());
		
		assertFalse(f1.desAsignarCurso(c5));
		assertFalse(f1.desAsignarCurso(new Curso("", "", 0)));
		assertFalse(f1.desAsignarCurso(null));

	}

	@Test
	public void testConstructorParametros() {

		assertNotNull(f1);

	}

}
