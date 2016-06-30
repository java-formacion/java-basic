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
		f = new Formador("Marta", "Lekue", null);
	}

	@After
	public void tearDown() throws Exception {
		f = null;
	}

	@Test
	public void testConstructor() {
				
		assertEquals("Marta", f.getNombre());
		assertEquals("Lekue", f.getApellido1());
		
		assertNull(f.getCursos());
		assertEquals(0, f.getCursos().size());
		
		
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Curso c = new Curso("789","PHP", 120);
		cursos.add(c);
		f.setCursos(cursos);
		assertNotNull(f.getCursos());
		
		
		
	}
	
	@Test
	public void testConstructorParametros(){
		
		assertNotNull(f);
	}

}