package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {

	//Estas funciones son de una clase Test que sera eliminada
			/*@BeforeClass
			public static void setUpBeforeClass() throws Exception {
				f1 = new Formador();
			}

			@AfterClass
			public static void tearDownAfterClass() throws Exception {
				f1 = null;
			}

			@Before
			public void setUp() throws Exception {
			}

			@After
			public void tearDown() throws Exception {
			}*/
	
	@Test
	public void testPersona() {
		Candidato c1 = new Candidato();

		c1.setNombre("paco");
		c1.setApellido1("jimenez");
		c1.setApellido2("simple");
		c1.setDni("87433912A");
		c1.setEmail("Paco@hotmail.com");
		c1.setNota(11);
		assertEquals("Paco", c1.getNombre());
		assertEquals("Jimenez", c1.getApellido1());
		assertEquals("Simple", c1.getApellido2());
		assertTrue(c1.isAceptado());
		c1.setNota(-1);
		assertFalse(c1.isAceptado());
		c1.setNota(5);
		assertTrue(c1.isAceptado());
		c1.setNota(7);
		assertTrue(c1.isAceptado());
		c1.setNota(4);
		assertFalse(c1.isAceptado());
		
		Formador f1 = new Formador();
		f1.setNombre("Ander");
		f1.setApellido1("Uraga");
		f1.setApellido2("qoewjdf");
		f1.setDni("12345678A");
		f1.setEmail("ander@gmail.com");
		
		assertNotNull(f1.getCursos());
		assertEquals(0, f1.getCursos().size());
		
	}

}
