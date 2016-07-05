package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class FormadorTest {

		
	Formador fSinCursos, fconCursos;
	Curso cJava, cPhP, cAndroid;
	ArrayList<Curso> lista; 
	int TotalInicioCursos;
	
	
	
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
		
		
		lista =  new ArrayList<Curso>();
		lista.add(cJava);
		lista.add(cPhP);
		lista.add(cAndroid);
		
		
		fSinCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		fconCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", lista);
		cJava = new Curso("jav2857","Java", 500);
		cPhP = new Curso("pjhp534","PHP", 750);
		cAndroid = new Curso("andr34534","Android", 380);
		
		//Se le asigna a la variable total de cursos el curso y el numero de curso
		
		TotalInicioCursos = fconCursos.getCursos().size();
		
	}

	@After
	public void tearDown() throws Exception {
		fSinCursos = null;
		fconCursos = null;
		cJava = null;
		cPhP = null;
		cAndroid = null;
		lista=null;
		TotalInicioCursos = 0;
	}

	
	@Test
	public void testConstructorSinCursos() {
		
		assertEquals("Marta", fSinCursos.getNombre());
		assertEquals("Lekue", fSinCursos.getApellido1());
		assertEquals("Arriaga",fSinCursos.getApellido2());
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
			assertEquals( TotalInicioCursos+1 , fconCursos.getCursos().size() );
			
				
		}
		
		@Test
		public void testDesAsigacionCursos() {
					
			assertTrue( fconCursos.desAsignarCurso(cJava));
			ArrayList<Curso>listado = fconCursos.getCursos();
			assertEquals( TotalInicioCursos-1 , listado.size() );		
			assertEquals("Si desasignamo el curso " + cJava + " no deberia existir", -1 ,listado.indexOf(cJava));
			
		}
		
		@Test
		public void testDesAsigacionCursos2() {
			
			Curso cJavaNuevo = new Curso("jav2857", "Java", 500);
			assertTrue( fconCursos.desAsignarCurso(cJavaNuevo));
					
			assertEquals( cJava, cJavaNuevo );
			assertSame( cJava, cJavaNuevo );
			
			ArrayList<Curso>listado = fconCursos.getCursos();
			assertEquals( TotalInicioCursos-1 , listado.size() );		
			assertEquals("Si desasignamo el curso " + cJava + " no deberia existir", -1 ,listado.indexOf(cJava));
			
		}
		
		
		
		@Test
		public void testDesAsigacionCursoNoExistente() {
		
			assertFalse( fconCursos.desAsignarCurso( new Curso("", "", 0 ) ));
			assertEquals( TotalInicioCursos , fconCursos.getCursos().size() );
			
			assertFalse( fconCursos.desAsignarCurso( null ));
			assertEquals( TotalInicioCursos , fconCursos.getCursos().size() );
			
			
		}

		
	

}
