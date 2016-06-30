package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador f; 
	Curso cJava, cPhp, cVisualBasic;
	ArrayList<Curso> listaCursos;
	
	//segun arranca
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	//segun termina
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	//antes de cada test
	@Before
	public void setUp() throws Exception {
		f = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		Curso cJava = new Curso("390","Java", 175);
		Curso cPhp= new Curso("789","PHP", 120);
		Curso cVisualVasic = new Curso("698","Visual Basic", 380);
	}

	//despues de cada test
	@After
	public void tearDown() throws Exception {
		f = null;
		cJava = null;
		cPhp = null;
		cVisualBasic = null;
	}

	
	
	@Test
	public void testConstructor() {
		
		
		
		assertEquals("Marta", f.getNombre());
		assertEquals("Lekue", f.getApellido1());
		assertEquals("Arriaga", f.getApellido2());
		assertEquals("33333333C", f.getDni());
		assertEquals("marta@gmail.com", f.getEmail());
		
		/*
		 //antes de los cambios 
		assertNotNull(f.getCursos());
		assertEquals(0, f.getCursos().size());
		
		
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Curso c = new Curso("789","PHP", 120);
		cursos.add(c);
		f.setCursos(cursos);
		assertNotNull(f.getCursos());
		
		assertEquals("789", f.getCursos().get(0).getCodigo());
		assertEquals("PHP", f.getCursos().get(0).getNombre());
		assertEquals(120, f.getCursos().get(0).getHoras());
		*/
			
	}
	
	@Test
	public void testConstructorParametros() {
		
		
	}
	
	
	@Test
	public void testGestionCursos() {
		
		assertEquals(0, f.getCursos().size());
		
		assertTrue(f.asignarCurso(cJava));
		assertEquals(1, f.getCursos().size());
		
		assertTrue(f.asignarCurso(cPhp));
		assertEquals(2, f.getCursos().size());
		
		assertTrue(f.asignarCurso(cVisualBasic));		
		assertEquals(3, f.getCursos().size());
		
		assertTrue(f.desasignarCurso(cPhp));
		assertEquals(2, f.getCursos().size());
		
		assertTrue(f.desasignarCurso(cVisualBasic));
		assertEquals(1, f.getCursos().size());
		
		assertTrue(f.desasignarCurso(cJava));
		assertEquals(0, f.getCursos().size());
		
	}
	

	
	
}
