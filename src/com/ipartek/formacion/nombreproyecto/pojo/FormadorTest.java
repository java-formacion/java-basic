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
		
		assertNotNull(f.getCursos());
		//assertEquals(0, f.getCursos().size());
		
		//probar dos constructores
		//probar asignar curso y desasignar curso
		//Asignar cJava, cPhp, cVB e ir viendo la longitud
		//Desasignar cJava, cPhp, cVB e ir viendo la longitud
		assertEquals(0, listaCursos.size());
		
		
		
	}
	
	@Test
	public void testConstructorParametros(){
		
		assertNotNull(f);
	}

}