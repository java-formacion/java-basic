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
	Curso cJava, cPHP, cAndroid;
	ArrayList<Curso> lista;
	int totalCursos;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		fSinCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");

		cJava = new Curso("jav2857", "java", 500);
		cPHP = new Curso("php456", "php", 500);
		cAndroid = new Curso("and345", "android", 500);

		lista = new ArrayList<Curso>();
		lista.add(cJava);
		lista.add(cPHP);
		lista.add(cAndroid);

		fConCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", lista);
	}

	@After
	public void tearDown() throws Exception {
		fSinCursos = null;
	}

	@Test
	public void testConstructorFormadorSinCursos() {

		assertEquals("Marta", fSinCursos.getNombre());
		assertEquals("Lekue", fSinCursos.getApellido1());
		assertEquals("Arriaga", fSinCursos.getApellido2());
		assertEquals("33333333C", fSinCursos.getDni());
		assertEquals("marta@gmail.com", fSinCursos.getEmail());

		assertNotNull(fSinCursos.getCursos());
		assertEquals(0, fSinCursos.getCursos().size());

	}

	@Test
	public void testConstructorFormadorConCursos() {

		assertEquals("Marta", fConCursos.getNombre());
		assertEquals("Lekue", fConCursos.getApellido1());
		assertEquals("Arriaga", fConCursos.getApellido2());
		assertEquals("33333333C", fConCursos.getDni());
		assertEquals("marta@gmail.com", fConCursos.getEmail());

		assertNotNull(fConCursos.getCursos());
		assertEquals(lista.size(), fConCursos.getCursos().size());

		// formador con cursos null
		Formador fCursosNull = new Formador("", "", "", "", "", null);
		assertNotNull(fCursosNull.getCursos());
		assertEquals(0, fCursosNull.getCursos().size());
	}

	@Test
	public void testAsignacionCursos() {
		totalCursos = fConCursos.getCursos().size();
		
		fConCursos.asignarCurso(cAndroid);
		assertEquals(totalCursos, fConCursos.getCursos().size());
	}

	@Test
	public void testConstructorParametros() {

		assertNotNull(fSinCursos);

	}

}
