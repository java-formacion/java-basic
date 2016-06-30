package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void testPersona() {
		Candidato c1 = new Candidato();

		c1.setNombre("Paco");
		c1.setApellido1("Jímenez");
		c1.setApellido2("Simple");
		c1.setDni("87433912A");
		c1.setEmail("Paco@hotmail.com");
		c1.setNota(11);
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
		
		ArrayList listaCursos = new ArrayList();
		listaCursos.add("Java");
		listaCursos.add("PHP");
		f1.setCursos(listaCursos);
		assertEquals("Java", listaCursos.get(0));
		assertEquals("PHP", listaCursos.get(1));
	}

}
