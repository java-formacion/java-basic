package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {
	Curso cJava = new Curso("001", "Java", 500);
	Curso cPhp= new Curso("002", "Php", 400);
	Curso cVisualBasic= new Curso("003", "Vba", 300);
	
	Formador fCursos, fNoCursos;
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Formador fCursos = new Formador("Marta", "33333333C", " arrIAga", "dsfsadfds");
		
		
		
		cursos.add(cJava);
		cursos.add(cPhp);
		cursos.add(cVisualBasic);
		cursos.add(null);
		fCursos.setCursoAsg(cursos);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		assertEquals("Marta", fCursos.getNombre());
		assertEquals("Arriaga", fCursos.obtenerApellido1());
		assertEquals("33333333C", fCursos.obtenerDNI());



		
		assertNotNull(fCursos.getCursos());

		assertEquals("", fCursos.getCursos().get(fCursos.getCursos().size()-1).getCodigo());
		assertEquals(cJava.getCodigo(), fCursos.getCursos().get(0).getCodigo());
		assertEquals(cJava.getNombre(), fCursos.getCursos().get(0).getNombre());
		
		 
		
		fCursos.desasignarCurso(cPhp);
		assertEquals("Vba", fCursos.getCursos().get(1).getNombre());

		
	}

}
