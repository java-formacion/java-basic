package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {
	
	int totalInicioCursos;
	Formador fSinCursos;
	Formador fConCursos;
	Curso cJava,cPhp, cVisualBasic;	
	ArrayList<Curso> listaCursos;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
				
		fSinCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		fConCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", listaCursos);
		
		cJava = new Curso("cj01", "Curso Java", 80);
		cPhp = new Curso("cp03", "Curso PHP", 100);
		cVisualBasic = new Curso("cvb08", "Curso Visual Basic", 50);
		
		listaCursos = new ArrayList<Curso>();
		listaCursos.add(cJava);
		listaCursos.add(cPhp);
		listaCursos.add(cVisualBasic);

		totalInicioCursos = fConCursos.getCursos().size();
	}

	@After
	public void tearDown() throws Exception {
		
		fSinCursos = null;
		fConCursos = null;
		cJava = null;
		cPhp = null;
		cVisualBasic = null;
		listaCursos = null;
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
	public void testConstructorConCursos(){
	
		//probar dos constructores
		//probar asignar curso y desasignar curso
		//Asignar cJava, cPhp, cVB e ir viendo la longitud
		//Desasignar cJava, cPhp, cVB e ir viendo la longitud
		
		assertEquals("Marta", fConCursos.getNombre());
		assertEquals("Lekue", fConCursos.getApellido1());
		assertEquals("Arriaga", fConCursos.getApellido2());
		assertEquals("33333333C", fConCursos.getDni());
		assertEquals("marta@gmail.com", fConCursos.getEmail());

		assertNotNull(fConCursos.getCursos());
		assertEquals(listaCursos.size(), fConCursos.getCursos().size());	
		
		//formador con cursos null
		Formador fCursosNull = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", null);
		assertNotNull(fCursosNull.getCursos());
		assertEquals(0,  fCursosNull.getCursos().size());	
	}
	
	
	@Test
	public void testAsignacionCursos(){
		
		assertTrue(fConCursos.asignarCurso(cJava));
		assertEquals(totalInicioCursos+1, fConCursos.getCursos().size());	
		
//		assertTrue(fConCursos.asignarCurso(cPhp));
//		assertEquals(totalInicioCursos+2, fConCursos.getCursos().size());	
//		
//		assertTrue(fConCursos.asignarCurso(cVisualBasic));
//		assertEquals(totalInicioCursos+3, fConCursos.getCursos().size());	
		
		
	}
	
	
	@Test
	public void testDesasignacionCursos(){
		
		assertTrue(fConCursos.desAsignarCurso(cJava));
		ArrayList<Curso> listado = fConCursos.getCursos();
		assertEquals(totalInicioCursos+2, fConCursos.getCursos().size());	
		assertEquals("Si desasignamos el curso " + " no deberia existir", -1, listado.size());
		
		assertTrue(fConCursos.desAsignarCurso(cPhp));
		assertEquals(totalInicioCursos+1, fConCursos.getCursos().size());	
		
		assertTrue(fConCursos.desAsignarCurso(cVisualBasic));
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());	
		
		
		assertFalse(fConCursos.desAsignarCurso(cJava));
		
		
	}
	
	@Test
	public void testDesasignarCursoNoExistente(){
		
		assertFalse(fConCursos.desAsignarCurso(new Curso("", "", 0)));
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
		
		fConCursos.desAsignarCurso(null);
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
		
	}

}