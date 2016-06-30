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
	Curso cJava, cAndroid,cVisualBasic;
	ArrayList<Curso> lCursos;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {

		f = new Formador("ANGEL", "AngelEs", "Angelico", "77777777L", "angel@kkfonica");
	}

	@After
	public void tearDown() throws Exception {

		f = null;
	}
	
	@Test
	public void testConstructor() {
		
		
	}
	

	@Test
	public void testConstructorParametros() {

		Curso cursoJava = new Curso("5865", "Curso de JAVA", 125);
		Curso cursoAndroid = new Curso("5867", "Curso de Android", 150);
		ArrayList<Curso> aCursos = new ArrayList<Curso>();
		aCursos.add(cursoJava);
		aCursos.add(cursoAndroid);
		Formador f = new Formador("ANGEL", "AngelEs", "Angelico", "77777777L", "angel@kkfonica", aCursos);
		Formador fVacio = new Formador("paco", "piz", "pos", "88888888S", "lolo@lololo.com");

		assertEquals("Angel", f.getNom());
		assertEquals("Angeles", f.getApell1());
		assertEquals("Angelico", f.getApell2());
		assertEquals("77777777L", f.getDni());
		assertEquals("angel@kkfonica", f.getEmail());
		assertNotNull(f.getCursos());
		assertEquals(0, fVacio.getCursos().size());

		f.setNom("Manolo");
		f.setApell1("El del");
		f.setApell2("Bombo");
		f.setDni("55555555T");
		f.setEmail("spain@isdiferent.com");

		assertEquals("Manolo", f.getNom());
		assertEquals("El Del", f.getApell1());
		assertEquals("Bombo", f.getApell2());
		assertEquals("55555555T", f.getDni());
		assertEquals("spain@isdiferent.com", f.getEmail());

		// assertEquals("",((Curso)f.getCursos()).getCodigo());

	}

}
