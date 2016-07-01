package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormadorTest {

	Formador fSinCursos, fconCursos;	
	Curso cJava,cPhP,cAndroid;	
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
		
		cJava = new Curso("jav2857", "Java", 500);
		cPhP = new Curso("php534","PHP",750);
		cAndroid = new Curso("andr34534", "Android", 380);
		
		lista = new ArrayList<Curso>();
		lista.add(cJava);
		lista.add(cPhP);
		lista.add(cAndroid);
				
		fSinCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		fconCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", lista);
		
		totalInicioCursos = fconCursos.getCursos().size();
	}

	@After
	public void tearDown() throws Exception {
		fSinCursos = null;
		fconCursos = null;
		cJava = null;
		cPhP = null;
		cAndroid = null;
		lista=null;
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
		
		
		assertEquals("Marta", fconCursos.getNombre());
		assertEquals("Lekue", fconCursos.getApellido1());
		assertEquals("Arriaga", fconCursos.getApellido2());
		assertEquals("33333333C", fconCursos.getDni());
		assertEquals("marta@gmail.com", fconCursos.getEmail());

		assertNotNull(fconCursos.getCursos());
		assertEquals( lista.size() , fconCursos.getCursos().size());
		
		//formador con cursos null
		Formador fCursosNull = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", null );
		assertNotNull(fCursosNull.getCursos());
		assertEquals( 0 , fCursosNull.getCursos().size() );

		
	}
	
	
	@Test
	public void testAsigancionCursos() {
						
		fconCursos.asignarCurso(cAndroid);
		assertEquals( totalInicioCursos , fconCursos.getCursos().size() );
		
		Curso cAndroidBis = new Curso("andr34534", "Android", 380);
		assertFalse ( fconCursos.asignarCurso(cAndroidBis));
		
			
	}
	
	@Test
	public void testDesAsigacionCursos() {
				
		assertTrue( fconCursos.desAsignarCurso(cJava));
		ArrayList<Curso>listado = fconCursos.getCursos();
		assertEquals( totalInicioCursos-1 , listado.size() );		
		assertEquals("Si desasignamo el curso " + cJava + " no deberia existir", -1 ,listado.indexOf(cJava));
		
	}
	
	@Test
	public void testDesAsigacionCursos2() {
		
		Curso cJavaBis = new Curso("jav2857", "Java", 500);
		assertTrue( fconCursos.desAsignarCurso(cJavaBis));
				
		/*
		assertEquals( cJava, cJavaBis );
		assertSame( cJava, cJavaBis );
		*/
		
		ArrayList<Curso>listado = fconCursos.getCursos();
		assertEquals( totalInicioCursos-1 , listado.size() );		
		assertEquals("Si desasignamo el curso " + cJava + " no deberia existir", -1 ,listado.indexOf(cJava));
		
	}
	
	
	
	@Test
	public void testDesAsigacionCursoNoExistente() {
	
		assertFalse( fconCursos.desAsignarCurso( new Curso("", "", 0 ) ));
		assertEquals( totalInicioCursos , fconCursos.getCursos().size() );
		
		assertFalse( fconCursos.desAsignarCurso( null ));
		assertEquals( totalInicioCursos , fconCursos.getCursos().size() );
		
		
	}
	
	
	
	
}