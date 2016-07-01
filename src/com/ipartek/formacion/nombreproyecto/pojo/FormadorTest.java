package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador fSinCursos, fConCursos;
	
	Curso cJava, cPhp, cVisual;
	ArrayList<Curso> lista;
	
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
		fConCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", lista);
		cJava = new Curso("cod1", "Java 7", 510);
		cPhp = new Curso("cod2", "PHP", 490);
		cVisual = new Curso("cod3", "Visual .net", 510);
		totalInicioCursos = fConCursos.getCursos().size();
		
		lista = new ArrayList<Curso>();
		lista.add(cJava);
		lista.add(cPhp);
		lista.add(cVisual);
	}

	@After
	public void tearDown() throws Exception {
		fSinCursos = null;
		fConCursos = null;
		cJava = null;
		cPhp = null;
		cVisual = null;
		lista = null;
		totalInicioCursos = 0;
	}

	
	@Test
	public void testConstructorSinCursos() {
		
		assertEquals("Marta", fSinCursos.getNombre());
		assertEquals("Lekue", fSinCursos.getApellido1());
		assertEquals("Arriaga", fSinCursos.getApellido2());
		assertEquals("33333333C", fSinCursos.getDni());
		assertEquals("marta@gmail.com", fSinCursos.getEmail());

		assertNotNull(fSinCursos.getCursos());
		assertEquals(0, fSinCursos.getCursos().size());
		
	}
	
	@Test
	public void testConstructorConCursos() {
		
		assertEquals("Marta", fConCursos.getNombre());
		assertEquals("Lekue", fConCursos.getApellido1());
		assertEquals("Arriaga", fConCursos.getApellido2());
		assertEquals("33333333C", fConCursos.getDni());
		assertEquals("marta@gmail.com", fConCursos.getEmail());
		
		assertNotNull(fConCursos.getCursos());
		assertEquals(lista.size(),fConCursos.getCursos().size());
		
		//formador con cursos null
		Formador fCursosNull = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", null);
		assertNotNull(fCursosNull.getCursos());
		assertEquals(0,fCursosNull.getCursos().size());
	}
	@Test
	public void testAsignacionCursos() {
		assertTrue(fConCursos.asignarCurso(cJava));
		assertEquals(totalInicioCursos+1, fConCursos.getCursos().size());
		assertTrue(fConCursos.desAsignarCurso(cJava));
		ArrayList<Curso>listado = fConCursos.getCursos();
		assertEquals(totalInicioCursos, listado.size());
		assertEquals("Si borramos el curso no deberia existir",-1, listado.indexOf(cJava));
	}
	@Test
	public void testDesAsignacionCursos() {
		//assertTrue(fConCursos.desAsignarCurso(cJava.getCodigo()));
		ArrayList<Curso>listado = fConCursos.getCursos();
		assertEquals(totalInicioCursos, listado.size());
		assertEquals("Si borramos el curso no deberia existir",-1, listado.indexOf(cJava));
	}
	@Test
	public void testDesAsignacionCursoNoExistente() {
		assertFalse(fConCursos.desAsignarCurso(new Curso("", "", 0)));
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
		
		assertFalse(fConCursos.desAsignarCurso(null));
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
	}
}
