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
	Curso cJava, cPhp, cVisualBasic;
	ArrayList<Curso> lista;
	int totalInicioCursos;
	
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
		
		cJava = new Curso("390","Java", 175);
		cPhp= new Curso("789","PHP", 120);
		cVisualBasic = new Curso("698","Visual Basic", 380);
		
		lista = new ArrayList<Curso>();
		
		lista.add(cJava);
		lista.add(cPhp);
		lista.add(cVisualBasic);
		

		fSinCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		fConCursos = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", lista);
		
		totalInicioCursos = fConCursos.getCursos().size();
		
	}

	//despues de cada test
	@After
	public void tearDown() throws Exception {
		fConCursos = null;
		fSinCursos = null;
		cJava = null;
		cPhp = null;
		cVisualBasic = null;
		lista = null;
		totalInicioCursos = 0;
	}

	
	
	@Test
	public void testConstructorConCursos() {
	
		assertEquals("Marta", fConCursos.getNombre());
		assertEquals("Lekue", fConCursos.getApellido1());
		assertEquals("Arriaga",fConCursos.getApellido2());
		assertEquals("33333333C", fConCursos.getDni());
		assertEquals("marta@gmail.com", fConCursos.getEmail());
		
		assertNotNull(fConCursos.getCursos());
		assertEquals(lista.size(), fConCursos.getCursos().size());
		
		//formador con cursos null
		Formador fCursosNull = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com", null);
		assertEquals(0, fCursosNull.getCursos().size());
		assertNotNull(fCursosNull.getCursos());
		
		
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
	public void testAsignacionCursos() {
		
		fConCursos.asignarCurso(cVisualBasic);
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
		
		Curso cVisual2 = new Curso("698","Visual Basic", 380);
		assertFalse(fConCursos.asignarCurso(cVisual2));
		
	
	}
	

	@Test
	public void testDesasignacionCursos() {
		
		assertTrue(fConCursos.desasignarCurso(cJava));
		ArrayList<Curso> listado = fConCursos.getCursos();
		assertEquals(totalInicioCursos-1 , listado.size());	
		assertEquals("Si borramos el curso no debería existir",-1,listado.indexOf(cJava));
		
	}
	
	@Test
	public void testDesAsigacionCursos2() {
		
		Curso cJavaNuevo = new Curso("390","Java", 175);
		assertTrue( fConCursos.desasignarCurso(cJavaNuevo));
				
		//assertEquals( cJava, cJavaNuevo );
		//assertSame( cJava, cJavaNuevo );
		
		ArrayList<Curso>listado = fConCursos.getCursos();
		assertEquals( totalInicioCursos-1 , listado.size() );		
		assertEquals("Si desasignamo el curso " + cJava + " no deberia existir", -1 ,listado.indexOf(cJava));
		
	}
	
	@Test
	public void testDesasignacionCursosNoExistente() {
	
		assertFalse(fConCursos.desasignarCurso(new Curso("", "", 0)));
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
		
		assertFalse(fConCursos.desasignarCurso(null));
		assertEquals(totalInicioCursos, fConCursos.getCursos().size());
		
		
	}
	
	/*
	
	@Test
	public void testConstructor() {
		
		
	
		assertEquals("Marta", f.getNombre());
		assertEquals("Lekue", f.getApellido1());
		assertEquals("Arriaga", f.getApellido2());
		assertEquals("33333333C", f.getDni());
		assertEquals("marta@gmail.com", f.getEmail());
		
		
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
		
			
	}
	
	@Test
	public void testConstructorParametros() {
		
		
	}
	
	
	@Test
	public void testGestionCursos() {
		
		assertEquals(0, f.getCursos().size());
		
		assertTrue(f.asignarCurso(cJava));
		assertEquals(1, f.getCursos().size());
		assertEquals(cJava, f.getCursos().get(0));
		
		assertTrue(f.asignarCurso(cPhp));
		assertEquals(2, f.getCursos().size());
		assertEquals(cPhp, f.getCursos().get(1));
		
		assertTrue(f.asignarCurso(cVisualBasic));		
		assertEquals(3, f.getCursos().size());
		assertEquals(cVisualBasic, f.getCursos().get(2));
		
		assertTrue(f.desasignarCurso(cPhp));
		assertEquals(2, f.getCursos().size());
		assertEquals(cVisualBasic, f.getCursos().get(1));
		
		assertFalse(f.desasignarCurso(cPhp));
		
		assertTrue(f.desasignarCurso(cVisualBasic));
		assertEquals(1, f.getCursos().size());
		
		assertTrue(f.desasignarCurso(cJava));
		assertEquals(0, f.getCursos().size());
		
		
	}
	
*/
	
	
}
