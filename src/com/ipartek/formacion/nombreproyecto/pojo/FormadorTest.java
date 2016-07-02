package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador fSinCursos;
	Formador fConCursos;
	Curso cJava;
	Curso cPhp;
	Curso cVB;
	Curso cAndroid;
	ArrayList<Curso> cursos;
	int totalInicioCursos;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fSinCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		cJava = new Curso("9877", "Curso de Java", 150);
		cPhp = new Curso("9879", "Curso de PHP", 250);
		cVB = new Curso("9900", "Curso de Visual Basic", 300);
		cAndroid = new Curso("9903", "Curso de Android", 300);
		cursos = new ArrayList<Curso>();
		cursos.add(cJava);
		cursos.add(cPhp);
		cursos.add(cVB);
		fConCursos = new Formador("Mikel", "PereZ", "PerEZ", "55555555D", "kjhfj@fdjkf.com", cursos);
		totalInicioCursos = fConCursos.getCursos().size();
	}

	@After
	public void tearDown() throws Exception {
		fSinCursos = null;
		fConCursos = null;
		cJava = null;
		cPhp = null;
		cVB = null;
		cAndroid = null;
		cursos = null;
		totalInicioCursos = 0;
	}

	@Test
	public void testConstructorSinCursos() {

		assertEquals("Marta", fSinCursos.getNom());
		assertEquals("Lekue", fSinCursos.getApell1());
		assertEquals("Arriaga", fSinCursos.getApell2());
		assertEquals("33333333C", fSinCursos.getDni());
		assertEquals("marta@gmail.com", fSinCursos.getEmail());

		assertNotNull(fSinCursos.getCursos());
		assertEquals(0, fSinCursos.getCursos().size());

	}

	@Test
	public void testConstructorConCursos() {

		assertEquals("Mikel", fConCursos.getNom());
		assertEquals("Perez", fConCursos.getApell1());
		assertEquals("Perez", fConCursos.getApell2());
		assertEquals("55555555D", fConCursos.getDni());
		assertEquals("kjhfj@fdjkf.com", fConCursos.getEmail());

		assertNotNull(fConCursos.getCursos());
		assertEquals(cursos.size(), fConCursos.getCursos().size());

		// formador con cursos null
		Formador fCursosNull = new Formador("Mikel", "PereZ", "PerEZ", "55555555D", "kjhfj@fdjkf.com", null);
		assertEquals(0, fCursosNull.getCursos().size());
		assertNotNull(fConCursos.getCursos());

		assertTrue(fSinCursos.asignarCurso(cJava));
		assertEquals(1, fSinCursos.getCursos().size());
		assertEquals("9877", fSinCursos.getCursos().get(0).getCodigo());
		assertTrue(fSinCursos.asignarCurso(cPhp));
		assertTrue(fSinCursos.asignarCurso(cVB));
		assertEquals("Curso De Php", fSinCursos.getCursos().get(1).getNombre());
		assertEquals(3, fSinCursos.getCursos().size());
		assertTrue(fSinCursos.desAsignarCurso(cPhp));
		assertEquals(2, fSinCursos.getCursos().size());
		assertTrue("No asignado correctamente", fSinCursos.asignarCurso(cPhp));
		assertFalse(fSinCursos.asignarCurso(null));
		assertEquals(3, fSinCursos.getCursos().size());

	}

	@Test
	public void testAsignarCursos() {

		
		fConCursos.asignarCurso(cAndroid);
		assertEquals(totalInicioCursos +1, fConCursos.getCursos().size());

	}

	@Test
	public void testDesAsignarCursos() {

		assertTrue(fConCursos.desAsignarCurso(cJava));
		ArrayList<Curso> listado = fConCursos.getCursos();
		assertEquals(totalInicioCursos-1, listado.size());
		assertEquals("Si desasignamos el curso " + cJava + " no debería existir", -1, listado.indexOf(cJava));
		assertFalse(fConCursos.asignarCurso(cPhp));	//curso repetido, devuelve false

	}
	
	@Test
	public void testDesAsignarCursoInexistente() {

		assertFalse(fConCursos.desAsignarCurso(new Curso("", "", 0)));
		assertEquals(totalInicioCursos,fConCursos.getCursos().size());
		assertFalse(fConCursos.desAsignarCurso(null));
		assertEquals(totalInicioCursos,fConCursos.getCursos().size());

	}
}
